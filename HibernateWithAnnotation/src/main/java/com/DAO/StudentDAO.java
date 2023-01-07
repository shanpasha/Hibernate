package com.DAO;

import java.util.List;

import com.model.Student;

public interface StudentDAO {
	
	
	Integer save(Student student);
	Student getById (Integer id);
	void update(Student student);
	void deleteById(Integer id);
	List<Student> getAll();
	
	
	
	

}


