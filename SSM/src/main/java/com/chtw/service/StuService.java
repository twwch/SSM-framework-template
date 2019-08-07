package com.chtw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chtw.dao.StuDAO;
import com.chtw.pojo.Student;

@Service
public class StuService {
	
	//自动注入StuDAO
	@Autowired
	private StuDAO stuDAO;
	
	public List<Student> getAll(){
		return stuDAO.getAll();
	}

}
