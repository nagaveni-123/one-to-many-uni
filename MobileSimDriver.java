package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileSimDriver {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		Sim sim1 = new Sim();
		m.setName("Sony");
		m.setCost(2000);
		sim1.setName("Airtel");
		sim1.setProvider("AirtelProvider");
		Sim sim2 = new Sim();
		sim2.setName("VI");
		sim2.setProvider("VodafoneIdea");
		List<Sim> sims = new ArrayList<Sim>();

		sims.add(sim2);
		sims.add(sim1);
		m.setSim(sims);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(m);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();

	}

}
