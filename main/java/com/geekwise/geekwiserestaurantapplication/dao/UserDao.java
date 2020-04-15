package com.geekwise.geekwiserestaurantapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.geekwise.geekwiserestaurantapplication.*;

@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager em;

	public List<User> findAll() {
		return em.createQuery("FROM User", User.class).getResultList();

	}
	
	public User findByEmail(String email) {
		try {
			return em.createQuery("FROM User WHERE email = :name", User.class).setParameter("name", email)
					.getSingleResult();
		} catch (NoResultException e)  {
			return null;
		}catch (NonUniqueResultException e)  {
			return null;
		}catch (NullPointerException e)  {
			return null;
		}
	}	
	
}