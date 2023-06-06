package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class AbsenceCriteria extends  BaseCriteria  {

    private LocalDateTime dateDebut;
    private LocalDateTime dateDebutFrom;
    private LocalDateTime dateDebutTo;
    private LocalDateTime dateFinA;
    private LocalDateTime dateFinAFrom;
    private LocalDateTime dateFinATo;
    private String description;
    private String descriptionLike;
    private String duree;
    private String dureeMin;
    private String dureeMax;


    private TypeAbsenceCriteria typeAbsence ;
    private List<TypeAbsenceCriteria> typeAbsences ;
    private EmployeeCriteria employee ;
    private List<EmployeeCriteria> employees ;


    public AbsenceCriteria(){}



    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(String dureeMin) {
        this.dureeMin = dureeMin;
    }

    public String getDureeMax() {
        return dureeMax;
    }

    public void setDureeMax(String dureeMax) {
        this.dureeMax = dureeMax;
    }

    public LocalDateTime getDateDebutFrom(){
        return this.dateDebutFrom;
    }
    public void setDateDebutFrom(LocalDateTime dateDebutFrom){
        this.dateDebutFrom = dateDebutFrom;
    }
    public LocalDateTime getDateDebutTo(){
        return this.dateDebutTo;
    }
    public void setDateDebutTo(LocalDateTime dateDebutTo){
        this.dateDebutTo = dateDebutTo;
    }
    public LocalDateTime getDateFinA(){
        return this.dateFinA;
    }
    public void setDateFinA(LocalDateTime dateFinA){
        this.dateFinA = dateFinA;
    }
    public LocalDateTime getDateFinAFrom(){
        return this.dateFinAFrom;
    }
    public void setDateFinAFrom(LocalDateTime dateFinAFrom){
        this.dateFinAFrom = dateFinAFrom;
    }
    public LocalDateTime getDateFinATo(){
        return this.dateFinATo;
    }
    public void setDateFinATo(LocalDateTime dateFinATo){
        this.dateFinATo = dateFinATo;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }


    public TypeAbsenceCriteria getTypeAbsence(){
        return this.typeAbsence;
    }

    public void setTypeAbsence(TypeAbsenceCriteria typeAbsence){
        this.typeAbsence = typeAbsence;
    }
    public List<TypeAbsenceCriteria> getTypeAbsences(){
        return this.typeAbsences;
    }

    public void setTypeAbsences(List<TypeAbsenceCriteria> typeAbsences){
        this.typeAbsences = typeAbsences;
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
