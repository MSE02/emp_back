package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class EmployeeCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String nom;
    private String nomLike;
    private String prenom;
    private String prenomLike;
    private String cin;
    private String cinLike;
    private LocalDateTime dateNaissance;
    private LocalDateTime dateNaissanceFrom;
    private LocalDateTime dateNaissanceTo;
    private String lieuNaissance;
    private String lieuNaissanceLike;
    private String adresse;
    private String adresseLike;
    private String telephone;
    private String telephoneLike;
    private String salaireJour;
    private String salaireJourMin;
    private String salaireJourMax;
    private String salaireMois;
    private String salaireMoisMin;
    private String salaireMoisMax;
    private String soldeConge;
    private String soldeCongeMin;
    private String soldeCongeMax;
    private String cnss;
    private String cnssLike;
    private String email;
    private String emailLike;
    private ContratCriteria contrat ;
    private List<ContratCriteria> contrats ;
    private UniteAdministrativeCriteria uniteAdministrative ;
    private List<UniteAdministrativeCriteria> uniteAdministratives ;
    private CategorieEmployeeCriteria categorieEmployee ;
    private List<CategorieEmployeeCriteria> categorieEmployees ;


    public EmployeeCriteria(){}

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailLike() {
        return emailLike;
    }

    public void setEmailLike(String emailLike) {
        this.emailLike = emailLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }

    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCinLike(){
        return this.cinLike;
    }
    public void setCinLike(String cinLike){
        this.cinLike = cinLike;
    }

    public LocalDateTime getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(LocalDateTime dateNaissance){
        this.dateNaissance = dateNaissance;
    }
    public LocalDateTime getDateNaissanceFrom(){
        return this.dateNaissanceFrom;
    }
    public void setDateNaissanceFrom(LocalDateTime dateNaissanceFrom){
        this.dateNaissanceFrom = dateNaissanceFrom;
    }
    public LocalDateTime getDateNaissanceTo(){
        return this.dateNaissanceTo;
    }
    public void setDateNaissanceTo(LocalDateTime dateNaissanceTo){
        this.dateNaissanceTo = dateNaissanceTo;
    }
    public String getLieuNaissance(){
        return this.lieuNaissance;
    }
    public void setLieuNaissance(String lieuNaissance){
        this.lieuNaissance = lieuNaissance;
    }
    public String getLieuNaissanceLike(){
        return this.lieuNaissanceLike;
    }
    public void setLieuNaissanceLike(String lieuNaissanceLike){
        this.lieuNaissanceLike = lieuNaissanceLike;
    }

    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getAdresseLike(){
        return this.adresseLike;
    }
    public void setAdresseLike(String adresseLike){
        this.adresseLike = adresseLike;
    }

    public String getTelephone(){
        return this.telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String getTelephoneLike(){
        return this.telephoneLike;
    }
    public void setTelephoneLike(String telephoneLike){
        this.telephoneLike = telephoneLike;
    }

    public String getSalaireJour(){
        return this.salaireJour;
    }
    public void setSalaireJour(String salaireJour){
        this.salaireJour = salaireJour;
    }   
    public String getSalaireJourMin(){
        return this.salaireJourMin;
    }
    public void setSalaireJourMin(String salaireJourMin){
        this.salaireJourMin = salaireJourMin;
    }
    public String getSalaireJourMax(){
        return this.salaireJourMax;
    }
    public void setSalaireJourMax(String salaireJourMax){
        this.salaireJourMax = salaireJourMax;
    }
      
    public String getSalaireMois(){
        return this.salaireMois;
    }
    public void setSalaireMois(String salaireMois){
        this.salaireMois = salaireMois;
    }   
    public String getSalaireMoisMin(){
        return this.salaireMoisMin;
    }
    public void setSalaireMoisMin(String salaireMoisMin){
        this.salaireMoisMin = salaireMoisMin;
    }
    public String getSalaireMoisMax(){
        return this.salaireMoisMax;
    }
    public void setSalaireMoisMax(String salaireMoisMax){
        this.salaireMoisMax = salaireMoisMax;
    }
      
    public String getSoldeConge(){
        return this.soldeConge;
    }
    public void setSoldeConge(String soldeConge){
        this.soldeConge = soldeConge;
    }   
    public String getSoldeCongeMin(){
        return this.soldeCongeMin;
    }
    public void setSoldeCongeMin(String soldeCongeMin){
        this.soldeCongeMin = soldeCongeMin;
    }
    public String getSoldeCongeMax(){
        return this.soldeCongeMax;
    }
    public void setSoldeCongeMax(String soldeCongeMax){
        this.soldeCongeMax = soldeCongeMax;
    }
      
    public String getCnss(){
        return this.cnss;
    }
    public void setCnss(String cnss){
        this.cnss = cnss;
    }
    public String getCnssLike(){
        return this.cnssLike;
    }
    public void setCnssLike(String cnssLike){
        this.cnssLike = cnssLike;
    }


    public ContratCriteria getContrat(){
        return this.contrat;
    }

    public void setContrat(ContratCriteria contrat){
        this.contrat = contrat;
    }
    public List<ContratCriteria> getContrats(){
        return this.contrats;
    }

    public void setContrats(List<ContratCriteria> contrats){
        this.contrats = contrats;
    }
    public UniteAdministrativeCriteria getUniteAdministrative(){
        return this.uniteAdministrative;
    }

    public void setUniteAdministrative(UniteAdministrativeCriteria uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
    public List<UniteAdministrativeCriteria> getUniteAdministratives(){
        return this.uniteAdministratives;
    }

    public void setUniteAdministratives(List<UniteAdministrativeCriteria> uniteAdministratives){
        this.uniteAdministratives = uniteAdministratives;
    }
    public CategorieEmployeeCriteria getCategorieEmployee(){
        return this.categorieEmployee;
    }

    public void setCategorieEmployee(CategorieEmployeeCriteria categorieEmployee){
        this.categorieEmployee = categorieEmployee;
    }
    public List<CategorieEmployeeCriteria> getCategorieEmployees(){
        return this.categorieEmployees;
    }

    public void setCategorieEmployees(List<CategorieEmployeeCriteria> categorieEmployees){
        this.categorieEmployees = categorieEmployees;
    }
}
