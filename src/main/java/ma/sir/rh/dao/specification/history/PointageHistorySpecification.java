package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.PointageHistoryCriteria;
import ma.sir.rh.bean.history.PointageHistory;


public class PointageHistorySpecification extends AbstractHistorySpecification<PointageHistoryCriteria, PointageHistory> {

    public PointageHistorySpecification(PointageHistoryCriteria criteria) {
        super(criteria);
    }

    public PointageHistorySpecification(PointageHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
