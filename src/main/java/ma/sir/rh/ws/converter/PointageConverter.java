package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.rh.bean.core.Employee;

import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.PointageHistory;
import ma.sir.rh.bean.core.Pointage;
import ma.sir.rh.ws.dto.PointageDto;

@Component
public class PointageConverter extends AbstractConverter<Pointage, PointageDto, PointageHistory> {

    @Autowired
    private EmployeeConverter employeeConverter ;
    private boolean employee;

    public  PointageConverter(){
        super(Pointage.class, PointageDto.class, PointageHistory.class);
    }

    @Override
    public Pointage toItem(PointageDto dto) {
        if (dto == null) {
            return null;
        } else {
        Pointage item = new Pointage();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getHeureArrive()))
                item.setHeureArrive(DateUtil.stringEnToDate(dto.getHeureArrive()));
            if(StringUtil.isNotEmpty(dto.getHeureSortie()))
                item.setHeureSortie(DateUtil.stringEnToDate(dto.getHeureSortie()));
            if(StringUtil.isNotEmpty(dto.getTempsRetard()))
                item.setTempsRetard(dto.getTempsRetard());
            if(dto.getEmployee() != null && dto.getEmployee().getId() != null){
                item.setEmployee(new Employee());
                item.getEmployee().setId(dto.getEmployee().getId());
            }



        return item;
        }
    }

    @Override
    public PointageDto toDto(Pointage item) {
        if (item == null) {
            return null;
        } else {
            PointageDto dto = new PointageDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(item.getHeureArrive()!=null)
                dto.setHeureArrive(DateUtil.dateTimeToString(item.getHeureArrive()));
            if(item.getHeureSortie()!=null)
                dto.setHeureSortie(DateUtil.dateTimeToString(item.getHeureSortie()));
            if(StringUtil.isNotEmpty(item.getTempsRetard()))
                dto.setTempsRetard(item.getTempsRetard());
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
