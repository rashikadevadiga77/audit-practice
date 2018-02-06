package com.rashika.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.Data;

@Entity
@Table(name = "bar")
@Data
@Audited
public class Bar implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "bar_id")
	private int id;

	@Column(name = "bar_name")
	private String name;

}
