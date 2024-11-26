package com.uvm.control_escolar.service;

import com.uvm.control_escolar.entity.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IStudentService {

    Student createStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    ResponseEntity<Student> updateStudent(Long id, Student student);
    void deleteStudent(Long id);

}
