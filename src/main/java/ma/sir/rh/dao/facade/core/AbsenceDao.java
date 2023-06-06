package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Absence;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AbsenceDao extends AbstractRepository<Absence,Long>  {

    List<Absence> findByTypeAbsenceId(Long id);
    int deleteByTypeAbsenceId(Long id);
    List<Absence> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);

}
