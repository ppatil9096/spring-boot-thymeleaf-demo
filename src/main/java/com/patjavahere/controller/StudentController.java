package com.patjavahere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.patjavahere.model.Student;

@Controller
public class StudentController {
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

	@PostMapping(value = "/save")
	public ModelAndView save(@ModelAttribute final Student student) {
		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user-data");
		modelAndView.addObject("student", student);
		return modelAndView;
	}
}
