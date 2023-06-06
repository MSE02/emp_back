package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class AbonneCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String nom;
    private String nomLike;
    private String prenom;
    private String prenomLike;
    private String email;
    private String emailLike;
    private String tel;
    private String telLike;
    private String cnss;
    private String cnssLike;
    private LocalDateTime dateCreation;
    private LocalDateTime dateCreationFrom;
    private LocalDateTime dateCreationTo;



    public AbonneCriteria(){}

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

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmailLike(){
        return this.emailLike;
    }
    public void setEmailLike(String emailLike){
        this.emailLike = emailLike;
    }

    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getTelLike(){
        return this.telLike;
    }
    public void setTelLike(String telLike){
        this.telLike = telLike;
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

    public LocalDateTime getDateCreation(){
        return this.dateCreation;
    }
    public void setDateCreation(LocalDateTime dateCreation){
        this.dateCreation = dateCreation;
    }
    public LocalDateTime getDateCreationFrom(){
        return this.dateCreationFrom;
    }
    public void setDateCreationFrom(LocalDateTime dateCreationFrom){
        this.dateCreationFrom = dateCreationFrom;
    }
    public LocalDateTime getDateCreationTo(){
        return this.dateCreationTo;
    }
    public void setDateCreationTo(LocalDateTime dateCreationTo){
        this.dateCreationTo = dateCreationTo;
    }

}
