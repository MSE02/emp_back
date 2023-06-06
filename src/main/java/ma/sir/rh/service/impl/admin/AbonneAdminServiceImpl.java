package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Abonne;
import ma.sir.rh.bean.history.AbonneHistory;
import ma.sir.rh.dao.criteria.core.AbonneCriteria;
import ma.sir.rh.dao.criteria.history.AbonneHistoryCriteria;
import ma.sir.rh.dao.facade.core.AbonneDao;
import ma.sir.rh.dao.facade.history.AbonneHistoryDao;
import ma.sir.rh.dao.specification.core.AbonneSpecification;
import ma.sir.rh.service.facade.admin.AbonneAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AbonneAdminServiceImpl extends AbstractServiceImpl<Abonne,AbonneHistory, AbonneCriteria, AbonneHistoryCriteria, AbonneDao,
AbonneHistoryDao> implements AbonneAdminService {


    public Abonne findByReferenceEntity(Abonne t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Abonne.class,AbonneHistory.class, AbonneHistoryCriteria.class, AbonneSpecification.class);
    }


    public AbonneAdminServiceImpl(AbonneDao dao, AbonneHistoryDao historyDao) {
        super(dao, historyDao);
    }

}