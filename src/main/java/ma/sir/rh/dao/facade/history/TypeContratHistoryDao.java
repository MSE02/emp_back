package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.TypeContratHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeContratHistoryDao extends AbstractHistoryRepository<TypeContratHistory,Long> {

}
