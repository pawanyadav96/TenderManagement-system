package com.vendor.runner;

import java.util.List;
import java.util.Scanner;

import com.vendor.Excepton.VendorException;
import com.vendor.Excepton.tenderException;
import com.vendor.bean.Vendor;
import com.vendor.bean.tender;
import com.vendor.dao.TenderSystemdao;
import com.vendor.dao.TenderSystemdaoImpl;

public class runner {
	
	
	
	
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter Your Choice: "
				+"\n1. Register vendor"
				+"\n2. Login vendor"
				+"\n3. view all vendor details"
				+"\n4. register new tender"
				+"\n5. view all tender"
				+"\n5. Exit");
		int choice = Integer.parseInt(sc.nextLine());
		
		
		TenderSystemdao dao=new TenderSystemdaoImpl();
		
		switch(choice) {
		case 1: 
			 while(true) {
				 System.out.println("Enter Vendor email for registration in database");
			        String email=sc.next();
			        
			        

					System.out.println("Enter vendor password");
			         String password=sc.next();
			         
			        // TenderSystemdao dao=new TenderSystemdaoImpl();
			         
			         Vendor vendor=new Vendor();
			            
			         
			         vendor.setEmail(email);
			         vendor.setPassword(password);
			         String result=dao.registerVendor(vendor);
			         
			         System.out.println(result);
			         
			         
			         
			         System.out.println("Do you want to add more Book: (Y/N)");
					 String res = sc.nextLine();
					 if(res.equalsIgnoreCase("N"))
						 break;
			 }   
			 break;
		case 2:
			
			System.out.println("Enter the username");
			String username=sc.next();
			
			System.out.println("Enter password");
			String pass=sc.next();
			
		            // TenderSystemdao dao=new TenderSystemdaoImpl();
			
			try {
				Vendor V=dao.vendorlogin(username, pass);
				System.out.println("welcome :");
				
				
			}catch(VendorException e) {
				System.out.println(e.getMessage());
				
			}
		break;
		
		case 3:
			
			try {
				
				
				List<Vendor> Ve=dao.showAllVendor();
				
				Ve.forEach(s->{
					
					
					System.out.println(s.toString());
					
					//System.out.println("Vendor email : "+ s.getEmail());
				
				//System.out.println("Vendor registration password : " +s.getPassword());
				
				
				System.out.println("======================================================");
				});
				
				
				
				
			} catch (VendorException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			break;
			
		case 4:
			
			
			while(true) {
			System.out.println("Enter item name");
	        String item=sc.next();
	        

			System.out.println("Quantity available");
	         int quan=sc.nextInt();

			System.out.println("tender status open or close");
	         String status=sc.next();
	         
	        // TenderSystemdao dao=new TenderSystemdaoImpl();
	         
	         tender T=new tender();
	            
	         
	         T.setItem_name(item);;
	        T.setQuantity(quan);
	        T.setStatus(status);
	         String results=dao.tenderavailable(T);
	         
	         System.out.println(results);
	         
	         System.out.println("Do you want to add more Book: (Y/N)");
			 String res = sc.nextLine();
			 if(res.equalsIgnoreCase("N"))
				 break;
			}  
	         
	       break;  
		case 5:
			
			try {
				
				
				List<tender> L=dao.tenderList();
				
				L.forEach(s->{
					
					
					System.out.println(s.toString());
					
					//System.out.println("Vendor email : "+ s.getEmail());
				
				//System.out.println("Vendor registration password : " +s.getPassword());
				
				
				System.out.println("======================================================");
				});
				
				
				
				
			} catch (tenderException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
			break;
			
		  default: 
			   System.out.println("Thank you");
			   break;
			
			
		}
		   System.out.println("Do you want to continue.....(Y/N)");
		   String ans = sc.nextLine();
		   if(ans.equalsIgnoreCase("N"))
			   break;
		
		
	}
}
}