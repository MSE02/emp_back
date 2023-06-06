package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.TypeContrat;
import ma.sir.rh.bean.history.TypeContratHistory;
import ma.sir.rh.dao.criteria.core.TypeContratCriteria;
import ma.sir.rh.dao.criteria.history.TypeContratHistoryCriteria;
import ma.sir.rh.dao.facade.core.TypeContratDao;
import ma.sir.rh.dao.facade.history.TypeContratHistoryDao;
import ma.sir.rh.dao.specification.core.TypeContratSpecification;
import ma.sir.rh.service.facade.admin.TypeContratAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeContratAdminServiceImpl extends AbstractServiceImpl<TypeContrat,TypeContratHistory, TypeContratCriteria, TypeContratHistoryCriteria, TypeContratDao,
TypeContratHistoryDao> implements TypeContratAdminService {


    public TypeContrat findByReferenceEntity(TypeContrat t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeContrat.class,TypeContratHistory.class, TypeContratHistoryCriteria.class, TypeContratSpecification.class);
    }


    public TypeContratAdminServiceImpl(TypeContratDao dao, TypeContratHistoryDao historyDao) {
        super(dao, historyDao);
    }

}