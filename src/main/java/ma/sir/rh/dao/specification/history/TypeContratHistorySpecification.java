package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.TypeContratHistoryCriteria;
import ma.sir.rh.bean.history.TypeContratHistory;


public class TypeContratHistorySpecification extends AbstractHistorySpecification<TypeContratHistoryCriteria, TypeContratHistory> {

    public TypeContratHistorySpecification(TypeContratHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeContratHistorySpecification(TypeContratHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
