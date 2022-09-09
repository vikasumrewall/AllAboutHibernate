package com.hibernate.unidirectional.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	private String description;
	
	@OneToOne( fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	//@JoinColumn(name="emp_id")
	private PermanentAddress address;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PermanentAddress getAddress() {
		return address;
	}

	public void setAddress(PermanentAddress address) {
		this.address = address;
	}

	
	
	
	
	
	

}
