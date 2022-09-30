package com.vendor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.vendor.bean.Vendor;

import Util.java.DButil;

public class TenderSystemdaoImpl implements TenderSystemdao{

	@Override
	public String registerVendor(Vendor vendor) {
		
		String message="No vendor data inserted";
		
		try (Connection conn=DButil.provideConnection()){
			
			
		PreparedStatement ps	=conn.prepareStatement("insert into vendor(email,password) values(?,?)");
		
		
		
		ps.setString(1, vendor.getEmail());
		ps.setString(2, vendor.getPassword());
			
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="vendor registered successfully";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		
		
		
		return message;
	}

	

}
