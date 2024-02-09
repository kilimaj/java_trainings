package dev.kilima.jpaexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dev.kilima.jpaexample.beans.Student;

public class GetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("kilima_dev_company");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();

		// to get single object
		Student std = manager.find(Student.class, 3);
		System.out.println(std.getRegno() + " " + std.getStdname() + " " + std.getDob());

		// to get all students objects
		System.out.println("** to get all students records from database **");
		Query qry = manager.createQuery("from Student");
		List<Student> stdlist = qry.getResultList();
		for (Student s : stdlist)
			System.out.println(s.getRegno() + " " + s.getStdname() + " " + s.getDob());

	}

}
