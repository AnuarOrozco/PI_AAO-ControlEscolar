package com.uvm.control_escolar.controller;

import com.uvm.control_escolar.entity.Student;
import com.uvm.control_escolar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/form")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentForm";
    }

    @PostMapping("/form")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.createStudent(student);

        return "redirect:/students/form";
    }



}

