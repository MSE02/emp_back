package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Employee;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Employee;
import java.util.List;


@Repository
public interface EmployeeDao extends AbstractRepository<Employee,Long>  {
    Employee findByCode(String code);
    int deleteByCode(String code);

    List<Employee> findByContratId(Long id);
    int deleteByContratId(Long id);
    List<Employee> findByUniteAdministrativeId(Long id);
    int deleteByUniteAdministrativeId(Long id);
    List<Employee> findByCategorieEmployeeId(Long id);
    int deleteByCategorieEmployeeId(Long id);

    @Query("SELECT NEW Employee(item.id,item.code) FROM Employee item")
    List<Employee> findAllOptimized();
}
