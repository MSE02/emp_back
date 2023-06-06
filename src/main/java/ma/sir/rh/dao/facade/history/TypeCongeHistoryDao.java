package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.TypeCongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCongeHistoryDao extends AbstractHistoryRepository<TypeCongeHistory,Long> {

}
