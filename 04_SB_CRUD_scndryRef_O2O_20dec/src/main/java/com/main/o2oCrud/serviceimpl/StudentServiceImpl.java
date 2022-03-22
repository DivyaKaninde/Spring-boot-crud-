package com.main.o2oCrud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.o2oCrud.model.Student;
import com.main.o2oCrud.repository.StudentRepository;
import com.main.o2oCrud.servicei.StudentServiceI;



@Service
public class StudentServiceImpl implements StudentServiceI {
	
	@Autowired
	StudentRepository sr;

	@Override
	public void saveInfo(Student st) 
	{		
		sr.save(st);		
	}

	@Override
	public Student loginCheck(String un, String pw) {
		
		return sr.findByUnameAndPword(un, pw);
		
	}

	@Override
	public Iterable<Student> displayAll() {
		
		return sr.findAll();
	}

	@Override
	public void deleteStudent(Student s) {
		
		sr.delete(s);
		
	}

	@Override
	public Student editStudent(int sid) {
		
		return sr.findBySid(sid);
	}

	
	
	

}
