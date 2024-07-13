package org.Dist.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Dist.Services.VendorService;

 
@WebServlet("/DelVendor")
public class DelVendorController extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 response.setContentType("text/html");
		 PrintWriter out= response.getWriter();
		 int vendorID=Integer.parseInt( request.getParameter("vid"));
		 VendorService vser=new VendorService();
		 boolean b=vser.isDeleteVendorById(vendorID);
		 if(b) {
			 
			 RequestDispatcher r=request.getRequestDispatcher("Superadmin.jsp");
			   r.include(request, response);
			    
			 
		 }else {
			 out.println("<h1>Some problem for delete vendor</h1>");
		 }
		  
		 
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
