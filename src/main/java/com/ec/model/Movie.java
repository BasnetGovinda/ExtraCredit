package com.ec.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	@ManyToMany(mappedBy = "dir")
	private List<Director> directors;
	@ManyToMany(mappedBy = "art")
	private List<Artist> artists;
	@ManyToMany(mappedBy = "usr")
	private List<User> users;

}
