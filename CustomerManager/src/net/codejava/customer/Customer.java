package net.codejava.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String username;
	private String password;
	private String active;

	protected Customer() {
	}

	protected Customer(String username, String password, String active) {
		this.username = username;
		this.password = password;
		this.active = active;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

}
