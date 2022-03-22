package com.main.o2oCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.o2oCrud.model.Student;



@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> 
{
    public Student findByUnameAndPword(String un, String pw);
    
    public Student findBySid(int sid);
}
