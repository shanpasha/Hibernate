package com.DAO;

import java.util.List;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.SessionUtil.SessionUtill;
import com.model.Student;




public class StudentDaoImpl implements StudentDAO{
	private static Logger LOGGER=LogManager.getLogger(StudentDaoImpl.class);
	@Override
	public Integer save(Student student) {
		
    Session s=	SessionUtill.getSession();
    LOGGER.info("Getting Session----------"+s);
    Integer id =(Integer) s.save(student);
   
    s.beginTransaction().commit();
   
    SessionUtill.close(s);
    LOGGER.info("Getting primary Key----------"+id);
   
	
		
		return id;
	}

	@Override
	public Student getById(Integer id) {
		
		
		
		return (Student) SessionUtill.getSession().get(Student.class, id);
	}

	@Override
	public void update(Student student) {
		Session session=SessionUtill.getSession();
		session.update(student);
		session.beginTransaction().commit();
		SessionUtill.close(session);
		
	}

	@Override
	public void deleteById(Integer id) {
		Session s= SessionUtill.getSession();
		Student student=new Student();
		student.setId(id);
		s.delete(id);
		SessionUtill.close(s);
		
		
	}

	@Override
	public List<Student> getAll() {
		
		return SessionUtill.getSession().createQuery("from Student").list();	}

}