package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Employee;
import ma.sir.rh.bean.core.Pointage;
import ma.sir.rh.bean.history.PointageHistory;
import ma.sir.rh.dao.criteria.core.PointageCriteria;
import ma.sir.rh.dao.criteria.history.PointageHistoryCriteria;
import ma.sir.rh.dao.facade.core.EmployeeDao;
import ma.sir.rh.dao.facade.core.PointageDao;
import ma.sir.rh.dao.facade.history.PointageHistoryDao;
import ma.sir.rh.dao.specification.core.PointageSpecification;
import ma.sir.rh.service.facade.admin.PointageAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PointageAdminServiceImpl extends AbstractServiceImpl<Pointage, PointageHistory, PointageCriteria, PointageHistoryCriteria, PointageDao,
        PointageHistoryDao> implements PointageAdminService {


    @Autowired
    private EmployeeDao employeeService;
     // Variable de classe pour stocker la liste
    private LocalDate currentDate; // Variable de classe pour stocker la date actuelle

    public PointageAdminServiceImpl(PointageDao dao, PointageHistoryDao historyDao) {
        super(dao, historyDao);
    }

    public Pointage findByReferenceEntity(Pointage t) {
        return dao.findByCode(t.getCode());
    }

    public List<Pointage> findByEmployeeId(Long id) {
        return dao.findByEmployeeId(id);
    }

    public int deleteByEmployeeId(Long id) {
        return dao.deleteByEmployeeId(id);
    }

    @Override
    public List<Employee> getEmployeesWithNoPointage() {
        LocalDate today = LocalDate.now();
        List<Employee> employeesWithNoPointage = new ArrayList<>();
        if (employeesWithNoPointage == null || !today.equals(currentDate)) {
            employeesWithNoPointage = new ArrayList<>();
            currentDate = today;
        } else {
            employeesWithNoPointage.clear();
        }

        List<Employee> allEmployees = employeeService.findAll();

        for (Employee employee : allEmployees) {
            List<Pointage> pointages = findByEmployeeId(employee.getId());
            if (pointages.isEmpty() || !hasPointageToday(pointages)) {
                employeesWithNoPointage.add(employee);
            }
        }

        return employeesWithNoPointage;
    }

    private boolean hasPointageToday(List<Pointage> pointages) {
        LocalDate today = LocalDate.now();
        for (Pointage pointage : pointages) {
            LocalDateTime heureArrive = pointage.getHeureArrive();
            LocalDate pointageDate = heureArrive.toLocalDate();
            if (pointageDate.equals(today)) {
                return true;
            }
        }
        return false;
    }

    public void configure() {
        super.configure(Pointage.class, PointageHistory.class, PointageHistoryCriteria.class, PointageSpecification.class);
    }

}