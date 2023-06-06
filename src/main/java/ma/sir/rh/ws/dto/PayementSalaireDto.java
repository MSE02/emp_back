package  ma.sir.rh.ws.dto;

import ma.sir.rh.bean.core.Absence;
import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PayementSalaireDto  extends AuditBaseDto {

    private String code  ;
    private Integer mois  = 0 ;
    private Integer annee  = 0 ;
    private BigDecimal salaire  ;
    private Integer nombreJoursConge  = 0 ;
    private Integer nombreJoursAbsence  = 0 ;
    private BigDecimal baisseSalaire  ;
    private BigDecimal salaireFinal  ;

    private EmployeeDto employee ;



    public PayementSalaireDto(){
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
    public Integer getMois(){
        return this.mois;
    }
    public void setMois(Integer mois){
        this.mois = mois;
    }

    @Log
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }

    @Log
    public BigDecimal getSalaire(){
        return this.salaire;
    }
    public void setSalaire(BigDecimal salaire){
        this.salaire = salaire;
    }

    @Log
    public Integer getNombreJoursConge(){
        return this.nombreJoursConge;
    }
    public void setNombreJoursConge(Integer nombreJoursConge){
        this.nombreJoursConge = nombreJoursConge;
    }

    @Log
    public Integer getNombreJoursAbsence(){
        return this.nombreJoursAbsence;
    }
    public void setNombreJoursAbsence(Integer nombreJoursAbsence){
        this.nombreJoursAbsence = nombreJoursAbsence;
    }

    @Log
    public BigDecimal getBaisseSalaire(){
        return this.baisseSalaire;
    }
    public void setBaisseSalaire(BigDecimal baisseSalaire){
        this.baisseSalaire = baisseSalaire;
    }

    @Log
    public BigDecimal getSalaireFinal(){
        return this.salaireFinal;
    }
    public void setSalaireFinal(BigDecimal salaireFinal){
        this.salaireFinal = salaireFinal;
    }


    public EmployeeDto getEmployee(){
        return this.employee;
    }

    public void setEmployee(EmployeeDto employee){
        this.employee = employee;
    }


}
