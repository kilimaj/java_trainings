package dev.kilima.jpaexample.person;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class One2OneUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("kilima_dev_company");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();

		Person person = manager.find(Person.class, 3);
		Passport passport = new Passport();
		passport.setPassportNo("XYZK567890");
		passport.setDateIssued(new Date());
		passport.setPerson(person);

		tran.begin();
		manager.persist(passport);
		tran.commit();

	}

}
