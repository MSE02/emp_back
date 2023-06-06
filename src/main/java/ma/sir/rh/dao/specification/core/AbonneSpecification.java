package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.AbonneCriteria;
import ma.sir.rh.bean.core.Abonne;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AbonneSpecification extends  AbstractSpecification<AbonneCriteria, Abonne>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicate("tel", criteria.getTel(),criteria.getTelLike());
        addPredicate("cnss", criteria.getCnss(),criteria.getCnssLike());
        addPredicate("dateCreation", criteria.getDateCreation(), criteria.getDateCreationFrom(), criteria.getDateCreationTo());
    }

    public AbonneSpecification(AbonneCriteria criteria) {
        super(criteria);
    }

    public AbonneSpecification(AbonneCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
