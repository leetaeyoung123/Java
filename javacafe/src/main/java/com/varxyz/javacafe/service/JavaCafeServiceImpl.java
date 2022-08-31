package com.varxyz.javacafe.service;

import java.util.List;

import com.varxyz.javacafe.domain.Cafe;
import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.domain.Root;

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
	public List<String> selectLowCate(String highCateGory) {
		return dao.selectLowCate(highCateGory);
	}

	@Override
	public List<Cafe> selectMenuList(String lowCate) {
		return dao.selectMenuList(lowCate);
	}

	@Override
	public String findHighCate(String categoryname) {
		return dao.findHighCate(categoryname);
	}

	@Override
	public String findMenu(String name) {
		return dao.findMenu(name);
	}

	@Override
	public void updateCate(Category cate) {
		dao.updateCate(cate);
	}

	@Override
	public Root login(String rootId) {
		return dao.login(rootId);
	}

	@Override
	public List<Cafe> findAllMenu() {
		return dao.findAllMenu();
	}
}
