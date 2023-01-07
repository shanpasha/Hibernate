package com.Test;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.SessionUtil.SessionUtill;
import com.model.Student;

public class NativeSQL {
	
	
	public static void main(String[] args) {
		
		Session session=SessionUtill.getSession();
		
	// nativeSQLQuery getbyName&Id

	//	SQLQuery query=session.createSQLQuery("SELECT *FROM STUDENT WHERE NAME=? and id=?");
//		query.setParameter(0, "shan");
//		query.setParameter(1,2);
//		session.beginTransaction().commit();
//		query.addEntity(Student.class);
//		List<Student> stu=query.list();
//		
//		
//		for (Student student : stu) {
//			System.out.println(student);
//		}
		
		/// Drop a column
//		SQLQuery query1=session.createSQLQuery("alter table student drop column mobile");
//		query1.executeUpdate();
//		session.beginTransaction().commit();
//		session.close();
		
		
		
		
//	SQLQuery query3=session.createSQLQuery("Alter table Student add  mobile varchar(10)");
//	query3.executeUpdate();
	
	
//	session.close();
	
		
	}

}
