package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDto  extends AuditBaseDto {

    private String code  ;
    private String nom  ;
    private String prenom  ;
    private String cin  ;
    private String dateNaissance ;
    private String lieuNaissance  ;
    private String adresse  ;
    private String telephone  ;
    private BigDecimal salaireJour  ;
    private BigDecimal salaireMois  ;
    private BigDecimal soldeConge  ;
    private String cnss  ;
    private String email;

    private ContratDto contrat ;
    private UniteAdministrativeDto uniteAdministrative ;
    private CategorieEmployeeDto categorieEmployee ;

    private List<AbsenceDto> absences ;
    private List<CongeDto> conges ;


    public EmployeeDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Log
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(String dateNaissance){
        this.dateNaissance = dateNaissance;
    }

    @Log
    public String getLieuNaissance(){
        return this.lieuNaissance;
    }
    public void setLieuNaissance(String lieuNaissance){
        this.lieuNaissance = lieuNaissance;
    }

    @Log
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    @Log
    public String getTelephone(){
        return this.telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    @Log
    public BigDecimal getSalaireJour(){
        return this.salaireJour;
    }
    public void setSalaireJour(BigDecimal salaireJour){
        this.salaireJour = salaireJour;
    }

    @Log
    public BigDecimal getSalaireMois(){
        return this.salaireMois;
    }
    public void setSalaireMois(BigDecimal salaireMois){
        this.salaireMois = salaireMois;
    }

    @Log
    public BigDecimal getSoldeConge(){
        return this.soldeConge;
    }
    public void setSoldeConge(BigDecimal soldeConge){
        this.soldeConge = soldeConge;
    }

    @Log
    public String getCnss(){
        return this.cnss;
    }
    public void setCnss(String cnss){
        this.cnss = cnss;
    }


    public ContratDto getContrat(){
        return this.contrat;
    }

    public void setContrat(ContratDto contrat){
        this.contrat = contrat;
    }
    public UniteAdministrativeDto getUniteAdministrative(){
        return this.uniteAdministrative;
    }

    public void setUniteAdministrative(UniteAdministrativeDto uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
    public CategorieEmployeeDto getCategorieEmployee(){
        return this.categorieEmployee;
    }

    public void setCategorieEmployee(CategorieEmployeeDto categorieEmployee){
        this.categorieEmployee = categorieEmployee;
    }



    public List<AbsenceDto> getAbsences(){
        return this.absences;
    }

    public void setAbsences(List<AbsenceDto> absences){
        this.absences = absences;
    }
    public List<CongeDto> getConges(){
        return this.conges;
    }

    public void setConges(List<CongeDto> conges){
        this.conges = conges;
    }

}
