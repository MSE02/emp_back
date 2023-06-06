package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class CongeDto  extends AuditBaseDto {

    private String code  ;
    private Integer durre  = 0 ;
    private String dateDebut ;
    private String dateFin ;

    private TypeCongeDto typeConge ;
    private EmployeeDto employee ;



    public CongeDto(){
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
    public Integer getDurre(){
        return this.durre;
    }
    public void setDurre(Integer durre){
        this.durre = durre;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(String dateDebut){
        this.dateDebut = dateDebut;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(String dateFin){
        this.dateFin = dateFin;
    }


    public TypeCongeDto getTypeConge(){
        return this.typeConge;
    }

    public void setTypeConge(TypeCongeDto typeConge){
        this.typeConge = typeConge;
    }
    public EmployeeDto getEmployee(){
        return this.employee;
    }

    public void setEmployee(EmployeeDto employee){
        this.employee = employee;
    }




}
