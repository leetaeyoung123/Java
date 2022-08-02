package com.varxyz.javacafe.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.javacafe.domain.Cafe;
import com.varxyz.javacafe.domain.Category;

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
					+ " (name, price, stock, highCateGory, lowCateGory) "
					+ " VALUES(?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, cafe.getName(), cafe.getPrice(), 
								cafe.getStock(), cafe.getHighCateGory(),
								cafe.getLowCateGory());
	}
	
	public List<Category> selectAll() {
		String sql = "SELECT * FROM CateGoryTable";
		System.out.println(3);
		System.out.println(jdbcTemplate.query(sql, new BeanPropertyRowMapper<Category>(Category.class)));
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Category>(Category.class));
	}
}
