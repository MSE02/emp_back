package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Contrat;
import ma.sir.rh.bean.history.ContratHistory;
import ma.sir.rh.dao.criteria.core.ContratCriteria;
import ma.sir.rh.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.rh.dao.facade.core.ContratDao;
import ma.sir.rh.dao.facade.history.ContratHistoryDao;
import ma.sir.rh.dao.specification.core.ContratSpecification;
import ma.sir.rh.service.facade.admin.ContratAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.TypeContratAdminService ;
import ma.sir.rh.service.facade.admin.EmployeeAdminService ;


import java.util.List;
@Service
public class ContratAdminServiceImpl extends AbstractServiceImpl<Contrat,ContratHistory, ContratCriteria, ContratHistoryCriteria, ContratDao,
ContratHistoryDao> implements ContratAdminService {


    public Contrat findByReferenceEntity(Contrat t){
        return  dao.findByCode(t.getCode());
    }

    public List<Contrat> findByEmployeeId(Long id){
        return dao.findByEmployeeId(id);
    }
    public int deleteByEmployeeId(Long id){
        return dao.deleteByEmployeeId(id);
    }
    public List<Contrat> findByTypeContratId(Long id){
        return dao.findByTypeContratId(id);
    }
    public int deleteByTypeContratId(Long id){
        return dao.deleteByTypeContratId(id);
    }



    public void configure() {
        super.configure(Contrat.class,ContratHistory.class, ContratHistoryCriteria.class, ContratSpecification.class);
    }

    @Autowired
    private TypeContratAdminService typeContratService ;
    @Autowired
    private EmployeeAdminService employeeService ;

    public ContratAdminServiceImpl(ContratDao dao, ContratHistoryDao historyDao) {
        super(dao, historyDao);
    }

}