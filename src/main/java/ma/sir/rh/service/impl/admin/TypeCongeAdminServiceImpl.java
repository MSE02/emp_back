package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.TypeConge;
import ma.sir.rh.bean.history.TypeCongeHistory;
import ma.sir.rh.dao.criteria.core.TypeCongeCriteria;
import ma.sir.rh.dao.criteria.history.TypeCongeHistoryCriteria;
import ma.sir.rh.dao.facade.core.TypeCongeDao;
import ma.sir.rh.dao.facade.history.TypeCongeHistoryDao;
import ma.sir.rh.dao.specification.core.TypeCongeSpecification;
import ma.sir.rh.service.facade.admin.TypeCongeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeCongeAdminServiceImpl extends AbstractServiceImpl<TypeConge,TypeCongeHistory, TypeCongeCriteria, TypeCongeHistoryCriteria, TypeCongeDao,
TypeCongeHistoryDao> implements TypeCongeAdminService {


    public TypeConge findByReferenceEntity(TypeConge t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeConge.class,TypeCongeHistory.class, TypeCongeHistoryCriteria.class, TypeCongeSpecification.class);
    }


    public TypeCongeAdminServiceImpl(TypeCongeDao dao, TypeCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}