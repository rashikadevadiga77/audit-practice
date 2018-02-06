package com.rashika.dto;

import lombok.Data;

@Data
public class BarDto {
	private int id;
	private String name;

	public BarDto() {
		// TODO Auto-generated constructor stub
	}
	
	public BarDto(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
