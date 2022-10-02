package com.vendor.usercase;

import java.util.Scanner;

import com.vendor.Excepton.VendorException;
import com.vendor.bean.Vendor;
import com.vendor.dao.TenderSystemdao;
import com.vendor.dao.TenderSystemdaoImpl;

public class vendorLogin {
	
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the username");
		String username=sc.next();
		
		System.out.println("Enter password");
		String pass=sc.next();
		
	             TenderSystemdao dao=new TenderSystemdaoImpl();
		
		try {
			Vendor vendor=dao.vendorlogin(username, pass);
			System.out.println("welcome :");
			
			
		}catch(VendorException e) {
			System.out.println(e.getMessage());
			
		}
		

		
	}

}
