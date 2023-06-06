package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EmployeeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeHistoryDao extends AbstractHistoryRepository<EmployeeHistory,Long> {

}
