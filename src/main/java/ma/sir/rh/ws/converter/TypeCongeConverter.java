package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.TypeCongeHistory;
import ma.sir.rh.bean.core.TypeConge;
import ma.sir.rh.ws.dto.TypeCongeDto;

@Component
public class TypeCongeConverter extends AbstractConverter<TypeConge, TypeCongeDto, TypeCongeHistory> {


    public  TypeCongeConverter(){
        super(TypeConge.class, TypeCongeDto.class, TypeCongeHistory.class);
    }

    @Override
    public TypeConge toItem(TypeCongeDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeConge item = new TypeConge();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getSolde()))
                item.setSolde(dto.getSolde());


        return item;
        }
    }

    @Override
    public TypeCongeDto toDto(TypeConge item) {
        if (item == null) {
            return null;
        } else {
            TypeCongeDto dto = new TypeCongeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getSolde()))
                dto.setSolde(item.getSolde());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
