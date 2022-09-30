package com.vendor.usercase;

import java.util.List;

import com.vendor.Excepton.VendorException;
import com.vendor.bean.Vendor;
import com.vendor.dao.TenderSystemdao;
import com.vendor.dao.TenderSystemdaoImpl;

public class getAllVendorList {
	
	
	public static void main(String[]args)
	{
		
		
		TenderSystemdao dao=new TenderSystemdaoImpl();
		
		try {
			
			
			List<Vendor> vendor=dao.showAllVendor();
			
			vendor.forEach(s->{
				
				
				System.out.println(s.toString());
				
				//System.out.println("Vendor email : "+ s.getEmail());
			
			//System.out.println("Vendor registration password : " +s.getPassword());
			
			
			System.out.println("======================================================");
			});
			
			
			
			
		} catch (VendorException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	

}
