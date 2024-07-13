<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>superadmin</title>
<link rel="stylesheet" href="CS/style.css" />
<script type='text/javascript' src='JS/validate.js'></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container   myflex">
		<div class="nav flex-column nav-pills menubar mt-5" id="v-pills-tab"
			role="tablist" aria-orientation="vertical">
			<a class="nav-link active" id="v-pills-home-tab" data-toggle="pill"
				href="#v-pills-home" role="tab" aria-controls="v-pills-home"
				aria-selected="true">Company Master</a> <a class="nav-link" href="Newmasterjsp.jsp">Product Master</a>
			<a class="nav-link" id="v-pills-messages-tab" data-toggle="pill"
				href="#v-pills-messages" role="tab" aria-controls="v-pills-messages"
				aria-selected="false">Messages</a> <a class="nav-link"
				id="v-pills-settings-tab" data-toggle="pill"
				href="#v-pills-settings" role="tab" aria-controls="v-pills-settings"
				aria-selected="false">Settings</a>
		</div>
		<div class="  formcontent">
			<div class="tab-content" id="v-pills-tabContent">
				<div class="tab-pane fade show active p-5  " id="v-pills-home"
					role="tabpanel" aria-labelledby="v-pills-home-tab"><ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
  <li class="nav-item">
    <a class="nav-link active" id="pills-home-tab" data-toggle="pill" href="#pills-home" role="tab" aria-controls="#pills-home" aria-selected="true">New Vendor</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" id="pills-profile-tab" data-toggle="pill" href="#pills-profile" role="tab" aria-controls="#pills-profile" aria-selected="false">View Vendor</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" id="pills-contact-tab" data-toggle="pill" href="#pills-contact" role="tab" aria-controls="#pills-contact" aria-selected="false">Search Vendor</a>
  </li>
</ul>
<div class="tab-content" id="pills-tabContent">
  <div class="tab-pane fade show active" id="pills-home" role="tabpanel" aria-labelledby="pills-home-tab">
  <form name='frm'   action='savevendor' method='POST'  >
  <div class="form-group">
  <input type="text" value=" " id="txtVend" name="name" Placeholder="Vendor Name"  class="form-control" onkeyup='validatevendor()'>
  <br>
  <span id="s"></span>
   </div>
   
   
  <div class="form-group">
  <input type="submit" name="s" value="Add new Vendor" class="form-control">
   </div>
   
   </form>
                            <!-- ajax page -->
  </div>
  
  <div class="tab-pane fade" id="pills-profile" role="tabpanel" aria-labelledby="pills-profile-tab">
   <div class="form-group">
  <input type="text" value=" " id="txtVend" name="name" Placeholder="Search Vendor"  class="form-control" onkeyup="SearchusingAjax(this.value)">
  </div>
  
  <%@page import="org.Dist.Services.*,org.Dist.Controller.*,org.Dist.Model.*,org.Dist.Repository.*,java.util.*" %>
  <%!
       VendorServiceImp vendService =  new VendorService();
  %>
  <%
    List<VendorModel> vendList = vendService.getVendorList();
  %>
  <div id="showGrid">
   <table class="table table-hover" >
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">NAME</th>
      <th scope="col">DELETE</th>
      <th scope="col">UPDATE</th>
    </tr>
  </thead>
  <tbody>
  
   
  <%
  int count=0;
    for(VendorModel vmodel:vendList){
    	++count;
    	%>
    	<tr>
      <th scope="row"><%= count %></th>
      <td><%=vmodel.getVendor_name() %></td>
      <td><a href="DelVendor?vid=<%=vmodel.getVendor_id() %>">DELETE</a></td>
      <td><a href="#UpdateVendor?vid=<%=vmodel.getVendor_id()%>&<%=vmodel.getVendor_name()%>">UPDATE</a></td>
      
    </tr>
    	<% 
    	
    }
  %>
  
    
     
  </tbody>
</table>
  </div>
  </div>
  <div class="tab-pane fade" id="UpdateVendor" role="tabpanel" aria-labelledby="pills-contact-tab">UPDATE FORM</div>
  <div class="tab-pane fade" id="pills-contact" role="tabpanel" aria-labelledby="pills-contact-tab"></div>
</div></div>
				<div class="tab-pane fade" id="v-pills-profile" role="tabpanel"
					aria-labelledby="v-pills-profile-tab"></div>
				<div class="tab-pane fade" id="v-pills-messages" role="tabpanel"
					aria-labelledby="v-pills-messages-tab"></div>
				<div class="tab-pane fade" id="v-pills-settings" role="tabpanel"
					aria-labelledby="v-pills-settings-tab"></div>
			</div>
		</div>
	</div>


</body>
</html>