package com.vendor.bean;

public class Vendor {
	
	
	
	private int serial;
	
	private String email;
	private String password;
//	public Vendor(String email, String password) {
//		super();
//		this.email = email;
//		this.password = password;
//	}
	public Vendor(int serial, String email, String password) {
		super();
		this.serial = serial;
		this.email = email;
		this.password = password;
	}
	public Vendor(String e, String p) {
		// TODO Auto-generated constructor stub
	}
	public Vendor() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vendor [serial=" + serial + ", email=" + email + ", password=" + password + "]";
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
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
	
}
	
	


