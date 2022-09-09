package com.hibernate.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class AddressTest {
	public static void main(String[] args)throws IOException {
		System.out.println("Project started..");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating student
		Student st=new Student();
		st.setId(108);
		st.setName("Ankit");
		st.setCity("Delhi");
		System.out.println(st);	
		
		//creating object of address class
		Address ad=new Address();
		ad.setStreet("street2 ");
		ad.setCity("Kanpur");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.234);
		
		// Reading image
		FileInputStream fis=new FileInputStream("src/main/java/pic.png");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);		
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(st);	
		session.save(ad);
		
		tx.commit();		
		session.close();
		System.out.println("Done..");
		
		
		
		
		
		
	

	}
}
