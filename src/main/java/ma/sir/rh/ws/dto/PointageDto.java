package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PointageDto  extends AuditBaseDto {

    private String code  ;
    private String heureArrive ;
    private String heureSortie ;
    private Integer tempsRetard  = 0 ;

    private EmployeeDto employee ;



    public PointageDto(){
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
    public String getHeureArrive(){
        return this.heureArrive;
    }
    public void setHeureArrive(String heureArrive){
        this.heureArrive = heureArrive;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getHeureSortie(){
        return this.heureSortie;
    }
    public void setHeureSortie(String heureSortie){
        this.heureSortie = heureSortie;
    }

    @Log
    public Integer getTempsRetard(){
        return this.tempsRetard;
    }
    public void setTempsRetard(Integer tempsRetard){
        this.tempsRetard = tempsRetard;
    }


    public EmployeeDto getEmployee(){
        return this.employee;
    }

    public void setEmployee(EmployeeDto employee){
        this.employee = employee;
    }




}
