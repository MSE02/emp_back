package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.PayementSalaireHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PayementSalaireHistoryDao extends AbstractHistoryRepository<PayementSalaireHistory,Long> {

}
