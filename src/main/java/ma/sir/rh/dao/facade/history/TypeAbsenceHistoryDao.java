package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.TypeAbsenceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAbsenceHistoryDao extends AbstractHistoryRepository<TypeAbsenceHistory,Long> {

}
