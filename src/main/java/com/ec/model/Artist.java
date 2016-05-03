package com.ec.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity
public class Artist extends Person {

	private String biblography;
	@Lob
	private Byte[] photo;

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(String name, String place_of_birth, Date dOB) {
		super(name, place_of_birth, dOB);
		// TODO Auto-generated constructor stub
	}

	public String getBiblography() {
		return biblography;
	}

	public void setBiblography(String biblography) {
		this.biblography = biblography;
	}

	@ManyToMany
	private List<Movie> art;

}
