package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Employee;
import ma.sir.rh.dao.criteria.core.EmployeeCriteria;
import ma.sir.rh.dao.criteria.history.EmployeeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface EmployeeAdminService extends  IService<Employee,EmployeeCriteria, EmployeeHistoryCriteria>  {

    List<Employee> findByContratId(Long id);
    Employee findByCode(String code);
    void sendEmailAbsence(Employee employee);
    int deleteByContratId(Long id);
    List<Employee> findByUniteAdministrativeId(Long id);
    int deleteByUniteAdministrativeId(Long id);
    List<Employee> findByCategorieEmployeeId(Long id);
    int deleteByCategorieEmployeeId(Long id);
}
