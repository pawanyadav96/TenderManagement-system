package com.vendor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vendor.Excepton.VendorException;
import com.vendor.Excepton.tenderException;
import com.vendor.bean.Vendor;
import com.vendor.bean.tender;

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

	@Override
	public Vendor vendorlogin(String username, String password) throws VendorException{
		
		
		
		Vendor vendor=null;
		
		
		try(Connection conn=DButil.provideConnection()) {
			
			
			
			
			
			PreparedStatement ps=conn.prepareStatement("select * from vendor where email = ? AND Password = ?");
			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			
			ResultSet rs=ps.executeQuery();
			
			
			if(rs.next()) {
				String e=rs.getString("email");
				String p=rs.getString("Password");
				
				
				vendor=new Vendor(e,p);
			}
			
			else {
				throw new VendorException("invalid username or password");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			throw new VendorException(e.getMessage());
		}
		
		
		
		return vendor;
	}

	@Override
	public List<Vendor> showAllVendor() throws VendorException {
		
		List<Vendor> vendor=new ArrayList<>();
		
		try(Connection conn=DButil.provideConnection()){
			
			
			PreparedStatement ps=conn.prepareStatement("select * from Vendor");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				int s=rs.getInt("Serial_No");
				String e=rs.getString("email");
				String p=rs.getString("password");
				
				
				Vendor vendors=new Vendor(s,e,p);
				 vendor.add(vendors);
				
				
				
			}
			
			
			
			
			
			
			
		}
		catch(SQLException e){
			throw new VendorException(e.getMessage());
			
		}
		
		if(vendor.size()==0) {
			throw new VendorException("no vendor record is there");
		}
		
		
		
		return vendor;
	}

	@Override
	public String tenderavailable(tender T) {
		
		
		
		String message="No tender";
		// TODO Auto-generated method stub
		
		
		try (Connection conn=DButil.provideConnection()){
			
			
			PreparedStatement as=conn.prepareStatement("insert into tender values(?,?,?)");
			as.setString(1,tender.getItem_name());
			as.setInt(2, tender.getQuantity());
			as.setString(3, tender.getStatus()) ;
			
			
			
			
		
				
				
				int x=as.executeUpdate();
				
				if(x>0) {
					message="tendor registered successfully";
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.getMessage();
			}
			
			
			
			
		
		
		
		
		
		return message;
	}

	@Override
	public List<tender> tenderList() throws tenderException {
		
		List<tender> T=new ArrayList<>();
		
try(Connection conn=DButil.provideConnection()){
			
			
			PreparedStatement ps=conn.prepareStatement("select * from tender");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				
				String e=rs.getString("item");
				int s=rs.getInt("quantity");
				String p=rs.getString("status");
				
				
				tender Ts=new tender(s,e,p);
				 T.add(Ts);
				
				
				
			}
			
			
			
			
			
			
			
		}
		catch(SQLException e){
			throw new tenderException(e.getMessage());
			
		}
		
		if(T.size()==0) {
			throw new tenderException("no tender record is there");
		}
		
		
		
		
		// TODO Auto-generated method stub
		return T;
	}

}



