package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.PayementSalaire;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.PayementSalaire;
import java.util.List;


@Repository
public interface PayementSalaireDao extends AbstractRepository<PayementSalaire,Long>  {
    PayementSalaire findByCode(String code);
    int deleteByCode(String code);

    List<PayementSalaire> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);

    @Query("SELECT NEW PayementSalaire(item.id,item.code) FROM PayementSalaire item")
    List<PayementSalaire> findAllOptimized();
}
