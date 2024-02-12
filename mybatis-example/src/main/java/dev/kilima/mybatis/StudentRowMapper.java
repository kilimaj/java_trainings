package dev.kilima.mybatis;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import dev.kilima.mybatis.entities.Student;

public interface StudentRowMapper {
	String insert = "insert into student(stdname, total, dob) values (#{stdname},#{total},#{dob})";
	String update = "update student set stdname =#{stdname},total=#{total} where regno=#{regno}";
	String delete = "delete from student where regno=#{regno}";

	@Insert(insert)
	void addStudent(Student std);

	@Update(update)
	int updateStudent(Student std);

	@Delete(delete)
	int deleteStudent(int regno);
}
