package com.vendor.dao;

import java.util.List;

import com.vendor.Excepton.VendorException;
import com.vendor.Excepton.tenderException;
import com.vendor.bean.Vendor;
import com.vendor.bean.tender;

public interface TenderSystemdao {
	
	public String registerVendor(Vendor vendor);
	public Vendor vendorlogin(String username,String password) throws VendorException;
	
	public List<Vendor> showAllVendor() throws VendorException;

	
	
	public String tenderavailable(tender T);
	
	public List<tender> tenderList() throws tenderException;
	
}
