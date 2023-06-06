package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EmployeeHistoryCriteria;
import ma.sir.rh.bean.history.EmployeeHistory;


public class EmployeeHistorySpecification extends AbstractHistorySpecification<EmployeeHistoryCriteria, EmployeeHistory> {

    public EmployeeHistorySpecification(EmployeeHistoryCriteria criteria) {
        super(criteria);
    }

    public EmployeeHistorySpecification(EmployeeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
