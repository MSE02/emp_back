package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Contrat;
import ma.sir.rh.dao.criteria.core.ContratCriteria;
import ma.sir.rh.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface ContratAdminService extends  IService<Contrat,ContratCriteria, ContratHistoryCriteria>  {

    List<Contrat> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);
    List<Contrat> findByTypeContratId(Long id);

    int deleteByTypeContratId(Long id);



}
