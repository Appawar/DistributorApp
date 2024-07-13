package org.Dist.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Dist.Model.VendorModel;
import org.Dist.Services.VendorService;

 
@WebServlet("/savevendor")
public class VendorController extends HttpServlet {
	 
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType( "text/html");
		 PrintWriter out=response.getWriter();
		 String vendorname=request.getParameter("name");
		 VendorModel model=new VendorModel();
		 model.setVendor_name(vendorname);
		 VendorService vser= new VendorService();
		 boolean b=vser.isAddVendor(model);
		 
		 if(b) {
			 
			 RequestDispatcher r= request.getRequestDispatcher("Superadmin.jsp");
			 r.forward(request, response);
		 }
		 else
		 {
			 out.println("<h1>not vendor added succesfully<h1>");
		 }
		 
		 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
