package com.uvm.control_escolar.controller;
import com.uvm.control_escolar.entity.Student;
import com.uvm.control_escolar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentForm";
    }

    @PostMapping("/add")
    public String createStudent(@ModelAttribute("student") Student student) {
        studentService.createStudent(student);
        return "redirect:/students"; // Redirigir a la lista de estudiantes despues de crear con exito
    }


    // Mostrar todos los estudiantes en una lista
    @GetMapping
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "studentList"; // Agregar el nombre de la lista (el html)
    }

    @GetMapping("/{id}")
    public String getStudentById(@PathVariable Long id, Model model) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            model.addAttribute("student", student);
            return "studentDetail";
        } else {
            return "redirect:/students";  // Redirigir si no se encuentra el estudiante
        }
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
        student.setId(id);
        studentService.updateStudent(id, student);
        return "redirect:/students";  // Redirigir a la lista de estudiantes después de actualizar
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";  // Redirigir a la lista de estudiantes después de eliminar
    }
}

