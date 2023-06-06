package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.CategorieEmployeeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieEmployeeHistoryDao extends AbstractHistoryRepository<CategorieEmployeeHistory,Long> {

}
