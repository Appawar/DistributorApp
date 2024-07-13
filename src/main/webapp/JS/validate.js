function validatevendor()
{
    var vendorName=document.getElementById("txtVend").value;
    let regExp=/^[a-zA-Z]+$/;
    let r=regExp.test(vendorName);
    if(r==false){
     let span=document.getElementById("s");
     span.innerHTML="Invalid name";
     }
     else{
     
       let span=document.getElementById("s");
     span.innerHTML="";
     
     }
       
    
    
}

function SearchusingAjax(str){

  let xhttp= new XMLHttpRequest();
  xhttp.onreadystatechange=function(){
  if(this.readyState==4 && this.status==200)
  {
    document.getElementById("showGrid").innerHTML=this.responseText;
  }
  
  
  };
  xhttp.open("GET","SearchVendor?n="+str,true);
  xhttp.send();




}
