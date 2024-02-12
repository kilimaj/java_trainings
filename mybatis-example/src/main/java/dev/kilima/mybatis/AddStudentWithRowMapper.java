package dev.kilima.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dev.kilima.mybatis.entities.Student;

public class AddStudentWithRowMapper {

	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();

		session.getConfiguration().addMapper(StudentRowMapper.class);
		StudentRowMapper mapper = session.getMapper(StudentRowMapper.class);

		Student std = new Student();
		std.setStdname("mapper-1");
		std.setTotal(123);
		std.setDob("1994-12-12");
		mapper.addStudent(std);
		session.commit();
		session.close();
		System.out.println("inserted");

	}

}
