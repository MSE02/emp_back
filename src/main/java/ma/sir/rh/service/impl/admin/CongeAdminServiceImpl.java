package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Conge;
import ma.sir.rh.bean.history.CongeHistory;
import ma.sir.rh.dao.criteria.core.CongeCriteria;
import ma.sir.rh.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.rh.dao.facade.core.CongeDao;
import ma.sir.rh.dao.facade.history.CongeHistoryDao;
import ma.sir.rh.dao.specification.core.CongeSpecification;
import ma.sir.rh.service.facade.admin.CongeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.TypeCongeAdminService ;
import ma.sir.rh.service.facade.admin.EmployeeAdminService ;


import java.util.List;
@Service
public class CongeAdminServiceImpl extends AbstractServiceImpl<Conge,CongeHistory, CongeCriteria, CongeHistoryCriteria, CongeDao,
CongeHistoryDao> implements CongeAdminService {


    public Conge findByReferenceEntity(Conge t){
        return  dao.findByCode(t.getCode());
    }

    public List<Conge> findByTypeCongeId(Long id){
        return dao.findByTypeCongeId(id);
    }
    public int deleteByTypeCongeId(Long id){
        return dao.deleteByTypeCongeId(id);
    }
    public List<Conge> findByEmployeeId(Long id){
        return dao.findByEmployeeId(id);
    }
    public int deleteByEmployeeId(Long id){
        return dao.deleteByEmployeeId(id);
    }



    public void configure() {
        super.configure(Conge.class,CongeHistory.class, CongeHistoryCriteria.class, CongeSpecification.class);
    }

    @Autowired
    private TypeCongeAdminService typeCongeService ;
    @Autowired
    private EmployeeAdminService employeeService ;

    public CongeAdminServiceImpl(CongeDao dao, CongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}