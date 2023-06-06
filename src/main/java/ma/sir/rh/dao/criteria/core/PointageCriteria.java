package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PointageCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private LocalDateTime heureArrive;
    private LocalDateTime heureArriveFrom;
    private LocalDateTime heureArriveTo;
    private LocalDateTime heureSortie;
    private LocalDateTime heureSortieFrom;
    private LocalDateTime heureSortieTo;
    private String tempsRetard;
    private String tempsRetardMin;
    private String tempsRetardMax;

    private EmployeeCriteria employee ;
    private List<EmployeeCriteria> employees ;


    public PointageCriteria(){}

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

    public LocalDateTime getHeureArrive(){
        return this.heureArrive;
    }
    public void setHeureArrive(LocalDateTime heureArrive){
        this.heureArrive = heureArrive;
    }
    public LocalDateTime getHeureArriveFrom(){
        return this.heureArriveFrom;
    }
    public void setHeureArriveFrom(LocalDateTime heureArriveFrom){
        this.heureArriveFrom = heureArriveFrom;
    }
    public LocalDateTime getHeureArriveTo(){
        return this.heureArriveTo;
    }
    public void setHeureArriveTo(LocalDateTime heureArriveTo){
        this.heureArriveTo = heureArriveTo;
    }
    public LocalDateTime getHeureSortie(){
        return this.heureSortie;
    }
    public void setHeureSortie(LocalDateTime heureSortie){
        this.heureSortie = heureSortie;
    }
    public LocalDateTime getHeureSortieFrom(){
        return this.heureSortieFrom;
    }
    public void setHeureSortieFrom(LocalDateTime heureSortieFrom){
        this.heureSortieFrom = heureSortieFrom;
    }
    public LocalDateTime getHeureSortieTo(){
        return this.heureSortieTo;
    }
    public void setHeureSortieTo(LocalDateTime heureSortieTo){
        this.heureSortieTo = heureSortieTo;
    }
    public String getTempsRetard(){
        return this.tempsRetard;
    }
    public void setTempsRetard(String tempsRetard){
        this.tempsRetard = tempsRetard;
    }   
    public String getTempsRetardMin(){
        return this.tempsRetardMin;
    }
    public void setTempsRetardMin(String tempsRetardMin){
        this.tempsRetardMin = tempsRetardMin;
    }
    public String getTempsRetardMax(){
        return this.tempsRetardMax;
    }
    public void setTempsRetardMax(String tempsRetardMax){
        this.tempsRetardMax = tempsRetardMax;
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
