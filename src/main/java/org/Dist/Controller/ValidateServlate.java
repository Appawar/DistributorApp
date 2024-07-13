package org.Dist.Controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Dist.Model.LoginModel;
import org.Dist.Repository.DBConfig;
import org.Dist.Repository.DBParent;
import org.Dist.Services.ValidateUserService;
import org.Dist.Services.ValidateuserServiceImp;
import org.apache.jasper.tagplugins.jstl.core.Out;

 
@WebServlet("/Valid")
public class ValidateServlate extends HttpServlet {
	 

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  response.setContentType("text/html" );
		  PrintWriter out = response.getWriter();
		  String path= request.getServletContext().getRealPath( "/")+"resources\\db.properties";
     	 
		  DBParent.path=path;
		  String username=request.getParameter("username");
		  String password=request.getParameter("Password");
		  LoginModel model= new LoginModel();
		  model.setUsername(username);
		  model.setPassword(password);
		  ValidateUserService validser = new ValidateuserServiceImp();
		  model = validser.isValidate(model) ; 
		   if(model.getLogintype().equals("SA")) {
			   
			    RequestDispatcher r =request.getRequestDispatcher("Superadmin.jsp");
			    r.forward(request, response);
		   }
		   else if(model.getLogintype().equals("emp")) {
			   
			   out.println("Call Emp");
			   
		   }
          else if(model.getLogintype().equals("Admin")) {
			   
			   out.println("Call Admin");
			   
		   }
          else if(model.getLogintype().equals("Cus")) {
			   
			   out.println("Call cus");
			   
		   }
		   else {
			   
			   out.println("Invalid username and password");
		   }
		   
		  
		  
		   
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
