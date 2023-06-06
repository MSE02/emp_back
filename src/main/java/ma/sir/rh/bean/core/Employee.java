package ma.sir.rh.bean.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "employee")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq", allocationSize = 1, initialValue = 1)
public class Employee extends AuditBusinessObject {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String cin;
    private LocalDateTime dateNaissance;
    @Column(length = 500)
    private String lieuNaissance;
    @Column(length = 500)
    private String adresse;
    @Column(length = 500)
    private String telephone;
    private BigDecimal salaireJour = BigDecimal.ZERO;
    private BigDecimal salaireMois = BigDecimal.ZERO;
    private BigDecimal soldeConge = BigDecimal.ZERO;
    @Column(length = 500)
    private String cnss;

    private Contrat contrat;
    private UniteAdministrative uniteAdministrative;
    @JsonIgnoreProperties({"hibernateLazyInitializer"})

    private CategorieEmployee categorieEmployee;
    private String email;
    private List<Absence> absences;
    private List<Conge> conges;

    public Employee() {
        super();
    }

    public Employee(Long id, String code) {
        this.id = id;
        this.code = code;
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
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

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return this.cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public LocalDateTime getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(LocalDateTime dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return this.lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public BigDecimal getSalaireJour() {
        return this.salaireJour;
    }

    public void setSalaireJour(BigDecimal salaireJour) {
        this.salaireJour = salaireJour;
    }

    public BigDecimal getSalaireMois() {
        return this.salaireMois;
    }

    public void setSalaireMois(BigDecimal salaireMois) {
        this.salaireMois = salaireMois;
    }

    public BigDecimal getSoldeConge() {
        return this.soldeConge;
    }

    public void setSoldeConge(BigDecimal soldeConge) {
        this.soldeConge = soldeConge;
    }

    public String getCnss() {
        return this.cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Contrat getContrat() {
        return this.contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public UniteAdministrative getUniteAdministrative() {
        return this.uniteAdministrative;
    }

    public void setUniteAdministrative(UniteAdministrative uniteAdministrative) {
        this.uniteAdministrative = uniteAdministrative;
    }

    @OneToMany(mappedBy = "employee")
    public List<Absence> getAbsences() {
        return this.absences;
    }

    public void setAbsences(List<Absence> absences) {
        this.absences = absences;
    }

    @OneToMany(mappedBy = "employee")
    public List<Conge> getConges() {
        return this.conges;
    }

    public void setConges(List<Conge> conges) {
        this.conges = conges;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public CategorieEmployee getCategorieEmployee() {
        return this.categorieEmployee;
    }

    public void setCategorieEmployee(CategorieEmployee categorieEmployee) {
        this.categorieEmployee = categorieEmployee;
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
        Employee employee = (Employee) o;
        return id != null && id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

