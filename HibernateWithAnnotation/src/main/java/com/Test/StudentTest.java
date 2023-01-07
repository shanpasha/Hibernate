package com.Test;

import org.hibernate.Session;

import com.DAO.StudentDaoImpl;
import com.SessionUtil.SessionUtill;
import com.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		
		
		Session session=SessionUtill.getSession();
		session.clear();
		Student student=(Student) session.load(Student.class, 1);
		System.out.println(student);
		
		Student s=new Student(31, "sunny", 56000, "knr", "sunny@gmail.com");
		session.save(s);                     
		session.beginTransaction().commit();
		
		session.close();
		
		
		
	
	
		
		
		
		
	}

}
