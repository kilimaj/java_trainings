package dev.kilima.student.dao;

import java.util.List;

import dev.kilima.student.beans.StudentBean;

public interface StudentDao {

	int addStudent(StudentBean std);

	int updateStudent(StudentBean std);

	int deleteStudent(int regno);

	List<StudentBean> getAllStudents();

	StudentBean getStudentByRegNo(int regno);

}
