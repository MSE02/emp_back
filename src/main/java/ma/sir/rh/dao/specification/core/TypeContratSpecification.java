package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.TypeContratCriteria;
import ma.sir.rh.bean.core.TypeContrat;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeContratSpecification extends  AbstractSpecification<TypeContratCriteria, TypeContrat>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public TypeContratSpecification(TypeContratCriteria criteria) {
        super(criteria);
    }

    public TypeContratSpecification(TypeContratCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
