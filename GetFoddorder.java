package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetFoddorder {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		FoodOrder fo=entityManager.find(FoodOrder.class, 1);
		System.out.println("-------------The Food order details--------------");
		System.out.println("The item id is:"+fo.getId());
		System.out.println("The item status is:"+fo.getStatus());
		List<Item>item=fo.getItems();
		for(Item i:item) {
			System.out.println("-------------TheItem  details--------------");
			System.out.println(i.getId());
			System.out.println(i.getName());
			System.out.println(i.getQty());
			System.out.println(i.getCost());
		}

	}

}
