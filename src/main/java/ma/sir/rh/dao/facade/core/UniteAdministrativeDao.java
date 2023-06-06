package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.UniteAdministrative;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.UniteAdministrative;
import java.util.List;


@Repository
public interface UniteAdministrativeDao extends AbstractRepository<UniteAdministrative,Long>  {
    UniteAdministrative findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW UniteAdministrative(item.id,item.libelle) FROM UniteAdministrative item")
    List<UniteAdministrative> findAllOptimized();
}
