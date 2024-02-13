package dev.kilima.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import dev.kilima.mybatis.entities.Student;

public interface StudentRowMapper {
	String insert = "insert into student(stdname, total, dob) values (#{stdname},#{total},#{dob})";
	String update = "update student set stdname =#{stdname},total=#{total} where regno=#{regno}";
	String delete = "delete from student where regno=#{regno}";
	String GETALL = "select * from student";
	String GETBYID = "select * from student where regno = #{regno}";
	
	@Select(GETALL)
	@Results(value = {
			@Result(column = "regno", property = "regno"),
			@Result(column = "stdname", property = "stdname"),
			@Result(column = "total", property = "total"),
			@Result(column = "dob", property = "dob")
	})
	
	List<Student> getAllStudent();
	
	@Select(GETBYID)
	@Results(value = {
			@Result(column = "regno", property = "regno"),
			@Result(column = "stdname", property = "stdname"),
			@Result(column = "total", property = "total"),
			@Result(column = "dob", property = "dob")	
	})
	Student getStudentById(int regno);

	@Insert(insert)
	void addStudent(Student std);

	@Update(update)
	int updateStudent(Student std);

	@Delete(delete)
	int deleteStudent(int regno);
}
