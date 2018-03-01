package com.xh.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xh.dao.IStudentDao;
import com.xh.model.StudentModel;

@Service
public class StudentService {

	@Resource
	private IStudentDao studentDao;

	public List<StudentModel> findAll() {

		return studentDao.findAll();
	}

}
