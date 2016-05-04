package com.ec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Director extends Person {
	@ManyToMany
	private List<Movie> dir;

	public Director(List<Movie> dir) {
		super();
		this.dir = dir;
	}

	public Director() {
		super();
	}

	public List<Movie> getDir() {
		return dir;
	}

	public void setDir(List<Movie> dir) {
		this.dir = dir;
	}
	
}
