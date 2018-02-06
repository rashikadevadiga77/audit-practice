package com.rashika.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rashika.dto.BarDto;
import com.rashika.dto.mappers.BarMapper;
import com.rashika.entity.Bar;
import com.rashika.services.BarService;

@RestController
@RequestMapping("/bars")
public class BarController {

	@Autowired
	BarMapper barMapper;

	@Autowired
	BarService barService;

	@RequestMapping("/")
	public List<BarDto> getAllBars() {
		BarDto barDto = new BarDto(1, "A");
		barService.updateBar(barMapper.toBarEntity(barDto));
		List<Bar> bars = barService.getAllBars();
		return barMapper.toBarDTOList(bars);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateBar(@RequestBody BarDto barDto, @PathVariable Integer id) {
		Bar bar = barMapper.toBarEntity(barDto);
		barService.updateBar(bar);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}")
	public ResponseEntity<Void> insertBar(@RequestBody BarDto barDto, @PathVariable Integer id) {
		Bar bar = barMapper.toBarEntity(barDto);
		barService.updateBar(bar);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
