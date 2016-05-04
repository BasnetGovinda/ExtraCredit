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
import javax.persistence.JoinTable;
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
	/*
	 * @ManyToMany(mappedBy = "movie", cascade = { CascadeType.PERSIST,
	 * CascadeType.REMOVE }) private List<Person> persons;
	 */

	@ManyToMany(mappedBy = "dir", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })

	private List<Director> directors;

	@ManyToMany(cascade = CascadeType.ALL)

	private List<Artist> artists;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<User> users;
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<Character> characters;

	public Movie() {
		super();
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genere=" + genere + ", cover=" + Arrays.toString(cover)
				+ ", rating=" + rating + ", year=" + year + "]";
	}

	public Movie(String name, Genere genere, byte[] cover, int rating, Date year, List<Director> directors,
			List<Artist> artists, List<User> users, List<Character> characters) {
		super();

		this.name = name;
		this.genere = genere;
		this.cover = cover;
		this.rating = rating;
		this.year = year;
		this.directors = directors;
		this.artists = artists;
		this.users = users;
		this.characters = characters;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

}
