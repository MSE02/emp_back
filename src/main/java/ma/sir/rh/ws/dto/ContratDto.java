package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContratDto  extends AuditBaseDto {

    private String code  ;
    private String dateContrat ;
    private String description  ;

    private EmployeeDto employee ;
    private TypeContratDto typeContrat ;



    public ContratDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateContrat(){
        return this.dateContrat;
    }
    public void setDateContrat(String dateContrat){
        this.dateContrat = dateContrat;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public EmployeeDto getEmployee(){
        return this.employee;
    }

    public void setEmployee(EmployeeDto employee){
        this.employee = employee;
    }
    public TypeContratDto getTypeContrat(){
        return this.typeContrat;
    }

    public void setTypeContrat(TypeContratDto typeContrat){
        this.typeContrat = typeContrat;
    }




}
