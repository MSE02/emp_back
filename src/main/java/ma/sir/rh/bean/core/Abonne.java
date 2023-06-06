package ma.sir.rh.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "abonne")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="abonne_seq",sequenceName="abonne_seq",allocationSize=1, initialValue = 1)
public class Abonne   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String tel;
    @Column(length = 500)
    private String cnss;
    private LocalDateTime dateCreation ;



    public Abonne(){
        super();
    }

    public Abonne(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="abonne_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getCnss(){
        return this.cnss;
    }
    public void setCnss(String cnss){
        this.cnss = cnss;
    }
    public LocalDateTime getDateCreation(){
        return this.dateCreation;
    }
    public void setDateCreation(LocalDateTime dateCreation){
        this.dateCreation = dateCreation;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonne abonne = (Abonne) o;
        return id != null && id.equals(abonne.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

