package com.rashika.dto.mappers;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import com.rashika.dto.BarDto;
import com.rashika.entity.Bar;

@Mapper(componentModel="spring")
@Component
public interface BarMapper {

	@Mappings({ @Mapping(source = "id", target = "id"), @Mapping(source = "name", target = "name") })
	@Named("toBarDto")
	abstract public BarDto toBarDto(Bar bar);

	@Mappings({ @Mapping(source = "id", target = "id"), @Mapping(source = "name", target = "name") })
	@Named("toBarEntity")
	abstract public Bar toBarEntity(BarDto barDto);

	@IterableMapping(qualifiedByName = "toBunitDto")
	abstract public List<BarDto> toBarDTOList(List<Bar> barList);

	@IterableMapping(qualifiedByName = "toBarEntity")
	abstract public List<Bar> toBarList(List<BarDto> barDtoList);
}
