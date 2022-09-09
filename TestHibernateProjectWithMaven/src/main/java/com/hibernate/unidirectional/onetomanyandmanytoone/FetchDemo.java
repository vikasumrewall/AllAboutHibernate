package com.hibernate.unidirectional.onetomanyandmanytoone;

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

		Question q = (Question) s.get(Question.class, 1212);		
		
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		
		System.out.println(q.getAnswers().size());

	
		

		// fetching question from answers........
		Answer ans1=s.get(Answer.class, 343);
		System.out.println(ans1.getAnswerId());
		System.out.println(ans1.getAnswer());
		System.out.println(ans1.getQuestion().getQuestion());
		
		
		
		

		s.close();

		factory.close();

	}
}
