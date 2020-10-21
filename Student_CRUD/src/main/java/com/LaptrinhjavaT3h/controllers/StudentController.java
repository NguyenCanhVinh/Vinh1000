package com.LaptrinhjavaT3h.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LaptrinhjavaT3h.modles.Student;
import com.LaptrinhjavaT3h.modles.StudentDAO;

@Controller
public class StudentController {
    @GetMapping("/")
	public String addOrEdit(ModelMap model) {
    	student u= new Student();
    	model.addAttribute("STUDENT", u);
    	model.addAttribute("ACTION", "saveOrUpdate");
	return "register-user";
	}
    
    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(ModelMap model, @ModelAttribute("STUDENT") Student student) {
    	StudentDAO dao = new StudentDAO();
    	dao.save(student);
    	return "register-user";
    }
    @RequestMapping("list")
    public String list(ModelMap model) {
    	StudentDAO dao = new StudentDAO();
        model.addAttribute("STUDENTS", dao.getAll());
    	return "view-user";
    }
    @RequestMapping("/edit/{id}")
    public String edit(ModelMap model, @PathVariable(name ="id") String id ) {
    	StudentDAO dao = new StudentDAO();
    	Student u= dao.findById(id);
    	model.addAttribute("STUDENT", u);
    	model.addAttribute("ACTION", "/saveOrUpdate");
    	return "register-user";
    }
    
    @RequestMapping("/delete/{id}")
    public String delete(ModelMap model, @PathVariable(name ="id") String id ) {
    	StudentDAO dao = new StudentDAO();
        dao.delete(id);
        model.addAttribute("STUDENTS", dao.getAll());
        return "view-user";
    }
}
