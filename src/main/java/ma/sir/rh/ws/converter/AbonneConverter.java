package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.AbonneHistory;
import ma.sir.rh.bean.core.Abonne;
import ma.sir.rh.ws.dto.AbonneDto;

@Component
public class AbonneConverter extends AbstractConverter<Abonne, AbonneDto, AbonneHistory> {


    public  AbonneConverter(){
        super(Abonne.class, AbonneDto.class, AbonneHistory.class);
    }

    @Override
    public Abonne toItem(AbonneDto dto) {
        if (dto == null) {
            return null;
        } else {
        Abonne item = new Abonne();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getTel()))
                item.setTel(dto.getTel());
            if(StringUtil.isNotEmpty(dto.getCnss()))
                item.setCnss(dto.getCnss());
            if(StringUtil.isNotEmpty(dto.getDateCreation()))
                item.setDateCreation(DateUtil.stringEnToDate(dto.getDateCreation()));


        return item;
        }
    }

    @Override
    public AbonneDto toDto(Abonne item) {
        if (item == null) {
            return null;
        } else {
            AbonneDto dto = new AbonneDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getTel()))
                dto.setTel(item.getTel());
            if(StringUtil.isNotEmpty(item.getCnss()))
                dto.setCnss(item.getCnss());
            if(item.getDateCreation()!=null)
                dto.setDateCreation(DateUtil.dateTimeToString(item.getDateCreation()));


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
