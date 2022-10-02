package com.vendor.usercase;

import java.util.Scanner;

import com.vendor.bean.Vendor;
import com.vendor.dao.TenderSystemdao;
import com.vendor.dao.TenderSystemdaoImpl;

public class RegisterVendor {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Vendor email for registration in database");
        String email=sc.next();
        
        

		System.out.println("Enter vendor password");
         String password=sc.next();
         
         TenderSystemdao dao=new TenderSystemdaoImpl();
         
         Vendor vendor=new Vendor();
            
         
         vendor.setEmail(email);
         vendor.setPassword(password);
         String result=dao.registerVendor(vendor);
         
         System.out.println(result);
         
         
         
		
		
		
	}

}
