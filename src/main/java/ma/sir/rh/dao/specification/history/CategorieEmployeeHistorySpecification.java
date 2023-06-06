package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.CategorieEmployeeHistoryCriteria;
import ma.sir.rh.bean.history.CategorieEmployeeHistory;


public class CategorieEmployeeHistorySpecification extends AbstractHistorySpecification<CategorieEmployeeHistoryCriteria, CategorieEmployeeHistory> {

    public CategorieEmployeeHistorySpecification(CategorieEmployeeHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieEmployeeHistorySpecification(CategorieEmployeeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
