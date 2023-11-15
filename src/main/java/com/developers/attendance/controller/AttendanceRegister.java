package com.developers.attendance.controller;

import com.developers.attendance.entities.Student;
import com.developers.attendance.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import util.CodeObject;

@Controller
public class AttendanceRegister {

    @Autowired
    private StudentService studentService;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("codeObject", new CodeObject(null));
        return "index";
    }

    @GetMapping("/validate-code")
    public String validateStudentCode(@ModelAttribute CodeObject codeObject, Model model) {
        Student savedStudent = studentService.findStudent(codeObject.code());

        System.out.println("Code entry: " + codeObject.code());

        if (savedStudent == null) {
            model.addAttribute("error", "Código inexistente");
            return "index";
        }

        return "register";
    }

}

