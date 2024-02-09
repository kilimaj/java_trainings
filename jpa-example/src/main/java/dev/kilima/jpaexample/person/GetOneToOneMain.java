package dev.kilima.jpaexample.person;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetOneToOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("kilima_dev_company");
		EntityManager manager = factory.createEntityManager();

		Query qry = manager.createQuery("from Person");
		List<Person> personList = qry.getResultList();
		for (Person p : personList)
			System.out.println(p.getPersonId() + " " + p.getPersonName());

		Query qry2 = manager.createQuery("from Passport");
		List<Passport> passportList = qry2.getResultList();
		for (Passport p : passportList)
			System.out.println(p.getPassportNo() + " " + p.getDateIssued() + " " + p.getPerson() + " "
					+ p.getPerson().getPersonId() + " " + p.getPerson().getPersonName());
	}

}
