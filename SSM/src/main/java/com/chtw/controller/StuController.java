package com.chtw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chtw.pojo.Student;
import com.chtw.service.StuService;

@Controller
@RequestMapping("/stu")
public class StuController {
	
	//自动注入StuService
	@Autowired
	private StuService stuService;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Student> sList = stuService.getAll();
		model.addAttribute("sList", sList);
		return "index";
	}

}
