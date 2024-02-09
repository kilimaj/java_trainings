package dev.kilima.jpaexample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dev.kilima.jpaexample.beans.StudentBean;

public class StudentMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("kilima_dev_company");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();

		StudentBean student = new StudentBean();
		student.setStdname("Bundala King");
		student.setTotal(1000);
		student.setDob("2024-02-01");
		tran.begin();
		manager.persist(student);
		tran.commit();
		manager.close();

	}

}
