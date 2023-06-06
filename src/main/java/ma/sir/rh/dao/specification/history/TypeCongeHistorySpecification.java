package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.TypeCongeHistoryCriteria;
import ma.sir.rh.bean.history.TypeCongeHistory;


public class TypeCongeHistorySpecification extends AbstractHistorySpecification<TypeCongeHistoryCriteria, TypeCongeHistory> {

    public TypeCongeHistorySpecification(TypeCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeCongeHistorySpecification(TypeCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
