package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Conge;
import ma.sir.rh.dao.criteria.core.CongeCriteria;
import ma.sir.rh.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface CongeAdminService extends  IService<Conge,CongeCriteria, CongeHistoryCriteria>  {

    List<Conge> findByTypeCongeId(Long id);
    int deleteByTypeCongeId(Long id);
    List<Conge> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);



}
