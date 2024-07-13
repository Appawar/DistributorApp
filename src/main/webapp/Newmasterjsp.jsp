<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
<style type="text/css">
 
.container{
width:90%;
display:flex;
flex-direction:column;
justify-content:space-between;
aligin-items:center;
 margin:auto;
   background: linear-gradient(to right, #0f2027, #203a43, #2c5364);
 


 
}
.nav{
flex-basis:105%;
 
height:700px

 


}
.sidebar{
 flex-basis:20%;
  
 padding:20px;
  
  
 
 
 }
 
 .sidebar ul{
   
   display:flex;
   flex-direction:column;
   aligin-items:center;
   justify-content:center;
    
   
  padding:10px;
 }
 .sidebar ul li{
 list-style:none;
 margin:12px;
 }
 .sidebar ul li a{
    text-decoration:none;
    color:white;
    margin:10px;
    font-size:1.5em;
 }
 .nav ul{
  display:flex;
  justify-content:center;
  aligin-items:center;
  margin-top:40px;
 }
 .nav ul li{
    list-style:none;
      margin:12px;
      
   
 }
 .nav ul li a{
    text-decoration:none;
    
    margin:10px;
    font-size:1.5em;
    color:white;
     
 }
 .nav ul li a:hover{
 background-color:gold;
 padding:10px;
 border-radius:12px;
 transition:0.2s ;
 }
 .sidebar ul li a:hover{
 background-color:gold;
 padding:10px;
 border-radius:12px;
 transition:0.2s ;
 }
 @media only screen and (max-width:1200px){
 
   .container{
   width:100%;
   height:100%;
}
 .nav ul{

   
  margin-left:40px;
 }
  
     .nav ul li a{
      
    font-size:1.3em;
    
     
 }
 

</style>
</head>
<body>
<div class="container  ">
<div class="nav">
<ul>
<li><a href="">Add new Product</a></li>
<li><a href="">View Product</a></li>
<li><a href="">View Vendor wise product</a></li>
</ul>
</div>
 
<div class="sidebar">
<ul>
<li><a href="">Company</a></li>
<li><a href="">Product</a></li>
<li><a href="">Messages</a></li>
<li><a href="">Settings</a></li>

</ul>
</div>
 
</div>
</div>

</body>
</html>