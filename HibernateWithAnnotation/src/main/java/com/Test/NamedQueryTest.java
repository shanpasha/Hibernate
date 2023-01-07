package com.Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import com.SessionUtil.SessionUtill;
import com.model.Student;

public class NamedQueryTest {
	public static void main(String[] args) {
		
		Session session=SessionUtill.getSession();
		
//		Query query=session.getNamedQuery("Select_all");
		Query query=session.getNamedQuery("select_from_stu");
		
		List<Student> s=query.list();
		
		for (Student student : s) {
			System.out.println(student);
		}
		
		
		
		
		
		
		
	}
	

}
