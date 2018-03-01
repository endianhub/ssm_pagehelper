package com.xh.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xh.model.StudentModel;
import com.xh.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class StudentTest {

	@Resource
	private StudentService service;

	@Test
	public void findPage() {
//		PageHelper.startPage(1, 50);
//		List<StudentModel> list = service.findAll();
//		System.out.println(list.size());
		
		Page page = PageHelper.startPage(1, 15, true);
		List<StudentModel> list = service.findAll();
		System.out.println(list.size()+"================="+page.getPages());
	}

	@Test
	public void findAll() {
		for (int i = 0; i < 200; i++) {
			long start = System.currentTimeMillis();
			List<StudentModel> list = service.findAll();
			long end = System.currentTimeMillis();
			long time = (end - start);
			System.out.println();
			System.out.println();
			System.out.println(i + "===================" + time + "=======================" + list.size());
			System.out.println();
			System.out.println();
		}
	}

}
