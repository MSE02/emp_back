package ma.sir.rh.bean.core;

import java.time.temporal.ChronoUnit;
import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "conge_seq", sequenceName = "conge_seq", allocationSize = 1, initialValue = 1)
public class Conge extends AuditBusinessObject {

    private Long id;

    @Column(length = 500)
    private String code;
    private Integer durre = 0;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private TypeConge typeConge;
    private Employee employee;


    public Conge() {
        super();
    }

    public Conge(Long id, String code) {
        this.id = id;
        this.code = code;
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conge_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getDurre() {
        if (dateDebut != null && dateFin != null) {
            return (int) ChronoUnit.DAYS.between(dateDebut, dateFin) + 1;
        }
        return 0;
    }
    public void setDurre(Integer durre) {
        this.durre = durre;
    }

    public LocalDateTime getDateDebut() {
        return this.dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public TypeConge getTypeConge() {
        return this.typeConge;
    }

    public void setTypeConge(TypeConge typeConge) {
        this.typeConge = typeConge;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        Conge conge = (Conge) o;
        return id != null && id.equals(conge.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

