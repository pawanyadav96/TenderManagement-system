package com.vendor.bean;

public class Vendor {
	
	
	
	
	private String email;
	private String password;
	public Vendor(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Vendor [Email=" + email + ", password=" + password + "]";
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

	public Vendor() {
		super();
	}
	
	}	
	
	
	


