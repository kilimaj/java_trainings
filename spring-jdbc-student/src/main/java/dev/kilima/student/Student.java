package dev.kilima.student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.kilima.student.beans.StudentBean;
import dev.kilima.student.dao.StudentDao;
import dev.kilima.student.utils.StudentConfiguration;

public class Student {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(StudentConfiguration.class);
		
		StudentDao dao = (StudentDao) ctx.getBean("studentDao");
		StudentBean student = (StudentBean) ctx.getBean("student");
		

	}

}
