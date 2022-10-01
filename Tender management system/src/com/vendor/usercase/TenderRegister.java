package com.vendor.usercase;

import java.util.Scanner;

import com.vendor.bean.Vendor;
import com.vendor.bean.tender;
import com.vendor.dao.TenderSystemdao;
import com.vendor.dao.TenderSystemdaoImpl;

public class TenderRegister {
	
	public static void main(String[]args)
	{
		
		
		Scanner sc=new Scanner (System.in);
		
		

		
		
		System.out.println("Enter item name");
        String item=sc.next();
        

		System.out.println("Quantity available");
         int quan=sc.nextInt();

		System.out.println("tender status open or close");
         String status=sc.next();
         
         TenderSystemdao dao=new TenderSystemdaoImpl();
         
         tender T=new tender();
            
         
         T.setItem_name(item);;
        T.setQuantity(quan);
        T.setStatus(status);
         String result=dao.tenderavailable(T);
         
         System.out.println(result);
         
		
		
		
	}
}
