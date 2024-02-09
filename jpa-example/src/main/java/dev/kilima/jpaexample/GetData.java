package dev.kilima.jpaexample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dev.kilima.jpaexample.beans.Student;

public class GetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("kilima_dev_company");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		// to get single object
		Student std = manager.find(Student.class, 3);
		System.out.println(std.getRegno()+" "+std.getStdname()+" "+std.getDob());

	}

}
