package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.ContratHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratHistoryDao extends AbstractHistoryRepository<ContratHistory,Long> {

}
