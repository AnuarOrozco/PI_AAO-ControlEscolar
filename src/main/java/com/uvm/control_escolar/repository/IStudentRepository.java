package com.uvm.control_escolar.repository;

import com.uvm.control_escolar.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {



}
