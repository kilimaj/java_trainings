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
		person.setPersonName("John Kilima");

		Passport passport = new Passport();
		passport.setPassportNo("ABCD12345");
		passport.setDateIssued(new Date());
		passport.setPerson(person);

		tran.begin();
		manager.persist(passport);
		tran.commit();
		manager.close();

	}

}
