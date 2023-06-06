package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.rh.bean.history.AbsenceHistory;


public class AbsenceHistorySpecification extends AbstractHistorySpecification<AbsenceHistoryCriteria, AbsenceHistory> {

    public AbsenceHistorySpecification(AbsenceHistoryCriteria criteria) {
        super(criteria);
    }

    public AbsenceHistorySpecification(AbsenceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
