package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.AbsenceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsenceHistoryDao extends AbstractHistoryRepository<AbsenceHistory,Long> {

}
