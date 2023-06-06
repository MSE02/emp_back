package ma.sir.rh.dao.facade.core;

import ma.sir.rh.bean.core.Pointage;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface PointageDao extends AbstractRepository<Pointage, Long> {
    Pointage findByCode(String code);

    int deleteByCode(String code);

    List<Pointage> findByEmployeeId(Long id);

    int deleteByEmployeeId(Long id);

    @Query("SELECT NEW Pointage(item.id,item.code) FROM Pointage item")
    List<Pointage> findAllOptimized();
}
