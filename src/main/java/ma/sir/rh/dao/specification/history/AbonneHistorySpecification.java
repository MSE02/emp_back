package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.AbonneHistoryCriteria;
import ma.sir.rh.bean.history.AbonneHistory;


public class AbonneHistorySpecification extends AbstractHistorySpecification<AbonneHistoryCriteria, AbonneHistory> {

    public AbonneHistorySpecification(AbonneHistoryCriteria criteria) {
        super(criteria);
    }

    public AbonneHistorySpecification(AbonneHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
