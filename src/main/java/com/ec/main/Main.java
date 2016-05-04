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
		
		
		Artist art1 = new Artist("rma1", " Nepal1", new Date());
		List<Person> artlist1 = new ArrayList<Person>();
		artlist.add(art1);
		List<Character> chara1 = new ArrayList<>();
		Movie m1 = new Movie("jai biru1", Genere.ACTION, null, 10, new Date(), artlist1, chara1);
		chara.add(new Character("ghyabashayma1", art1, m1));

		mimpl.insert(m1);
		m.setName("tero bau ko tauko");
		mimpl.update(m);
		List<Movie> testmov = mimpl.serachByMovieName("tero bau ko tauko");

		System.out.println("movie searched by name ");
		for (Movie movie : testmov) {

			System.out.println(movie);
		}
		List<Movie> searchByRating = mimpl.serachByMovieRating(10);

		System.out.println("movie searched by rating ");
		for (Movie movie : searchByRating) {

			System.out.println(movie);
		}

		// mimpl.delete(m.getId());
	}

}
