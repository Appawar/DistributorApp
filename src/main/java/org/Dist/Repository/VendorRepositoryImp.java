package org.Dist.Repository;

import java.util.List;

import org.Dist.Model.VendorModel;

public interface VendorRepositoryImp {
	
	public boolean isAddVendor(VendorModel model);
	public List<VendorModel> getVendorList();
	public boolean isDeleteVendorById(int vendorId);
	public List<VendorModel> getVendorByname(String name);
	
	

}
