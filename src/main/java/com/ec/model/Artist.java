package com.ec.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

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

	public Byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

	public List<Movie> getArt() {
		return art;
	}

	public void setArt(List<Movie> art) {
		this.art = art;
	}

	public Character getCharac() {
		return charac;
	}

	public void setCharac(Character charac) {
		this.charac = charac;
	}

	public String getBiblography() {
		return biblography;
	}

	public void setBiblography(String biblography) {
		this.biblography = biblography;
	}

	@ManyToMany(mappedBy = "artists")
	private List<Movie> art;

	@OneToOne(mappedBy = "artist")
	private Character charac;

}
