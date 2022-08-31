package com.varxyz.javacafe.service;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.javacafe.DataSourceConfig;
import com.varxyz.javacafe.dao.JavaCafeDao;
import com.varxyz.javacafe.domain.Cafe;
import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.domain.Root;

public interface JavaCafeService {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DataSourceConfig.class);
	
	JavaCafeDao dao = context.getBean("javaCafeDao", JavaCafeDao.class);
	
	public void addCate(Category category);
	public void addCafe(Cafe cafe);
	public List<Category> selectHighCate();
	public List<String> selectLowCate(String highCateGory);
	public List<Cafe> selectMenuList(String lowCate);
	public String findHighCate(String categoryname);
	public String findMenu(String name);
	public void updateCate(Category cate);
	public Root login(String rootId);
	public List<Cafe> findAllMenu();
}
