package com.hibernate.bidirectional.onetomanyandmanytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
//
		// creating question
		QuestionBidirectional q1 = new QuestionBidirectional();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java ?");

		// creating answer
		AnswerBidirectional answer = new AnswerBidirectional();
		answer.setAnswerId(343);
		answer.setAnswer("Java is programming langauge");
		

		AnswerBidirectional answer1 = new AnswerBidirectional();
		answer1.setAnswerId(33);
		answer1.setAnswer("With the help of java we can create softwares");
		

		AnswerBidirectional answer2 = new AnswerBidirectional();
		answer2.setAnswerId(363);
		answer2.setAnswer("java has different type of frameworks.");
		
		
		List<AnswerBidirectional> list=new ArrayList<AnswerBidirectional>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);		
		q1.setAnswerBidirectional(list);

//		// session

		Session s = factory.openSession();

		Transaction tx = s.beginTransaction();

		// save
		s.save(q1);
		s.save(answer);
		s.save(answer1);
		s.save(answer2);

		QuestionBidirectional q = (QuestionBidirectional) s.get(QuestionBidirectional.class, 1212);		
		
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		
		System.out.println(q.getAnswerBidirectional().size());

	
		tx.commit();



		s.close();

		factory.close();

	}
}
