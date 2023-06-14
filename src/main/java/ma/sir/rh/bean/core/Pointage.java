package ma.sir.rh.bean.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.time.temporal.ChronoUnit;



@Entity
@Table(name = "pointage")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "pointage_seq", sequenceName = "pointage_seq", allocationSize = 1, initialValue = 1)
public class Pointage extends AuditBusinessObject {

    private Long id;

    @Column(length = 500)
    private String code;
    private LocalDateTime heureArrive;
    private LocalDateTime heureSortie;
    private Integer tempsRetard = 0;
    @JsonIgnore
    private Employee employee;


    public Pointage() {
        super();
    }

    public Pointage(Long id, String code) {
        this.id = id;
        this.code = code;
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pointage_seq")
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

    public LocalDateTime getHeureArrive() {
        return this.heureArrive;
    }

    public void setHeureArrive(LocalDateTime heureArrive) {
        this.heureArrive = heureArrive;
    }

    public LocalDateTime getHeureSortie() {
        return this.heureSortie;
    }

    public void setHeureSortie(LocalDateTime heureSortie) {
        this.heureSortie = heureSortie;
    }


    public Integer getTempsRetard() {
        int heureDepart = 830; // Heure de départ fixe (8:30)
        int heureArriveInt = heureArrive.getHour() * 100 + heureArrive.getMinute();
        int tempsRetard = heureArriveInt - heureDepart;

        // Assurez-vous que le temps de retard est positif
        if (tempsRetard < 0) {
            tempsRetard = 0;
        }

        return tempsRetard;
    }

    public void setTempsRetard(Integer tempsRetard) {
        this.tempsRetard = tempsRetard;
    }
    @JsonIgnore
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
        Pointage pointage = (Pointage) o;
        return id != null && id.equals(pointage.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
