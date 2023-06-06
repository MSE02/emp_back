package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.TypeAbsence;
import ma.sir.rh.bean.history.TypeAbsenceHistory;
import ma.sir.rh.dao.criteria.core.TypeAbsenceCriteria;
import ma.sir.rh.dao.criteria.history.TypeAbsenceHistoryCriteria;
import ma.sir.rh.dao.facade.core.TypeAbsenceDao;
import ma.sir.rh.dao.facade.history.TypeAbsenceHistoryDao;
import ma.sir.rh.dao.specification.core.TypeAbsenceSpecification;
import ma.sir.rh.service.facade.admin.TypeAbsenceAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeAbsenceAdminServiceImpl extends AbstractServiceImpl<TypeAbsence,TypeAbsenceHistory, TypeAbsenceCriteria, TypeAbsenceHistoryCriteria, TypeAbsenceDao,
TypeAbsenceHistoryDao> implements TypeAbsenceAdminService {


    public TypeAbsence findByReferenceEntity(TypeAbsence t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeAbsence.class,TypeAbsenceHistory.class, TypeAbsenceHistoryCriteria.class, TypeAbsenceSpecification.class);
    }


    public TypeAbsenceAdminServiceImpl(TypeAbsenceDao dao, TypeAbsenceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}