package com.rashika.entity;

import com.rashika.dto.BarDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-02-04T22:48:58+0530",
    comments = "version: 1.2.0.CR1, compiler: javac, environment: Java 1.8.0_152 (Oracle Corporation)"
)
@Component
public class BarMapperImpl implements BarMapper {

    @Override
    public BarDto toBarDto(Bar bar) {
        if ( bar == null ) {
            return null;
        }

        BarDto barDto = new BarDto();

        barDto.setId( bar.getId() );
        barDto.setName( bar.getName() );

        return barDto;
    }

    @Override
    public Bar toBarEntity(BarDto barDto) {
        if ( barDto == null ) {
            return null;
        }

        Bar bar = new Bar();

        bar.setId( barDto.getId() );
        bar.setName( barDto.getName() );

        return bar;
    }

    @Override
    public List<BarDto> toBarDTOList(List<Bar> businessUnitlist) {
        if ( businessUnitlist == null ) {
            return null;
        }

        List<BarDto> list = new ArrayList<BarDto>( businessUnitlist.size() );
        for ( Bar bar : businessUnitlist ) {
            list.add( toBarDto( bar ) );
        }

        return list;
    }

    @Override
    public List<Bar> toBarList(List<BarDto> businessUnitlist) {
        if ( businessUnitlist == null ) {
            return null;
        }

        List<Bar> list = new ArrayList<Bar>( businessUnitlist.size() );
        for ( BarDto barDto : businessUnitlist ) {
            list.add( toBarEntity( barDto ) );
        }

        return list;
    }
}
