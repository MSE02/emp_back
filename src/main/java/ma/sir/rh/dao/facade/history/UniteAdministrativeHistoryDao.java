package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.UniteAdministrativeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface UniteAdministrativeHistoryDao extends AbstractHistoryRepository<UniteAdministrativeHistory,Long> {

}
