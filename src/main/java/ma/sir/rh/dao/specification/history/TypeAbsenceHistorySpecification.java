package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.TypeAbsenceHistoryCriteria;
import ma.sir.rh.bean.history.TypeAbsenceHistory;


public class TypeAbsenceHistorySpecification extends AbstractHistorySpecification<TypeAbsenceHistoryCriteria, TypeAbsenceHistory> {

    public TypeAbsenceHistorySpecification(TypeAbsenceHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeAbsenceHistorySpecification(TypeAbsenceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
