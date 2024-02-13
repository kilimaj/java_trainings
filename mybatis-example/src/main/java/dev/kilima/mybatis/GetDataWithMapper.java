package dev.kilima.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dev.kilima.mybatis.entities.Student;

public class GetDataWithMapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();

		session.getConfiguration().addMapper(StudentRowMapper.class);
		StudentRowMapper mapper = session.getMapper(StudentRowMapper.class);

		List<Student> stdlist = mapper.getAllStudent();
		stdlist.forEach(
				(s) -> System.out.println(s.getRegno() + " " + s.getStdname() + " " + s.getDob() + " " + s.getTotal()));

		System.out.println("----------------------------------------------------------");

		Student std = mapper.getStudentById(4);
		System.out.println(std.getRegno() + " " + std.getStdname() + " " + std.getDob() + " " + std.getTotal());

		session.close();
	}

}
