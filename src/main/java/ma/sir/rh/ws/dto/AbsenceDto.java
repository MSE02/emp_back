package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbsenceDto  extends AuditBaseDto {

    private String dateDebut ;
    private String dateFinA ;
    private int duree  = 0 ;
    private String description  ;

    private TypeAbsenceDto typeAbsence ;
    private EmployeeDto employee ;



    public AbsenceDto(){
        super();
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
    public String getDateFinA(){
        return this.dateFinA;
    }
    public void setDateFinA(String dateFinA){
        this.dateFinA = dateFinA;
    }
    @Log
    public int getDuree() {return duree;}
    public void setDuree(int duree) {this.duree = duree;}
    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public TypeAbsenceDto getTypeAbsence(){
        return this.typeAbsence;
    }

    public void setTypeAbsence(TypeAbsenceDto typeAbsence){
        this.typeAbsence = typeAbsence;
    }
    public EmployeeDto getEmployee(){
        return this.employee;
    }

    public void setEmployee(EmployeeDto employee){
        this.employee = employee;
    }




}
