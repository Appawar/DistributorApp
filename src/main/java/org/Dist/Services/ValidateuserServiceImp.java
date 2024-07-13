package org.Dist.Services;

import org.Dist.Model.LoginModel;
import org.Dist.Repository.ValidateUserRepositoryImp;

public class ValidateuserServiceImp implements ValidateUserService  {
	
	ValidateUserRepositoryImp validRepo = new ValidateUserRepositoryImp();
	
	 public LoginModel isValidate(LoginModel model) {
		 
		 return validRepo.isValidate(model);
	 }

}
