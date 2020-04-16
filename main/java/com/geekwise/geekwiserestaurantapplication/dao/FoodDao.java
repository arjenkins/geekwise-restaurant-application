package com.geekwise.geekwiserestaurantapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.geekwise.geekwiserestaurantapplication.Food;
import com.geekwise.geekwiserestaurantapplication.User;


@Repository
@Transactional
public class FoodDao {
	
	
	@PersistenceContext
	private EntityManager em;

	public List<Food> findByUser(User user) {
		return em.createQuery("FROM Food WHERE user = :user", Food.class).setParameter("user", user).getResultList();

	}
	public List<Food> findAll() {
		return em.createQuery("FROM Food", Food.class).getResultList();
	}
	
	public void createFood(Food food) {
		em.persist(food);
	}
	
	public void deleteFood(Long id) {
		Food food = em.getReference(Food.class, id);
		em.remove(food);

	}
}