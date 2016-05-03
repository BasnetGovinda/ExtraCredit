package com.ec.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String place_of_birth;

	@Temporal(TemporalType.DATE)
	private Date DOB;

	public Person() {
		super();
	}

	public Person(String name, String place_of_birth, Date dOB) {
		super();
		this.name = name;
		this.place_of_birth = place_of_birth;
		DOB = dOB;
	}

}
