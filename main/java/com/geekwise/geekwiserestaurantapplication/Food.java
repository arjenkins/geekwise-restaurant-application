package com.geekwise.geekwiserestaurantapplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "food")
public class Food {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
@ManyToOne
User user;	
String menu;
int quantity;
	
public Food(Long id, User user, String menu, int quantity) {
	super();
	this.id = id;
	this.user = user;
	this.menu = menu;
	this.quantity = quantity;
}
	public Food() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", user=" + user + ", menu=" + menu + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	
	
}