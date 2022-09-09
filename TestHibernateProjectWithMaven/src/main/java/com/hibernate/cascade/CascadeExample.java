package com.hibernate.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.unidirectional.onetomanyandmanytoone.Answer;
import com.hibernate.unidirectional.onetomanyandmanytoone.Question;





public class CascadeExample {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		Question q1=new Question();
		
		q1.setQuestionId(5625);
		q1.setQuestion("What is Swing framework");
		
		Answer a1 = new Answer(231423, "Use for development");
		Answer a2 = new Answer(2515, "Desktop");
		Answer a3 = new Answer(315, "learn by progammers");
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		
		q1.setAnswers(list);
		Transaction tx = s.beginTransaction();
		
		s.save(q1);
		
		
		tx.commit();
		s.close();
		factory.close();
	}
}
