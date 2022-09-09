package com.hibernate.unidirectional.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		
		Employee emp1 =new Employee();
		emp1.setDescription("i am Ram ");
		
		PermanentAddress add1=new PermanentAddress();
		add1.setDescription(" Street Description st no 3");
		
		
		emp1.setAddress(add1);
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(emp1);
		transaction.commit();
		
		
		session.close();
		sessionFactory.close();
		
		

	}

}
