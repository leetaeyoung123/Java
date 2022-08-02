package com.varxyz.javacafe.service;

import java.util.List;

import com.varxyz.javacafe.domain.Cafe;
import com.varxyz.javacafe.domain.Category;

public class JavaCafeServiceImpl implements JavaCafeService{

	@Override
	public void addCate(Category category) {
		dao.addCate(category);
		
	}

	@Override
	public void addCafe(Cafe cafe) {
		dao.addCafe(cafe);
		
	}

	@Override
	public List<Category> selectAll() {
		System.out.println(2);
		return dao.selectAll();
	}

}
