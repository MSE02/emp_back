package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeCongeDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private BigDecimal solde  ;




    public TypeCongeDto(){
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
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public BigDecimal getSolde(){
        return this.solde;
    }
    public void setSolde(BigDecimal solde){
        this.solde = solde;
    }






}
