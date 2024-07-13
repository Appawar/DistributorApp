package org.Dist.Repository;

import org.Dist.Model.LoginModel;

public class ValidateUserRepositoryImp extends DBParent implements ValidateUserRepository{
	
	   public LoginModel isValidate(LoginModel model) {
		   try {
			   
			   stmt=conn.prepareStatement("select * from login where username=? and password=?");
			   stmt.setString(1, model.getUsername());
			   stmt.setString(2, model.getPassword());
			   rs=stmt.executeQuery();
			   if(rs.next()) {
				   model.setLogintype(rs.getString("logintype"));
				  
				   
			   }
			   return model;
			   
		   }
		   catch(Exception e) {
			   
			   System.out.println("Error is"+e);
			   
			   return null;
		   }
		 
		   
	   }
	
	

}
