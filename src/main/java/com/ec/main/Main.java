package com.ec.main;

import java.security.Permissions;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ec.dao.MovieDoa;
import com.ec.dao.MovieDoaImplementation;
import com.ec.model.Artist;
import com.ec.model.Character;
import com.ec.model.Genere;
import com.ec.model.Movie;
import com.ec.model.Person;

import Config.Manager;

public class Main {

	static {
		new Manager();
	}

	public static void main(String[] args) {
		/*
		 * Artist artist = new Artist();
		 * artist.setBiblography("dsfnkjadnfkjnf:"); EntityManager em =
		 * emf.createEntityManager(); em.getTransaction().begin();
		 * em.persist(artist); em.getTransaction().commit();
		 */

		Artist art = new Artist("rma", " Nepal", new Date());
		List<Person> artlist = new ArrayList<Person>();
		artlist.add(art);
		List<Character> chara = new ArrayList<>();
		Movie m = new Movie("jai biru", Genere.ACTION, null, 10, new Date(), artlist, chara);
		chara.add(new Character("ghyabashayma", art, m));
		MovieDoaImplementation mimpl = new MovieDoaImplementation();
		mimpl.insert(m);

		mimpl.delete(m);
	}

}
