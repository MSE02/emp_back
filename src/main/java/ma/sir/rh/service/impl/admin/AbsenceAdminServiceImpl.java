package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Absence;
import ma.sir.rh.bean.history.AbsenceHistory;
import ma.sir.rh.dao.criteria.core.AbsenceCriteria;
import ma.sir.rh.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.rh.dao.facade.core.AbsenceDao;
import ma.sir.rh.dao.facade.history.AbsenceHistoryDao;
import ma.sir.rh.dao.specification.core.AbsenceSpecification;
import ma.sir.rh.service.facade.admin.AbsenceAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.TypeAbsenceAdminService ;
import ma.sir.rh.service.facade.admin.EmployeeAdminService ;


import java.util.List;
@Service
public class AbsenceAdminServiceImpl extends AbstractServiceImpl<Absence,AbsenceHistory, AbsenceCriteria, AbsenceHistoryCriteria, AbsenceDao,
AbsenceHistoryDao> implements AbsenceAdminService {



    public List<Absence> findByTypeAbsenceId(Long id){
        return dao.findByTypeAbsenceId(id);
    }
    public int deleteByTypeAbsenceId(Long id){
        return dao.deleteByTypeAbsenceId(id);
    }
    public List<Absence> findByEmployeeId(Long id){
        return dao.findByEmployeeId(id);
    }
    public int deleteByEmployeeId(Long id){
        return dao.deleteByEmployeeId(id);
    }

    public void configure() {
        super.configure(Absence.class,AbsenceHistory.class, AbsenceHistoryCriteria.class, AbsenceSpecification.class);
    }

    @Autowired
    private TypeAbsenceAdminService typeAbsenceService ;
    @Autowired
    private EmployeeAdminService employeeService ;

    public AbsenceAdminServiceImpl(AbsenceDao dao, AbsenceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}