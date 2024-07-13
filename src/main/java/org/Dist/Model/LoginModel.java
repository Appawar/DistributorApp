package org.Dist.Model;

public class LoginModel {
	
	private String username;
	private String password;
	private String logintype;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogintype() {
		return logintype;
	}
	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}
	@Override
	public String toString() {
		return "LoginModel [username=" + username + ", password=" + password + ", logintype=" + logintype
				+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getLogintype()="
				+ getLogintype() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public LoginModel() {
		 
	}
	public LoginModel(String username, String password, String logintype) {
	 
		this.username = username;
		this.password = password;
		this.logintype = logintype;
	}
	
	public int hashcode() {
		
		return username.length()*1000;
	}
	
	public boolean equals(Object obj) {
		LoginModel model = new LoginModel();
		if(model.username.equals(this.username)&& model.password.equals(this.password)&& model.logintype.equals(this.logintype)) {
			
			return true;
		}
		else {
			return false;
		}
	}
	

}
