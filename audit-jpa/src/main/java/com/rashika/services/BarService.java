package com.rashika.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashika.entity.Bar;
import com.rashika.repository.BarRepository;

@Service
@Transactional
public class BarService {
	@Autowired
	BarRepository repository;

	@Transactional
	public void updateBar(Bar bar) {
		repository.save(bar);
	}
	
	public List<Bar> getAllBars(){
		return (List<Bar>) repository.findAll();
	}

}
