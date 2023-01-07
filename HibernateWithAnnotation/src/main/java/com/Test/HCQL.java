package com.Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.SessionUtil.SessionUtill;
import com.model.Student;

public class HCQL {
	public static void main(String[] args) {
		
		Session session=SessionUtill.getSession();
		
//		Criteria criteria=session.createCriteria(Student.class);
//		
//		criteria.add(Restrictions.le("fee",65000.00));
//		criteria.add(Restrictions.le("name","r"));
//		List<Student> l=criteria.list();
//		for (Student student : l) {
//			System.out.println(student);
//		}
		
		//----------------------------------------------------------------------------------
		
//		criteria.add(Restrictions.between("fee", 16000.0,60000.0));
//		List<Object> list=criteria.list();
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
		
		
//		criteria.add(Restrictions.or(Restrictions.ilike("name", "mahesh"),Restrictions.gt("fee", .0)));
//		
//	List<Object> list=criteria.list();
//	
//	for (Object objects : list) {
//		
//		System.out.println("name :"+objects);
//		
//			}
		
	}

}
