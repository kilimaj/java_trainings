package dev.kilima.jpaexample.person;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("kilima_dev_company");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();

		Person person = new Person();
		person.setPersonName("Mabula");

		Passport passport = new Passport();
		passport.setPassportNo("tttt12345");
		passport.setDateIssued(new Date());
		passport.setPerson(person);

		tran.begin();
		//insert to both person and passport table
		//manager.persist(passport);
		
		//insert into only person 
		manager.persist(person);
		
		tran.commit();
		manager.close();

	}

}
