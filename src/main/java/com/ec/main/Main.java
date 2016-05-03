package com.ec.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ec.model.Artist;

public class Main {

	private static EntityManagerFactory emf;
	static {
		try {
			emf = Persistence.createEntityManagerFactory("com.ec.model");

		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {
		Artist artist = new Artist();
		artist.setBiblography("dsfnkjadnfkjnf:");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(artist);
		em.getTransaction().commit();
	}

}
