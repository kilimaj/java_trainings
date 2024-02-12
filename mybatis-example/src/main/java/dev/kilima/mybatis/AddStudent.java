package dev.kilima.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dev.kilima.mybatis.entities.Student;

public class AddStudent {

	public static void main(String[] args) {
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = factory.openSession();

			Student std = new Student();
			std.setStdname("Mybatis");
			std.setTotal(934);
			std.setDob("2023-11-22");
			session.insert("Student.insert", std);
			session.commit();
			System.out.println("inserted");
			session.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
