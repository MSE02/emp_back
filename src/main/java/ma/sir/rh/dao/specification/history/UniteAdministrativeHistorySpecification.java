package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.sir.rh.bean.history.UniteAdministrativeHistory;


public class UniteAdministrativeHistorySpecification extends AbstractHistorySpecification<UniteAdministrativeHistoryCriteria, UniteAdministrativeHistory> {

    public UniteAdministrativeHistorySpecification(UniteAdministrativeHistoryCriteria criteria) {
        super(criteria);
    }

    public UniteAdministrativeHistorySpecification(UniteAdministrativeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
