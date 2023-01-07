package com.Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.SessionUtil.SessionUtill;
import com.model.Student;

public class HqlQuarys { 
	public static void main(String[] args) {
		
		Session session=SessionUtill.getSession();
		
		List<Student> Stu=session.createQuery("From Student").list();

         session.beginTransaction().commit();
		
        Stu.stream().forEach(System.out::println);
        
		
//     Query query=session.createQuery("From  Student where id=?");
//      query.setParameter(0, 1);
//      List< Student> stu=query.list();
//      session.beginTransaction().commit();
//
//     
//		for (Student student : stu) {
//			System.out.println(student);
//		}
	
		//getById particular column
		
//		Query query=session.createQuery("select id,name from Student where id=?");
//		
//	List<Object[]>ss=	query.setParameter(0, 2).list();
//	
//	for (Object student[] : ss) {
//		System.out.println("id "+student[0]+" name "+student[1]);
//		
//	}
		
		///getByName
		
//	 Query  query2=session.createQuery("From Student where name=?");
//	 query2.setParameter(0, "rr");
//	 
//	 List<Student> list=query2.list();
//	 session.beginTransaction().commit();
//	 
//	 for (Student student : list) {
//		 System.out.println(student);
//		
//	}
	 
	 
	 Query query3=session.createQuery("update Student set name=? where id=?");
	 
	 query3.setParameter(0, "");
	 query3.setParameter(1,8);
	 query3.executeUpdate();
	 
	 session.beginTransaction().commit();
	 

		
		
		
		
		
	}

}
