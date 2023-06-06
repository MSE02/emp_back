package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Absence;
import ma.sir.rh.dao.criteria.core.AbsenceCriteria;
import ma.sir.rh.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface AbsenceAdminService extends  IService<Absence,AbsenceCriteria, AbsenceHistoryCriteria>  {

    List<Absence> findByTypeAbsenceId(Long id);
    int deleteByTypeAbsenceId(Long id);
    List<Absence> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);



}
