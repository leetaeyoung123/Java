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
	public List<Category> selectHighCate() {
		return dao.selectHighCate();
	}

	@Override
	public List<Cafe> selectLowCate(String highCateGory) {
		return dao.selectLowCate(highCateGory);
	}

	@Override
	public List<Cafe> selectMenuList(String lowCate) {
		return dao.selectMenuList(lowCate);
	}

	@Override
	public List<Cafe> payment(double price) {
		
		return null;
	}

}
