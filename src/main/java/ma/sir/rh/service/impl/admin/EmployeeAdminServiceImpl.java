package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Absence;
import ma.sir.rh.bean.core.Conge;
import ma.sir.rh.bean.core.Employee;
import ma.sir.rh.bean.history.EmployeeHistory;
import ma.sir.rh.dao.criteria.core.EmployeeCriteria;
import ma.sir.rh.dao.criteria.history.EmployeeHistoryCriteria;
import ma.sir.rh.dao.facade.core.EmployeeDao;
import ma.sir.rh.dao.facade.history.EmployeeHistoryDao;
import ma.sir.rh.dao.specification.core.EmployeeSpecification;
import ma.sir.rh.service.facade.admin.*;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeAdminServiceImpl extends AbstractServiceImpl<Employee, EmployeeHistory, EmployeeCriteria, EmployeeHistoryCriteria, EmployeeDao,
        EmployeeHistoryDao> implements EmployeeAdminService {


    private final JavaMailSenderImpl mailSender;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Employee create(Employee t) {
        if (findByCode(t.getCode()) != null) {
            return null;
        }

        super.create(t);

        if (t.getAbsences() != null) {
            t.getAbsences().forEach(element -> {
                element.setEmployee(t);
                absenceService.create(element);
            });
        }

        if (t.getConges() != null) {
            t.getConges().forEach(element -> {
                element.setEmployee(t);
                congeService.create(element);
            });
        }

        return t;
    }

    @Override
    public void sendEmailAbsence(Employee employee) {
        List<Absence> absences = employee.getAbsences();
        for (Absence absence : absences) {
            if (absence.getDuree() >= 3) {
                sendEmail(employee);
            }
        }
    }

    void sendEmail(Employee employee) {
        if (findByCode(employee.getCode()) != null) {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            String body = "Dear " + employee.getNom() + " " + employee.getPrenom() + "." + "\n\nThis is to inform you that you have been absent for "+calculateDaysAbsent(employee)+" days.\n\nPlease contact your supervisor or manager for further assistance.\n\nBest regards,\nThe HR Team";
            String subject = "Absence Notification";
            simpleMailMessage.setFrom("moha2000mse@gmail.com");
            simpleMailMessage.setText(body);
            simpleMailMessage.setSubject(subject);
            simpleMailMessage.setTo(employee.getEmail());
            this.mailSender.send(simpleMailMessage);
        }
    }

    public Integer calculateDaysAbsent(Employee employee) {
        Integer days = 0;
        List<Absence> absences = employee.getAbsences();
        if (absences != null && !absences.isEmpty()) {
            for (Absence absence : absences) {
                days += absence.getDuree();
            }
        }
        return days;
    }



    public Employee findWithAssociatedLists(Long id) {
        Employee result = dao.findById(id).orElse(null);
        if (result != null && result.getId() != null) {
            result.setAbsences(absenceService.findByEmployeeId(id));
            result.setConges(congeService.findByEmployeeId(id));
        }
        return result;
    }

    @Transactional
    public void deleteAssociatedLists(Long id) {
        absenceService.deleteByEmployeeId(id);
        congeService.deleteByEmployeeId(id);
    }


    public void updateWithAssociatedLists(Employee employee) {
        if (employee != null && employee.getId() != null) {
            List<List<Absence>> resultAbsences = absenceService.getToBeSavedAndToBeDeleted(absenceService.findByEmployeeId(employee.getId()), employee.getAbsences());
            absenceService.delete(resultAbsences.get(1));
            ListUtil.emptyIfNull(resultAbsences.get(0)).forEach(e -> e.setEmployee(employee));
            absenceService.update(resultAbsences.get(0), true);
            List<List<Conge>> resultConges = congeService.getToBeSavedAndToBeDeleted(congeService.findByEmployeeId(employee.getId()), employee.getConges());
            congeService.delete(resultConges.get(1));
            ListUtil.emptyIfNull(resultConges.get(0)).forEach(e -> e.setEmployee(employee));
            congeService.update(resultConges.get(0), true);
        }
    }

    public Employee findByReferenceEntity(Employee t) {
        return dao.findByCode(t.getCode());
    }

    public List<Employee> findByContratId(Long id) {
        return dao.findByContratId(id);
    }

    public int deleteByContratId(Long id) {
        return dao.deleteByContratId(id);
    }

    public Employee findByCode(String code) {
        return dao.findByCode(code);
    }

    public List<Employee> findByUniteAdministrativeId(Long id) {
        return dao.findByUniteAdministrativeId(id);
    }

    public int deleteByUniteAdministrativeId(Long id) {
        return dao.deleteByUniteAdministrativeId(id);
    }

    public List<Employee> findByCategorieEmployeeId(Long id) {
        return dao.findByCategorieEmployeeId(id);
    }

    public int deleteByCategorieEmployeeId(Long id) {
        return dao.deleteByCategorieEmployeeId(id);
    }


    public void configure() {
        super.configure(Employee.class, EmployeeHistory.class, EmployeeHistoryCriteria.class, EmployeeSpecification.class);
    }

    @Autowired
    private UniteAdministrativeAdminService uniteAdministrativeService;
    @Autowired
    private CategorieEmployeeAdminService categorieEmployeeService;
    @Autowired
    private AbsenceAdminService absenceService;
    @Autowired
    private CongeAdminService congeService;
    @Autowired
    private ContratAdminService contratService;
    ;

    public EmployeeAdminServiceImpl(EmployeeDao dao, EmployeeHistoryDao historyDao, JavaMailSenderImpl mailSender) {
        super(dao, historyDao);
        this.mailSender = mailSender;
    }

}