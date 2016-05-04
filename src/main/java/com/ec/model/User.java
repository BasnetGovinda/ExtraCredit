package com.ec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class User extends Person {
	@ManyToMany
	private List<Movie> usr;

	public User(List<Movie> usr) {
		super();
		this.usr = usr;
	}

	public User() {
		super();
	}

	public List<Movie> getUsr() {
		return usr;
	}

	public void setUsr(List<Movie> usr) {
		this.usr = usr;
	}
	
}
