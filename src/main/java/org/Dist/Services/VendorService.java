package org.Dist.Services;

import java.util.List;

import org.Dist.Model.VendorModel;
import org.Dist.Repository.VendorRepository;

public class VendorService implements VendorServiceImp{
	
	VendorRepository vrepo=new VendorRepository();

	@Override
	public boolean isAddVendor(VendorModel model) {
		 
		return vrepo.isAddVendor(model);
	}
	public List<VendorModel> getVendorList(){
		
		return vrepo.getVendorList();
		
	}
	public boolean isDeleteVendorById(int vendorId) {
		
		return vrepo.isDeleteVendorById(vendorId);
		
	}
	public List<VendorModel> getVendorByname(String name){
		return vrepo.getVendorByname(name);
		
	}

}
