package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateorm.Admin;
import com.hibernateorm.HEmployee;
import com.hibernateorm.SEmployee;

public class Test {

	public static void main(String[] args) 
	{
		
		Configuration cfg=new Configuration();
		 cfg.configure("hibernate.cfg8.xml");
		 SessionFactory sf=cfg.buildSessionFactory();
		 Session session=sf.openSession();
		 session.beginTransaction();
		 SEmployee se=new SEmployee(112,"abc","abc@gmail.com",5000,"hibernate");
		 HEmployee sh=new HEmployee(222,"lmn","lmn@gmail.com",6000,10);
		 Admin  ad=new Admin(333,"xyz","xyz@gmail.com",6000,"bangalore");
		 session.save(se);
		 session.save(sh);
		 session.save(ad);
		 session.beginTransaction().commit();
		 session.close();
		 sf.close();
		 
	}

}
