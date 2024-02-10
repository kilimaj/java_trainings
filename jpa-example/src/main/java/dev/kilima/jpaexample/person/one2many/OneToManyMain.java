package dev.kilima.jpaexample.person.one2many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dev.kilima.jpaexample.person.Person;

public class OneToManyMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("kilima_dev_company");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();

		Person person = new Person();
		person.setPersonName("Jean");
		Person person2 = manager.find(Person.class, 2);

		Vehicles v1 = new Vehicles();
		v1.setRegno("TS071234");
		v1.setBrand("Suzuki");
		v1.setModel(2020);
		v1.setPerson(person);

		Vehicles v2 = new Vehicles();
		v2.setRegno("AP065678");
		v2.setBrand("Hyundai");
		v2.setModel(2022);
		v2.setPerson(person);

		Vehicles v3 = new Vehicles();
		v3.setRegno("1234ABC");
		v3.setBrand("Toyota");
		v3.setModel(2024);
		v3.setPerson(person2);

		List<Vehicles> vehicleList = new ArrayList<Vehicles>();
		vehicleList.add(v1);
		vehicleList.add(v2);
		vehicleList.add(v3);

		person.setVehicles(vehicleList);

		tran.begin();
		manager.persist(person);
		tran.commit();
		manager.close();

	}

}
