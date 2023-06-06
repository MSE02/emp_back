package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.TypeAbsenceCriteria;
import ma.sir.rh.bean.core.TypeAbsence;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeAbsenceSpecification extends  AbstractSpecification<TypeAbsenceCriteria, TypeAbsence>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public TypeAbsenceSpecification(TypeAbsenceCriteria criteria) {
        super(criteria);
    }

    public TypeAbsenceSpecification(TypeAbsenceCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
