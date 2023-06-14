package ma.sir.rh.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "contrat")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="contrat_seq",sequenceName="contrat_seq",allocationSize=1, initialValue = 1)
public class Contrat   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    private LocalDateTime dateContrat ;
    @Column(length = 500)
    private String description;
    @JsonBackReference
    private Employee employee ;
    
    private TypeContrat typeContrat ;
    


    public Contrat(){
        super();
    }

    public Contrat(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="contrat_seq")
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
    public LocalDateTime getDateContrat(){
        return this.dateContrat;
    }
    public void setDateContrat(LocalDateTime dateContrat){
        this.dateContrat = dateContrat;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Employee getEmployee(){
        return this.employee;
    }
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeContrat getTypeContrat(){
        return this.typeContrat;
    }
    public void setTypeContrat(TypeContrat typeContrat){
        this.typeContrat = typeContrat;
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
        Contrat contrat = (Contrat) o;
        return id != null && id.equals(contrat.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

