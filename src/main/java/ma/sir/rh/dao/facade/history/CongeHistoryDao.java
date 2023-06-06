package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.CongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CongeHistoryDao extends AbstractHistoryRepository<CongeHistory,Long> {

}
