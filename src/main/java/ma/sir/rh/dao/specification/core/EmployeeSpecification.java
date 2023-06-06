package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.EmployeeCriteria;
import ma.sir.rh.bean.core.Employee;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSpecification extends  AbstractSpecification<EmployeeCriteria, Employee>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("cin", criteria.getCin(),criteria.getCinLike());
        addPredicate("email",criteria.getEmail(), criteria.getEmailLike());
        addPredicate("dateNaissance", criteria.getDateNaissance(), criteria.getDateNaissanceFrom(), criteria.getDateNaissanceTo());
        addPredicate("lieuNaissance", criteria.getLieuNaissance(),criteria.getLieuNaissanceLike());
        addPredicate("adresse", criteria.getAdresse(),criteria.getAdresseLike());
        addPredicate("telephone", criteria.getTelephone(),criteria.getTelephoneLike());
        addPredicateBigDecimal("salaireJour", criteria.getSalaireJour(), criteria.getSalaireJourMin(), criteria.getSalaireJourMax());
        addPredicateBigDecimal("salaireMois", criteria.getSalaireMois(), criteria.getSalaireMoisMin(), criteria.getSalaireMoisMax());
        addPredicateBigDecimal("soldeConge", criteria.getSoldeConge(), criteria.getSoldeCongeMin(), criteria.getSoldeCongeMax());
        addPredicate("cnss", criteria.getCnss(),criteria.getCnssLike());
        addPredicateFk("contrat","id", criteria.getContrat()==null?null:criteria.getContrat().getId());
        addPredicateFk("contrat","id", criteria.getContrats());
        addPredicateFk("contrat","code", criteria.getContrat()==null?null:criteria.getContrat().getCode());
        addPredicateFk("uniteAdministrative","id", criteria.getUniteAdministrative()==null?null:criteria.getUniteAdministrative().getId());
        addPredicateFk("uniteAdministrative","id", criteria.getUniteAdministratives());
        addPredicateFk("uniteAdministrative","code", criteria.getUniteAdministrative()==null?null:criteria.getUniteAdministrative().getCode());
        addPredicateFk("categorieEmployee","id", criteria.getCategorieEmployee()==null?null:criteria.getCategorieEmployee().getId());
        addPredicateFk("categorieEmployee","id", criteria.getCategorieEmployees());
        addPredicateFk("categorieEmployee","code", criteria.getCategorieEmployee()==null?null:criteria.getCategorieEmployee().getCode());

    }

    public EmployeeSpecification(EmployeeCriteria criteria) {
        super(criteria);
    }

    public EmployeeSpecification(EmployeeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
