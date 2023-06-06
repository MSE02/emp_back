package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.CongeCriteria;
import ma.sir.rh.bean.core.Conge;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CongeSpecification extends  AbstractSpecification<CongeCriteria, Conge>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateInt("durre", criteria.getDurre(), criteria.getDurreMin(), criteria.getDurreMax());
        addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
        addPredicate("dateFin", criteria.getDateFin(), criteria.getDateFinFrom(), criteria.getDateFinTo());
        addPredicateFk("typeConge","id", criteria.getTypeConge()==null?null:criteria.getTypeConge().getId());
        addPredicateFk("typeConge","id", criteria.getTypeConges());
        addPredicateFk("typeConge","code", criteria.getTypeConge()==null?null:criteria.getTypeConge().getCode());
        addPredicateFk("employee","id", criteria.getEmployee()==null?null:criteria.getEmployee().getId());
        addPredicateFk("employee","id", criteria.getEmployees());
        addPredicateFk("employee","code", criteria.getEmployee()==null?null:criteria.getEmployee().getCode());
    }

    public CongeSpecification(CongeCriteria criteria) {
        super(criteria);
    }

    public CongeSpecification(CongeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
