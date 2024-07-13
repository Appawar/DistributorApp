package org.Dist.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Dist.Model.VendorModel;
import org.Dist.Services.VendorService;
 
@WebServlet("/SearchVendor")
public class SearchVendorController extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("n");
		VendorService vser = new VendorService();
		List<VendorModel> vlist=vser.getVendorByname(name);
		out.println("<table class=\"table table-hover\" >");
		  out.println("<thead>");
		  out.println("<tr> ");
		  out.println("<th scope=\"col\">ID</th>");
		  out.println(" <th scope=\"col\">NAME</th>");
		  out.println(" <th scope=\"col\">DELETE</th>");
		  out.println(" <th scope=\"col\">UPDATE</th>");
		  out.println("<tr> ");
		  out.println("  </thead>");
		  out.println("  <tbody> ");
		  
		  
		
		  
		for(VendorModel v:vlist) {
			  out.println("  <tr> ");
			  out.println(" <th scope=\"row\">"+v.getVendor_id()+"</th>  ");
			  out.println(" <td>"+v.getVendor_name()+"</td>   ");
			  out.println("   <td><a href='DelVendor?vid="+v.getVendor_id()+"'>DELETE</a></td> ");
			  out.println("  <td> <a href=''>UPDATE</a></td></td>  ");
			  out.println("</tr>");
			  
			
		      
		      
		     
		      
		      
		    
			
		}
		out.println("  </tbody> ");
		out.println("</table>");
		
		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
