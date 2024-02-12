package dev.kilima.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dev.kilima.mybatis.entities.Student;

public class GetAllStudents {

	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();

		List<Student> stdList = session.selectList("getAll");
		stdList.forEach(
				(s) -> System.out.println(s.getRegno() + " " + s.getStdname() + " " + s.getDob() + " " + s.getTotal()));

		Student std = session.selectOne("getStudentByRegno", 3);
		System.out.println(std.getRegno() + " " + std.getStdname() + " " + std.getDob() + " " + std.getTotal());

		session.close();

	}

}
