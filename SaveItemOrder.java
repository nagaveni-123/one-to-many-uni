package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveItemOrder {

	public static void main(String[] args) {
		FoodOrder fo=new FoodOrder();
		fo.setStatus("Ready");
		fo.setToname("Manyai");
		Item item1=new Item();
		item1.setName("Biriyani");
		item1.setQty(2);
		item1.setCost(180);
		Item item2=new Item();
		item2.setName("Chiken urwal");
		item2.setQty(2);
		item2.setCost(260);
		List<Item> item = new ArrayList<Item>();
		item.add(item1);
		item.add(item2);
		fo.setItems(item);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(fo);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityTransaction.commit();

	}

}
