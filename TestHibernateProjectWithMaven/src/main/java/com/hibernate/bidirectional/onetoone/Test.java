package com.hibernate.bidirectional.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Aadhar aadhar1=new Aadhar();
		//aadhar1.setId(33l);
		aadhar1.setNumber("123456789");
		
		Citizen citizen1=new Citizen();
		citizen1.setName("Ram");
		citizen1.setAadhar(aadhar1);
		
		
		aadhar1.setCitizen(citizen1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		//s.save(aadhar1);
		s.save(citizen1);
		
		
		tx.commit();
		
		s.close();
		factory.close();

	}

}
