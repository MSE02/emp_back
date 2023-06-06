package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.PayementSalaire;
import ma.sir.rh.dao.criteria.core.PayementSalaireCriteria;
import ma.sir.rh.dao.criteria.history.PayementSalaireHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface PayementSalaireAdminService extends  IService<PayementSalaire,PayementSalaireCriteria, PayementSalaireHistoryCriteria>  {

    List<PayementSalaire> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);
    //PayementSalaire create(PayementSalaire payementSalaire);

}
