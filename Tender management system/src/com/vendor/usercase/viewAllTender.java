package com.vendor.usercase;

import java.util.List;

import com.vendor.Excepton.VendorException;
import com.vendor.Excepton.tenderException;
import com.vendor.bean.Vendor;
import com.vendor.bean.tender;
import com.vendor.dao.TenderSystemdao;
import com.vendor.dao.TenderSystemdaoImpl;

public class viewAllTender {
	public static void main(String[]args) throws tenderException
	{
	
	
	
	TenderSystemdao dao=new TenderSystemdaoImpl();
	
	try {
		
		
		List<tender> T=dao.tenderList();
		
		T.forEach(s->{
			
			
			System.out.println(s.toString());
			
			//System.out.println("Vendor email : "+ s.getEmail());
		
		//System.out.println("Vendor registration password : " +s.getPassword());
		
		
		System.out.println("======================================================");
		});
		
		
		
		
	} catch (tenderException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	
	
	
	
}

}
