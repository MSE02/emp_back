package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.PointageHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PointageHistoryDao extends AbstractHistoryRepository<PointageHistory,Long> {

}
