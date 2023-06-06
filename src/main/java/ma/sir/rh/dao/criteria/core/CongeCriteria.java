package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class CongeCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String durre;
    private String durreMin;
    private String durreMax;
    private LocalDateTime dateDebut;
    private LocalDateTime dateDebutFrom;
    private LocalDateTime dateDebutTo;
    private LocalDateTime dateFin;
    private LocalDateTime dateFinFrom;
    private LocalDateTime dateFinTo;

    private TypeCongeCriteria typeConge ;
    private List<TypeCongeCriteria> typeConges ;
    private EmployeeCriteria employee ;
    private List<EmployeeCriteria> employees ;


    public CongeCriteria(){}

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

    public String getDurre(){
        return this.durre;
    }
    public void setDurre(String durre){
        this.durre = durre;
    }   
    public String getDurreMin(){
        return this.durreMin;
    }
    public void setDurreMin(String durreMin){
        this.durreMin = durreMin;
    }
    public String getDurreMax(){
        return this.durreMax;
    }
    public void setDurreMax(String durreMax){
        this.durreMax = durreMax;
    }
      
    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
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
    public LocalDateTime getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(LocalDateTime dateFin){
        this.dateFin = dateFin;
    }
    public LocalDateTime getDateFinFrom(){
        return this.dateFinFrom;
    }
    public void setDateFinFrom(LocalDateTime dateFinFrom){
        this.dateFinFrom = dateFinFrom;
    }
    public LocalDateTime getDateFinTo(){
        return this.dateFinTo;
    }
    public void setDateFinTo(LocalDateTime dateFinTo){
        this.dateFinTo = dateFinTo;
    }

    public TypeCongeCriteria getTypeConge(){
        return this.typeConge;
    }

    public void setTypeConge(TypeCongeCriteria typeConge){
        this.typeConge = typeConge;
    }
    public List<TypeCongeCriteria> getTypeConges(){
        return this.typeConges;
    }

    public void setTypeConges(List<TypeCongeCriteria> typeConges){
        this.typeConges = typeConges;
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
