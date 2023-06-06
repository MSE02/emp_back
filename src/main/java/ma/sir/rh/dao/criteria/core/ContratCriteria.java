package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class ContratCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private LocalDateTime dateContrat;
    private LocalDateTime dateContratFrom;
    private LocalDateTime dateContratTo;
    private String description;
    private String descriptionLike;

    private EmployeeCriteria employee ;
    private List<EmployeeCriteria> employees ;
    private TypeContratCriteria typeContrat ;
    private List<TypeContratCriteria> typeContrats ;


    public ContratCriteria(){}

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

    public LocalDateTime getDateContrat(){
        return this.dateContrat;
    }
    public void setDateContrat(LocalDateTime dateContrat){
        this.dateContrat = dateContrat;
    }
    public LocalDateTime getDateContratFrom(){
        return this.dateContratFrom;
    }
    public void setDateContratFrom(LocalDateTime dateContratFrom){
        this.dateContratFrom = dateContratFrom;
    }
    public LocalDateTime getDateContratTo(){
        return this.dateContratTo;
    }
    public void setDateContratTo(LocalDateTime dateContratTo){
        this.dateContratTo = dateContratTo;
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
    public TypeContratCriteria getTypeContrat(){
        return this.typeContrat;
    }

    public void setTypeContrat(TypeContratCriteria typeContrat){
        this.typeContrat = typeContrat;
    }
    public List<TypeContratCriteria> getTypeContrats(){
        return this.typeContrats;
    }

    public void setTypeContrats(List<TypeContratCriteria> typeContrats){
        this.typeContrats = typeContrats;
    }
}
