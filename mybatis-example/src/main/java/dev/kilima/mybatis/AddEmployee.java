package dev.kilima.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dev.kilima.mybatis.entities.Employee;

public class AddEmployee {

	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();

		Employee emp = new Employee();
		emp.setEmpid(6);
		emp.setEmpname("Barnabas Bundala");
		emp.setSalary(10000000.00);
		emp.setDoj("2023-12-01");
		session.insert("Employee.insert", emp);
		session.commit();
		System.out.println("New employee created");
		session.close();

	}

}
