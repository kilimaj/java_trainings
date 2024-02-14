package dev.kilima.student.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dev.kilima.student.beans.StudentBean;
import dev.kilima.student.dao.StudentDao;
import dev.kilima.student.dao.StudentDaoImpl;

@Configuration
public class StudentConfiguration {
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/kilima_dev_company");
		ds.setUsername("john");
		ds.setPassword("john1234");
		return ds;
	}
	
	@Bean
	public JdbcTemplate template() {
		JdbcTemplate template = new JdbcTemplate(dataSource());
		return template;
	}
	
	@Bean
	public StudentDao studentDao() {
		StudentDao dao = new StudentDaoImpl();
		return dao;
	}
	
	@Bean
	public StudentBean student() {
		return new StudentBean();
	}
}
