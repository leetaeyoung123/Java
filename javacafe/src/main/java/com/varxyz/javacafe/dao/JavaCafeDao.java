package com.varxyz.javacafe.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.javacafe.domain.Cafe;
import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.domain.Root;

public class JavaCafeDao {
	private JdbcTemplate jdbcTemplate;
	
	public JavaCafeDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addCate(Category category) {
		String sql = "INSERT INTO CateGoryTable(categoryname) VALUES(?)";
		jdbcTemplate.update(sql, category.getCategoryname());
	}
	
	public void addCafe(Cafe cafe) {
		String sql = "INSERT INTO CafeTable "
					+ " (name, price, highCateGory, lowCateGory, imgUrl) "
					+ " VALUES(?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, cafe.getName(), cafe.getPrice(), 
								cafe.getHighCateGory(),
								cafe.getLowCateGory(), cafe.getImgUrl());
	}
	
	public List<Category> selectHighCate() {
		String sql = "SELECT * FROM CateGoryTable";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Category>(Category.class));
	}
	
	public List<String> selectLowCate(String highCateGory){
		String sql = "SELECT lowCateGory FROM CafeTable WHERE highCateGory = ?";
		List<String> lowCate = jdbcTemplate.queryForList(sql, String.class, highCateGory);
		return lowCate;
	}
	
	public List<Cafe> selectMenuList(String lowCate){
		String sql = "SELECT * FROM CafeTable WHERE lowCateGory = ?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Cafe>(Cafe.class), lowCate);
	}
	
	public String findHighCate(String categoryname) {
		String sql = "SELECT * FROM CateGoryTable WHERE categoryname = ?";
		return jdbcTemplate.queryForObject(sql, String.class, categoryname);
	}
	
	public String findMenu(String name) {
		String sql = "SELECT name FROM CafeTable WHERE name = ?";
		return jdbcTemplate.queryForObject(sql, String.class, name);
	}
	
	public void updateCate(Category cate) {
		String sql = "SELECT * FROM CateGoryTable WHERE categoryname = ?";
		jdbcTemplate.update(sql, cate.getCategoryname());
	}
	
	public Root login(String rootId) {
		String sql = "SELECT * FROM root WHERE rootId = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Root>(Root.class), rootId);
	}
	
	public List<Cafe> findAllMenu() {
		String sql = "SELECT * FROM CafeTable";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Cafe>(Cafe.class));
	}
}
