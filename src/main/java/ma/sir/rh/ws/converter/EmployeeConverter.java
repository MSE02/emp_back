package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.rh.zynerator.util.ListUtil;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.EmployeeHistory;
import ma.sir.rh.bean.core.Employee;
import ma.sir.rh.ws.dto.EmployeeDto;

@Component
public class EmployeeConverter extends AbstractConverter<Employee, EmployeeDto, EmployeeHistory> {

    @Autowired
    private TypeAbsenceConverter typeAbsenceConverter ;
    @Autowired
    private AbsenceConverter absenceConverter ;
    @Autowired
    private CongeConverter congeConverter ;
    @Autowired
    private ContratConverter contratConverter ;
    @Autowired
    private UniteAdministrativeConverter uniteAdministrativeConverter ;
    @Autowired
    private TypeCongeConverter typeCongeConverter ;
    @Autowired
    private CategorieEmployeeConverter categorieEmployeeConverter ;
    private boolean contrat;
    private boolean uniteAdministrative;
    private boolean categorieEmployee;
    private boolean absences;
    private boolean conges;

    public  EmployeeConverter(){
        super(Employee.class, EmployeeDto.class, EmployeeHistory.class);
        init(true);
    }

    @Override
    public Employee toItem(EmployeeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Employee item = new Employee();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getDateNaissance()))
                item.setDateNaissance(DateUtil.stringEnToDate(dto.getDateNaissance()));
            if(StringUtil.isNotEmpty(dto.getLieuNaissance()))
                item.setLieuNaissance(dto.getLieuNaissance());
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());
            if(StringUtil.isNotEmpty(dto.getTelephone()))
                item.setTelephone(dto.getTelephone());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getSalaireJour()))
                item.setSalaireJour(dto.getSalaireJour());
            if(StringUtil.isNotEmpty(dto.getSalaireMois()))
                item.setSalaireMois(dto.getSalaireMois());
            if(StringUtil.isNotEmpty(dto.getSoldeConge()))
                item.setSoldeConge(dto.getSoldeConge());
            if(StringUtil.isNotEmpty(dto.getCnss()))
                item.setCnss(dto.getCnss());
            if(this.contrat && dto.getContrat()!=null)
                item.setContrat(contratConverter.toItem(dto.getContrat())) ;

            if(this.uniteAdministrative && dto.getUniteAdministrative()!=null)
                item.setUniteAdministrative(uniteAdministrativeConverter.toItem(dto.getUniteAdministrative())) ;

            if(this.categorieEmployee && dto.getCategorieEmployee()!=null)
                item.setCategorieEmployee(categorieEmployeeConverter.toItem(dto.getCategorieEmployee())) ;


            if(this.absences && ListUtil.isNotEmpty(dto.getAbsences()))
                item.setAbsences(absenceConverter.toItem(dto.getAbsences()));
            if(this.conges && ListUtil.isNotEmpty(dto.getConges()))
                item.setConges(congeConverter.toItem(dto.getConges()));

        return item;
        }
    }

    @Override
    public EmployeeDto toDto(Employee item) {
        if (item == null) {
            return null;
        } else {
            EmployeeDto dto = new EmployeeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getCin()))
                dto.setCin(item.getCin());
            if(item.getDateNaissance()!=null)
                dto.setDateNaissance(DateUtil.dateTimeToString(item.getDateNaissance()));
            if(StringUtil.isNotEmpty(item.getLieuNaissance()))
                dto.setLieuNaissance(item.getLieuNaissance());
            if(StringUtil.isNotEmpty(item.getAdresse()))
                dto.setAdresse(item.getAdresse());
            if(StringUtil.isNotEmpty(item.getTelephone()))
                dto.setTelephone(item.getTelephone());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getSalaireJour()))
                dto.setSalaireJour(item.getSalaireJour());
            if(StringUtil.isNotEmpty(item.getSalaireMois()))
                dto.setSalaireMois(item.getSalaireMois());
            if(StringUtil.isNotEmpty(item.getSoldeConge()))
                dto.setSoldeConge(item.getSoldeConge());
            if(StringUtil.isNotEmpty(item.getCnss()))
                dto.setCnss(item.getCnss());
        if(this.contrat && item.getContrat()!=null) {
            contratConverter.setEmployee(false);
            dto.setContrat(contratConverter.toDto(item.getContrat())) ;
            contratConverter.setEmployee(true);
        }
        if(this.uniteAdministrative && item.getUniteAdministrative()!=null) {
            dto.setUniteAdministrative(uniteAdministrativeConverter.toDto(item.getUniteAdministrative())) ;
        }
        if(this.categorieEmployee && item.getCategorieEmployee()!=null) {
            dto.setCategorieEmployee(categorieEmployeeConverter.toDto(item.getCategorieEmployee())) ;
        }
        if(this.absences && ListUtil.isNotEmpty(item.getAbsences())){
            absenceConverter.init(true);
            absenceConverter.setEmployee(false);
            dto.setAbsences(absenceConverter.toDto(item.getAbsences()));
            absenceConverter.setEmployee(true);

        }
        if(this.conges && ListUtil.isNotEmpty(item.getConges())){
            congeConverter.init(true);
            congeConverter.setEmployee(false);
            dto.setConges(congeConverter.toDto(item.getConges()));
            congeConverter.setEmployee(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.absences = value;
        this.conges = value;
    }

    public void initObject(boolean value) {
        this.contrat = value;
        this.uniteAdministrative = value;
        this.categorieEmployee = value;
    }


    public TypeAbsenceConverter getTypeAbsenceConverter(){
        return this.typeAbsenceConverter;
    }
    public void setTypeAbsenceConverter(TypeAbsenceConverter typeAbsenceConverter ){
        this.typeAbsenceConverter = typeAbsenceConverter;
    }
    public AbsenceConverter getAbsenceConverter(){
        return this.absenceConverter;
    }
    public void setAbsenceConverter(AbsenceConverter absenceConverter ){
        this.absenceConverter = absenceConverter;
    }
    public CongeConverter getCongeConverter(){
        return this.congeConverter;
    }
    public void setCongeConverter(CongeConverter congeConverter ){
        this.congeConverter = congeConverter;
    }
    public ContratConverter getContratConverter(){
        return this.contratConverter;
    }
    public void setContratConverter(ContratConverter contratConverter ){
        this.contratConverter = contratConverter;
    }
    public UniteAdministrativeConverter getUniteAdministrativeConverter(){
        return this.uniteAdministrativeConverter;
    }
    public void setUniteAdministrativeConverter(UniteAdministrativeConverter uniteAdministrativeConverter ){
        this.uniteAdministrativeConverter = uniteAdministrativeConverter;
    }
    public TypeCongeConverter getTypeCongeConverter(){
        return this.typeCongeConverter;
    }
    public void setTypeCongeConverter(TypeCongeConverter typeCongeConverter ){
        this.typeCongeConverter = typeCongeConverter;
    }
    public CategorieEmployeeConverter getCategorieEmployeeConverter(){
        return this.categorieEmployeeConverter;
    }
    public void setCategorieEmployeeConverter(CategorieEmployeeConverter categorieEmployeeConverter ){
        this.categorieEmployeeConverter = categorieEmployeeConverter;
    }
    public boolean  isContrat(){
        return this.contrat;
    }
    public void  setContrat(boolean contrat){
        this.contrat = contrat;
    }
    public boolean  isUniteAdministrative(){
        return this.uniteAdministrative;
    }
    public void  setUniteAdministrative(boolean uniteAdministrative){
        this.uniteAdministrative = uniteAdministrative;
    }
    public boolean  isCategorieEmployee(){
        return this.categorieEmployee;
    }
    public void  setCategorieEmployee(boolean categorieEmployee){
        this.categorieEmployee = categorieEmployee;
    }
    public boolean  isAbsences(){
        return this.absences ;
    }
    public void  setAbsences(boolean absences ){
        this.absences  = absences ;
    }
    public boolean  isConges(){
        return this.conges ;
    }
    public void  setConges(boolean conges ){
        this.conges  = conges ;
    }
}
