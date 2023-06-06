package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;

public class PayementSalaireCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String mois;
    private String moisMin;
    private String moisMax;
    private String annee;
    private String anneeMin;
    private String anneeMax;
    private String salaire;
    private String salaireMin;
    private String salaireMax;
    private String nombreJoursConge;
    private String nombreJoursCongeMin;
    private String nombreJoursCongeMax;
    private String nombreJoursAbsence;
    private String nombreJoursAbsenceMin;
    private String nombreJoursAbsenceMax;
    private String baisseSalaire;
    private String baisseSalaireMin;
    private String baisseSalaireMax;
    private String salaireFinal;
    private String salaireFinalMin;
    private String salaireFinalMax;

    private EmployeeCriteria employee ;
    private List<EmployeeCriteria> employees ;


    public PayementSalaireCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getMois(){
        return this.mois;
    }
    public void setMois(String mois){
        this.mois = mois;
    }   
    public String getMoisMin(){
        return this.moisMin;
    }
    public void setMoisMin(String moisMin){
        this.moisMin = moisMin;
    }
    public String getMoisMax(){
        return this.moisMax;
    }
    public void setMoisMax(String moisMax){
        this.moisMax = moisMax;
    }
      
    public String getAnnee(){
        return this.annee;
    }
    public void setAnnee(String annee){
        this.annee = annee;
    }   
    public String getAnneeMin(){
        return this.anneeMin;
    }
    public void setAnneeMin(String anneeMin){
        this.anneeMin = anneeMin;
    }
    public String getAnneeMax(){
        return this.anneeMax;
    }
    public void setAnneeMax(String anneeMax){
        this.anneeMax = anneeMax;
    }
      
    public String getSalaire(){
        return this.salaire;
    }
    public void setSalaire(String salaire){
        this.salaire = salaire;
    }   
    public String getSalaireMin(){
        return this.salaireMin;
    }
    public void setSalaireMin(String salaireMin){
        this.salaireMin = salaireMin;
    }
    public String getSalaireMax(){
        return this.salaireMax;
    }
    public void setSalaireMax(String salaireMax){
        this.salaireMax = salaireMax;
    }
      
    public String getNombreJoursConge(){
        return this.nombreJoursConge;
    }
    public void setNombreJoursConge(String nombreJoursConge){
        this.nombreJoursConge = nombreJoursConge;
    }   
    public String getNombreJoursCongeMin(){
        return this.nombreJoursCongeMin;
    }
    public void setNombreJoursCongeMin(String nombreJoursCongeMin){
        this.nombreJoursCongeMin = nombreJoursCongeMin;
    }
    public String getNombreJoursCongeMax(){
        return this.nombreJoursCongeMax;
    }
    public void setNombreJoursCongeMax(String nombreJoursCongeMax){
        this.nombreJoursCongeMax = nombreJoursCongeMax;
    }
      
    public String getNombreJoursAbsence(){
        return this.nombreJoursAbsence;
    }
    public void setNombreJoursAbsence(String nombreJoursAbsence){
        this.nombreJoursAbsence = nombreJoursAbsence;
    }   
    public String getNombreJoursAbsenceMin(){
        return this.nombreJoursAbsenceMin;
    }
    public void setNombreJoursAbsenceMin(String nombreJoursAbsenceMin){
        this.nombreJoursAbsenceMin = nombreJoursAbsenceMin;
    }
    public String getNombreJoursAbsenceMax(){
        return this.nombreJoursAbsenceMax;
    }
    public void setNombreJoursAbsenceMax(String nombreJoursAbsenceMax){
        this.nombreJoursAbsenceMax = nombreJoursAbsenceMax;
    }
      
    public String getBaisseSalaire(){
        return this.baisseSalaire;
    }
    public void setBaisseSalaire(String baisseSalaire){
        this.baisseSalaire = baisseSalaire;
    }   
    public String getBaisseSalaireMin(){
        return this.baisseSalaireMin;
    }
    public void setBaisseSalaireMin(String baisseSalaireMin){
        this.baisseSalaireMin = baisseSalaireMin;
    }
    public String getBaisseSalaireMax(){
        return this.baisseSalaireMax;
    }
    public void setBaisseSalaireMax(String baisseSalaireMax){
        this.baisseSalaireMax = baisseSalaireMax;
    }
      
    public String getSalaireFinal(){
        return this.salaireFinal;
    }
    public void setSalaireFinal(String salaireFinal){
        this.salaireFinal = salaireFinal;
    }   
    public String getSalaireFinalMin(){
        return this.salaireFinalMin;
    }
    public void setSalaireFinalMin(String salaireFinalMin){
        this.salaireFinalMin = salaireFinalMin;
    }
    public String getSalaireFinalMax(){
        return this.salaireFinalMax;
    }
    public void setSalaireFinalMax(String salaireFinalMax){
        this.salaireFinalMax = salaireFinalMax;
    }
      

    public EmployeeCriteria getEmployee(){
        return this.employee;
    }

    public void setEmployee(EmployeeCriteria employee){
        this.employee = employee;
    }
    public List<EmployeeCriteria> getEmployees(){
        return this.employees;
    }

    public void setEmployees(List<EmployeeCriteria> employees){
        this.employees = employees;
    }
}
