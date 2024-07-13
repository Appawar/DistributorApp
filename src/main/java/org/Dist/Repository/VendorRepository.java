package org.Dist.Repository;

import java.util.ArrayList;
import java.util.List;

import org.Dist.Model.VendorModel;

public class VendorRepository extends DBParent implements  VendorRepositoryImp{
     List<VendorModel> list;
	@Override
	public boolean isAddVendor(VendorModel model) {
		 
		try {
			
			stmt=conn.prepareStatement(" insert into vendor values('0',?)");
			stmt.setString(1,model.getVendor_name());
			int values=stmt.executeUpdate();
			if(values>0) {
				return true;
			}else
			{
				return false;
			}
			
		}
		catch(Exception ex) {
			
			System.out.println("error is"+ ex);
		}
		return false;
	}
	public List<VendorModel> getVendorList(){
		try {
			list = new ArrayList<VendorModel>();
			stmt=conn.prepareStatement("select * from vendor");
			rs=stmt.executeQuery();
			while(rs.next()) {
				VendorModel m = new VendorModel();
				 m.setVendor_id( rs.getInt(1));
				 m.setVendor_name(rs.getString(2));
				 this.list.add(m);
			}
			return list.size()>0?list:null;
			
		}
		catch(Exception ex){
			
			System.out.println("error is"+ex);
			
		}
		return null;
		
		
	}
	
	 
	public boolean isDeleteVendorById(int vendorId) {
		 try {
			 
			 stmt=conn.prepareStatement("delete from vendor where vendor_id=?");
			 stmt.setInt(1, vendorId);
			 int value=stmt.executeUpdate();
			 return value>0?true:false;
			 
			 
		 }
		 catch(Exception ex){
			 System.out.println("err is"+ex);
			 
		 }
		return false;
	}
	public List<VendorModel> getVendorByname(String name) {
		try {
			list = new ArrayList<VendorModel>();
			stmt=conn.prepareStatement("select * from vendor where vendor_name like '%"+name+"%'");
			rs=stmt.executeQuery();
			while(rs.next()) {
				VendorModel m = new VendorModel();
				 m.setVendor_id( rs.getInt(1));
				 m.setVendor_name(rs.getString(2));
				 this.list.add(m);
			}
			return list.size()>0?list:null;
			
		}
		catch(Exception ex){
			
			System.out.println("error is"+ex);
			
		}
		return null;
	}

}
