package ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.rh.bean.core.Employee;

import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.AbsenceHistory;
import ma.sir.rh.bean.core.Absence;
import ma.sir.rh.ws.dto.AbsenceDto;

@Component
public class AbsenceConverter extends AbstractConverter<Absence, AbsenceDto, AbsenceHistory> {

    @Autowired
    private TypeAbsenceConverter typeAbsenceConverter;
    @Autowired
    private EmployeeConverter employeeConverter;
    private boolean typeAbsence;
    private boolean employee;

    public AbsenceConverter() {
        super(Absence.class, AbsenceDto.class, AbsenceHistory.class);
    }

    @Override
    public Absence toItem(AbsenceDto dto) {
        if (dto == null) {
            return null;
        } else {
            Absence item = new Absence();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getDuree()))
                item.setDuree(dto.getDuree());
            if (StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if (StringUtil.isNotEmpty(dto.getDateFinA()))
                item.setDateFinA(DateUtil.stringEnToDate(dto.getDateFinA()));
            if (StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if (this.typeAbsence && dto.getTypeAbsence() != null)
                item.setTypeAbsence(typeAbsenceConverter.toItem(dto.getTypeAbsence()));

            if (dto.getEmployee() != null && dto.getEmployee().getId() != null) {
                item.setEmployee(new Employee());
                item.getEmployee().setId(dto.getEmployee().getId());
            }


            return item;
        }
    }

    @Override
    public AbsenceDto toDto(Absence item) {
        if (item == null) {
            return null;
        } else {
            AbsenceDto dto = new AbsenceDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getDuree()))
                dto.setDuree(item.getDuree());
            if (item.getDateDebut() != null)
                dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
            if (item.getDateFinA() != null)
                dto.setDateFinA(DateUtil.dateTimeToString(item.getDateFinA()));
            if (StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if (this.typeAbsence && item.getTypeAbsence() != null) {
                dto.setTypeAbsence(typeAbsenceConverter.toDto(item.getTypeAbsence()));
            }
            if (this.employee && item.getEmployee() != null) {
                dto.setEmployee(employeeConverter.toDto(item.getEmployee()));
            }


            return dto;
        }
    }


    public void initObject(boolean value) {
        this.typeAbsence = value;
        this.employee = value;
    }


    public TypeAbsenceConverter getTypeAbsenceConverter() {
        return this.typeAbsenceConverter;
    }

    public void setTypeAbsenceConverter(TypeAbsenceConverter typeAbsenceConverter) {
        this.typeAbsenceConverter = typeAbsenceConverter;
    }

    public EmployeeConverter getEmployeeConverter() {
        return this.employeeConverter;
    }

    public void setEmployeeConverter(EmployeeConverter employeeConverter) {
        this.employeeConverter = employeeConverter;
    }

    public boolean isTypeAbsence() {
        return this.typeAbsence;
    }

    public void setTypeAbsence(boolean typeAbsence) {
        this.typeAbsence = typeAbsence;
    }

    public boolean isEmployee() {
        return this.employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }
}
