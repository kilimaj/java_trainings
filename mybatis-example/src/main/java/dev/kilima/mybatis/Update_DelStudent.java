package dev.kilima.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dev.kilima.mybatis.entities.Student;

public class Update_DelStudent {

	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();

		Student std = new Student();
		std.setRegno(3);
		std.setStdname("Gavin King");
		std.setTotal(600);
		std.setDob("2017-12-16");
		session.update("Student.update", std);
		session.commit();
		System.out.println("updated");
		session.close();

	}

}
