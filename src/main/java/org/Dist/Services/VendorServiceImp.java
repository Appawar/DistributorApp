package org.Dist.Services;

import java.util.List;

import org.Dist.Model.VendorModel;

public interface VendorServiceImp {
	
	public boolean isAddVendor(VendorModel model);
	public List<VendorModel> getVendorList();
	public boolean isDeleteVendorById(int vendorId);
	public List<VendorModel> getVendorByname(String name);

}
