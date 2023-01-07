package com.Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;

import com.SessionUtil.SessionUtill;
import com.model.Student;

public class Projections {
	public static void main(String[] args) {
		
		Session session=SessionUtill.getSession();
		
		Criteria criteria=session.createCriteria(Student.class);
		
		criteria.setProjection(org.hibernate.criterion.Projections.min("fee"));
	List<Student> s= 	criteria.list();
	System.out.println("minimum "+s);
		
	criteria.setProjection(org.hibernate.criterion.Projections.max("fee"));
	List<Student> s1= 	criteria.list();
	System.out.println("maximum "+s1);
	
	criteria.setProjection(org.hibernate.criterion.Projections.rowCount());
	List<Student> s2= 	criteria.list();
	System.out.println("Rows count  "+s2);
	
//	criteria.setProjection(org.hibernate.criterion.Projections.distinct());
//	List<Student> s3= 	criteria.list();
//	System.out.println("Rows count  "+s3);
		
		
		
		
	}

}
