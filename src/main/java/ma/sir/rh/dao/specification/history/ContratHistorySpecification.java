package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.rh.bean.history.ContratHistory;


public class ContratHistorySpecification extends AbstractHistorySpecification<ContratHistoryCriteria, ContratHistory> {

    public ContratHistorySpecification(ContratHistoryCriteria criteria) {
        super(criteria);
    }

    public ContratHistorySpecification(ContratHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
