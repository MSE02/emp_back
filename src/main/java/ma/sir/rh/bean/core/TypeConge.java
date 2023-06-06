package ma.sir.rh.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "type_conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_conge_seq",sequenceName="type_conge_seq",allocationSize=1, initialValue = 1)
public class TypeConge   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private BigDecimal solde = BigDecimal.ZERO;



    public TypeConge(){
        super();
    }

    public TypeConge(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_conge_seq")
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
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public BigDecimal getSolde(){
        return this.solde;
    }
    public void setSolde(BigDecimal solde){
        this.solde = solde;
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
        TypeConge typeConge = (TypeConge) o;
        return id != null && id.equals(typeConge.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

