package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.rh.bean.core.Employee;

import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.bean.history.PayementSalaireHistory;
import ma.sir.rh.bean.core.PayementSalaire;
import ma.sir.rh.ws.dto.PayementSalaireDto;

@Component
public class PayementSalaireConverter extends AbstractConverter<PayementSalaire, PayementSalaireDto, PayementSalaireHistory> {

    @Autowired
    private EmployeeConverter employeeConverter ;
    private boolean employee;

    public  PayementSalaireConverter(){
        super(PayementSalaire.class, PayementSalaireDto.class, PayementSalaireHistory.class);
        init(true);
    }

    @Override
    public PayementSalaire toItem(PayementSalaireDto dto) {
        if (dto == null) {
            return null;
        } else {
        PayementSalaire item = new PayementSalaire();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getMois()))
                item.setMois(dto.getMois());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(StringUtil.isNotEmpty(dto.getSalaire()))
                item.setSalaire(dto.getSalaire());
            if(StringUtil.isNotEmpty(dto.getNombreJoursConge()))
                item.setNombreJoursConge(dto.getNombreJoursConge());
            if(StringUtil.isNotEmpty(dto.getNombreJoursAbsence()))
                item.setNombreJoursAbsence(dto.getNombreJoursAbsence());
            if(StringUtil.isNotEmpty(dto.getBaisseSalaire()))
                item.setBaisseSalaire(dto.getBaisseSalaire());
            if(StringUtil.isNotEmpty(dto.getSalaireFinal()))
                item.setSalaireFinal(dto.getSalaireFinal());
            if(dto.getEmployee() != null && dto.getEmployee().getId() != null){
                item.setEmployee(new Employee());
                item.setEmployee(employeeConverter.toItem(dto.getEmployee()));
                item.getEmployee().setId(dto.getEmployee().getId());
            }



        return item;
        }
    }

    @Override
    public PayementSalaireDto toDto(PayementSalaire item) {
        if (item == null) {
            return null;
        } else {
            PayementSalaireDto dto = new PayementSalaireDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getMois()))
                dto.setMois(item.getMois());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
            if(StringUtil.isNotEmpty(item.getSalaire()))
                dto.setSalaire(item.getSalaire());
            if(StringUtil.isNotEmpty(item.getNombreJoursConge()))
                dto.setNombreJoursConge(item.getNombreJoursConge());
            if(StringUtil.isNotEmpty(item.getNombreJoursAbsence()))
                dto.setNombreJoursAbsence(item.getNombreJoursAbsence());
            if(StringUtil.isNotEmpty(item.getBaisseSalaire()))
                dto.setBaisseSalaire(item.getBaisseSalaire());
            if(StringUtil.isNotEmpty(item.getSalaireFinal()))
                dto.setSalaireFinal(item.getSalaireFinal());
        if(this.employee && item.getEmployee()!=null) {
            dto.setEmployee(employeeConverter.toDto(item.getEmployee())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.employee = value;
    }


    public EmployeeConverter getEmployeeConverter(){
        return this.employeeConverter;
    }
    public void setEmployeeConverter(EmployeeConverter employeeConverter ){
        this.employeeConverter = employeeConverter;
    }
    public boolean  isEmployee(){
        return this.employee;
    }
    public void  setEmployee(boolean employee){
        this.employee = employee;
    }
}
