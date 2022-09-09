package com.hibernate.bidirectional.onetoone;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String number;
	
	@OneToOne
	private Citizen citizen;
	
	public Citizen getCitizen() {
		return citizen;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	public Aadhar(Long id, String number) {
		super();
		this.id = id;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", number=" + number + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Aadhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
