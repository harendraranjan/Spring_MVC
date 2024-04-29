package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entity.User;
@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveUser(User user) {
		String sql = "insert into jdbc_mvc(name,email,password,image) values(?,?,?,?)";
		int i = jdbcTemplate.update(sql, user.getFullName(), user.getEmail(), user.getPassword(), user.getChake());
		return i;
	}

	
	
}
