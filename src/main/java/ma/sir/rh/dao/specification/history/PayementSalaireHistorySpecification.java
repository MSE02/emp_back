package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.PayementSalaireHistoryCriteria;
import ma.sir.rh.bean.history.PayementSalaireHistory;


public class PayementSalaireHistorySpecification extends AbstractHistorySpecification<PayementSalaireHistoryCriteria, PayementSalaireHistory> {

    public PayementSalaireHistorySpecification(PayementSalaireHistoryCriteria criteria) {
        super(criteria);
    }

    public PayementSalaireHistorySpecification(PayementSalaireHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
