package com.main.o2oCrud.servicei;

import com.main.o2oCrud.model.Student;

public interface StudentServiceI 
{
	public void saveInfo(Student st);

	public Student loginCheck(String un, String pw);

	public Iterable<Student> displayAll();
	
	public void deleteStudent(Student s);

	public Student editStudent(int sid);
}
