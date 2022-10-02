package com.vendor.bean;

public class tender {

	
	private static String item_name;
	private  static int quantity;
	private  static String status;
	public tender(int quantity, String item_name, String status) {
		super();
		this.item_name = item_name;
		this.quantity = quantity;
		this.status = status;
	}
	public tender() {
		// TODO Auto-generated constructor stub
	}
	public static String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public static int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public static String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "tender [item_name=" + item_name + ", quantity=" + quantity + ", status=" + status + "]";
	}
	
	
	
	
	
	
}
