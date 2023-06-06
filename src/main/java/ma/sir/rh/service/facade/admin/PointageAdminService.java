package ma.sir.rh.service.facade.admin;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import ma.sir.rh.bean.core.Employee;
import ma.sir.rh.bean.core.Pointage;
import ma.sir.rh.dao.criteria.core.PointageCriteria;
import ma.sir.rh.dao.criteria.history.PointageHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface PointageAdminService extends  IService<Pointage,PointageCriteria, PointageHistoryCriteria>  {

    List<Pointage> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);
    List<Employee> getEmployeesWithNoPointage() ;




    }
