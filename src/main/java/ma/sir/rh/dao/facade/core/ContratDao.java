package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Contrat;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Contrat;
import java.util.List;


@Repository
public interface ContratDao extends AbstractRepository<Contrat,Long>  {
    Contrat findByCode(String code);
    int deleteByCode(String code);

    List<Contrat> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);
    List<Contrat> findByTypeContratId(Long id);
    int deleteByTypeContratId(Long id);

    @Query("SELECT NEW Contrat(item.id,item.code) FROM Contrat item")
    List<Contrat> findAllOptimized();
}
