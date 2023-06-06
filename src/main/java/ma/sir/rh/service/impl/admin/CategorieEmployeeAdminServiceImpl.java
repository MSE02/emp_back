package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.CategorieEmployee;
import ma.sir.rh.bean.history.CategorieEmployeeHistory;
import ma.sir.rh.dao.criteria.core.CategorieEmployeeCriteria;
import ma.sir.rh.dao.criteria.history.CategorieEmployeeHistoryCriteria;
import ma.sir.rh.dao.facade.core.CategorieEmployeeDao;
import ma.sir.rh.dao.facade.history.CategorieEmployeeHistoryDao;
import ma.sir.rh.dao.specification.core.CategorieEmployeeSpecification;
import ma.sir.rh.service.facade.admin.CategorieEmployeeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class CategorieEmployeeAdminServiceImpl extends AbstractServiceImpl<CategorieEmployee,CategorieEmployeeHistory, CategorieEmployeeCriteria, CategorieEmployeeHistoryCriteria, CategorieEmployeeDao,
CategorieEmployeeHistoryDao> implements CategorieEmployeeAdminService {


    public CategorieEmployee findByReferenceEntity(CategorieEmployee t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(CategorieEmployee.class,CategorieEmployeeHistory.class, CategorieEmployeeHistoryCriteria.class, CategorieEmployeeSpecification.class);
    }


    public CategorieEmployeeAdminServiceImpl(CategorieEmployeeDao dao, CategorieEmployeeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}