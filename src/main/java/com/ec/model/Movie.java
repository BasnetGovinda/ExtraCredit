package com.ec.model;

import javax.persistence.CascadeType;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@Enumerated(EnumType.STRING)
	private Genere genere;
	@Lob
	private byte[] cover;
	private int rating;
	@Temporal(TemporalType.DATE)
	private Date year;
	@ManyToMany(mappedBy = "movie", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<Person> persons;
	@OneToMany(mappedBy = "movie", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<Character> characters;

	public Movie() {
		super();
	}

	public Movie(String name, Genere genere, byte[] cover, int rating, Date year, List<Person> persons,
			List<Character> characters) {
		super();
		this.name = name;
		this.genere = genere;
		this.cover = cover;
		this.rating = rating;
		this.year = year;
		this.persons = persons;
		this.characters = characters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	public byte[] getCover() {
		return cover;
	}

	public void setCover(byte[] cover) {
		this.cover = cover;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public List<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genere=" + genere + ", cover=" + Arrays.toString(cover)
				+ ", rating=" + rating + ", year=" + year + "]";
	}

	
}
