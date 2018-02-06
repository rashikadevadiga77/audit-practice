package com.rashika.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "bar")
@Data
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

	@Column(name = "created_date", updatable = false)
	@CreatedDate
	private long createdDate;

	@Column(name = "modified_date")
	@LastModifiedDate
	private long modifiedDate;

	@Column(name = "created_by", updatable = false)
	@CreatedBy
	private String createdBy;

	@Column(name = "modified_by")
	@LastModifiedBy
	private String lastModifiedBy;

}
