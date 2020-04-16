package com.geekwise.geekwiserestaurantapplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String email;
	String password;
	
	public User() {
		
	}
	
	public User(Long id, String email, String password) {
		super();
		
		this.id = id;
		this.email = email;
		this.password = password;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}	