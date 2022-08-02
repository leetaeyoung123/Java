package com.varxyz.javacafe.service;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.javacafe.DataSourceConfig;
import com.varxyz.javacafe.dao.JavaCafeDao;
import com.varxyz.javacafe.domain.Cafe;
import com.varxyz.javacafe.domain.Category;

public interface JavaCafeService {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DataSourceConfig.class);
	
	JavaCafeDao dao = context.getBean("javaCafeDao", JavaCafeDao.class);
	
	public void addCate(Category category);
	public void addCafe(Cafe cafe);
	public List<Category> selectAll();
}
