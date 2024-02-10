package dev.kilima.jpaexample.person.one2many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import dev.kilima.jpaexample.person.Person;

@Entity
@Table(name = "vehicles")
public class Vehicles {

	@Id
	@Column(length = 15)
	private String regno;

	@Column(length = 20)
	private String brand;

	@Column
	private int model;

	@ManyToOne
	@JoinColumn(name = "person")
	Person person;

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
