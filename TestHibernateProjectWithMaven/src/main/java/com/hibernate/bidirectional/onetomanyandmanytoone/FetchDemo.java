package com.hibernate.bidirectional.onetomanyandmanytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();


		Session s = factory.openSession();

		

		// fetching answers from question........

		QuestionBidirectional q = (QuestionBidirectional) s.get(QuestionBidirectional.class, 1212);		
		
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		
		//System.out.println(q.getAnswers().size());

	
		

		
		
		
		
		

		s.close();

		factory.close();

	}
}
