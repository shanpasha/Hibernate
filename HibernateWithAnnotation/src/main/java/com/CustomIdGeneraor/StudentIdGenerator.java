package com.CustomIdGeneraor;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class StudentIdGenerator implements IdentifierGenerator{
	
	
	

	    public int generateStudentId() {
	        Random random = new Random();
	        return random.nextInt(100);
	    }

	    @Override
	    public Serializable generate(SessionImplementor session, Object object) throws HibernateException {

	        Date date = new Date();
	        
	        Calendar calendar = Calendar.getInstance();
	        return "Stu_" + this.generateStudentId() + "_" + calendar.get(Calendar.YEAR);

	    
	}

		

}
