package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.rh.bean.history.CongeHistory;


public class CongeHistorySpecification extends AbstractHistorySpecification<CongeHistoryCriteria, CongeHistory> {

    public CongeHistorySpecification(CongeHistoryCriteria criteria) {
        super(criteria);
    }

    public CongeHistorySpecification(CongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
