package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.AbsenceCriteria;
import ma.sir.rh.bean.core.Absence;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AbsenceSpecification extends  AbstractSpecification<AbsenceCriteria, Absence>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("duree", criteria.getDuree(), criteria.getDureeMin(), criteria.getDureeMax());
        addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
        addPredicate("dateFinA", criteria.getDateFinA(), criteria.getDateFinAFrom(), criteria.getDateFinATo());
        addPredicateFk("typeAbsence","id", criteria.getTypeAbsence()==null?null:criteria.getTypeAbsence().getId());
        addPredicateFk("typeAbsence","id", criteria.getTypeAbsences());
        addPredicateFk("typeAbsence","code", criteria.getTypeAbsence()==null?null:criteria.getTypeAbsence().getCode());
        addPredicateFk("employee","id", criteria.getEmployee()==null?null:criteria.getEmployee().getId());
        addPredicateFk("employee","id", criteria.getEmployees());
        addPredicateFk("employee","code", criteria.getEmployee()==null?null:criteria.getEmployee().getCode());
    }

    public AbsenceSpecification(AbsenceCriteria criteria) {
        super(criteria);
    }

    public AbsenceSpecification(AbsenceCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
