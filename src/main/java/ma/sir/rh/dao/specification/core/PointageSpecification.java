package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.PointageCriteria;
import ma.sir.rh.bean.core.Pointage;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PointageSpecification extends  AbstractSpecification<PointageCriteria, Pointage>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("heureArrive", criteria.getHeureArrive(), criteria.getHeureArriveFrom(), criteria.getHeureArriveTo());
        addPredicate("heureSortie", criteria.getHeureSortie(), criteria.getHeureSortieFrom(), criteria.getHeureSortieTo());
        addPredicateInt("tempsRetard", criteria.getTempsRetard(), criteria.getTempsRetardMin(), criteria.getTempsRetardMax());
        addPredicateFk("employee","id", criteria.getEmployee()==null?null:criteria.getEmployee().getId());
        addPredicateFk("employee","id", criteria.getEmployees());
        addPredicateFk("employee","code", criteria.getEmployee()==null?null:criteria.getEmployee().getCode());
    }

    public PointageSpecification(PointageCriteria criteria) {
        super(criteria);
    }

    public PointageSpecification(PointageCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
