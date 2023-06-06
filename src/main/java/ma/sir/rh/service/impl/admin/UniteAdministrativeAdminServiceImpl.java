package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.UniteAdministrative;
import ma.sir.rh.bean.history.UniteAdministrativeHistory;
import ma.sir.rh.dao.criteria.core.UniteAdministrativeCriteria;
import ma.sir.rh.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.sir.rh.dao.facade.core.UniteAdministrativeDao;
import ma.sir.rh.dao.facade.history.UniteAdministrativeHistoryDao;
import ma.sir.rh.dao.specification.core.UniteAdministrativeSpecification;
import ma.sir.rh.service.facade.admin.UniteAdministrativeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class UniteAdministrativeAdminServiceImpl extends AbstractServiceImpl<UniteAdministrative,UniteAdministrativeHistory, UniteAdministrativeCriteria, UniteAdministrativeHistoryCriteria, UniteAdministrativeDao,
UniteAdministrativeHistoryDao> implements UniteAdministrativeAdminService {


    public UniteAdministrative findByReferenceEntity(UniteAdministrative t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(UniteAdministrative.class,UniteAdministrativeHistory.class, UniteAdministrativeHistoryCriteria.class, UniteAdministrativeSpecification.class);
    }


    public UniteAdministrativeAdminServiceImpl(UniteAdministrativeDao dao, UniteAdministrativeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}