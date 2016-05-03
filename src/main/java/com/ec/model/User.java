package com.ec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class User extends Person {
	@ManyToMany
	private List<Movie> usr;
}
