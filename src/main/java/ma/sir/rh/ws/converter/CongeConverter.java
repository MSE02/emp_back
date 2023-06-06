package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.rh.bean.core.Employee;

import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.CongeHistory;
import ma.sir.rh.bean.core.Conge;
import ma.sir.rh.ws.dto.CongeDto;

@Component
public class CongeConverter extends AbstractConverter<Conge, CongeDto, CongeHistory> {

    @Autowired
    private TypeCongeConverter typeCongeConverter ;
    @Autowired
    private EmployeeConverter employeeConverter ;
    private boolean typeConge;
    private boolean employee;

    public  CongeConverter(){
        super(Conge.class, CongeDto.class, CongeHistory.class);
    }

    @Override
    public Conge toItem(CongeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Conge item = new Conge();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDurre()))
                item.setDurre(dto.getDurre());
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if(StringUtil.isNotEmpty(dto.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(dto.getDateFin()));
            if(this.typeConge && dto.getTypeConge()!=null)
                item.setTypeConge(typeCongeConverter.toItem(dto.getTypeConge())) ;

            if(dto.getEmployee() != null && dto.getEmployee().getId() != null){
                item.setEmployee(new Employee());
                item.getEmployee().setId(dto.getEmployee().getId());
            }



        return item;
        }
    }

    @Override
    public CongeDto toDto(Conge item) {
        if (item == null) {
            return null;
        } else {
            CongeDto dto = new CongeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getDurre()))
                dto.setDurre(item.getDurre());
            if(item.getDateDebut()!=null)
                dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
            if(item.getDateFin()!=null)
                dto.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
        if(this.typeConge && item.getTypeConge()!=null) {
            dto.setTypeConge(typeCongeConverter.toDto(item.getTypeConge())) ;
        }
        if(this.employee && item.getEmployee()!=null) {
            dto.setEmployee(employeeConverter.toDto(item.getEmployee())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.typeConge = value;
        this.employee = value;
    }


    public TypeCongeConverter getTypeCongeConverter(){
        return this.typeCongeConverter;
    }
    public void setTypeCongeConverter(TypeCongeConverter typeCongeConverter ){
        this.typeCongeConverter = typeCongeConverter;
    }
    public EmployeeConverter getEmployeeConverter(){
        return this.employeeConverter;
    }
    public void setEmployeeConverter(EmployeeConverter employeeConverter ){
        this.employeeConverter = employeeConverter;
    }
    public boolean  isTypeConge(){
        return this.typeConge;
    }
    public void  setTypeConge(boolean typeConge){
        this.typeConge = typeConge;
    }
    public boolean  isEmployee(){
        return this.employee;
    }
    public void  setEmployee(boolean employee){
        this.employee = employee;
    }
}
