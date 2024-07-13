package org.Dist.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateVendor")
public class UpdateVendorController extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String VendorName=request.getParameter("name");
		int vendorid=Integer.parseInt(request.getParameter("vid"));
		RequestDispatcher r= request.getRequestDispatcher("Superadmin.jsp");
		r.include(request, response);
		out.println("<input type='text' name='vendorName' value='"+VendorName+"' >");
		out.println("<br><br><input type='submit' name='s' value='updateVendor'>");
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
