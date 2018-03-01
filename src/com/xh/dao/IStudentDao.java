package com.xh.dao;

import java.util.List;

import com.xh.model.StudentModel;

public interface IStudentDao {
	
	public List<StudentModel> findAll();
	
}
