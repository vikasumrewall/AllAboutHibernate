package com.hibernate.bidirectional.onetoone;

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
public class Citizen implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	
	@OneToOne(mappedBy = "citizen", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Aadhar aadhar;
	
	
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + "]";
	}
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
