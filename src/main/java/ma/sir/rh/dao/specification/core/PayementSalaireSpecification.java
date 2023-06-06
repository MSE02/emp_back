package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.PayementSalaireCriteria;
import ma.sir.rh.bean.core.PayementSalaire;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PayementSalaireSpecification extends  AbstractSpecification<PayementSalaireCriteria, PayementSalaire>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateInt("mois", criteria.getMois(), criteria.getMoisMin(), criteria.getMoisMax());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateBigDecimal("salaire", criteria.getSalaire(), criteria.getSalaireMin(), criteria.getSalaireMax());
        addPredicateInt("nombreJoursConge", criteria.getNombreJoursConge(), criteria.getNombreJoursCongeMin(), criteria.getNombreJoursCongeMax());
        addPredicateInt("nombreJoursAbsence", criteria.getNombreJoursAbsence(), criteria.getNombreJoursAbsenceMin(), criteria.getNombreJoursAbsenceMax());
        addPredicateBigDecimal("baisseSalaire", criteria.getBaisseSalaire(), criteria.getBaisseSalaireMin(), criteria.getBaisseSalaireMax());
        addPredicateBigDecimal("salaireFinal", criteria.getSalaireFinal(), criteria.getSalaireFinalMin(), criteria.getSalaireFinalMax());
        addPredicateFk("employee","id", criteria.getEmployee()==null?null:criteria.getEmployee().getId());
        addPredicateFk("employee","id", criteria.getEmployees());
        addPredicateFk("employee","code", criteria.getEmployee()==null?null:criteria.getEmployee().getCode());
    }

    public PayementSalaireSpecification(PayementSalaireCriteria criteria) {
        super(criteria);
    }

    public PayementSalaireSpecification(PayementSalaireCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
