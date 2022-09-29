package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobileSimDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Mobile m = entityManager.find(Mobile.class, 1);
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getCost());
		List<Sim> sim = new ArrayList();
		System.out.println(sim.get(0));
		System.out.println(sim.get(1));
	}

}
