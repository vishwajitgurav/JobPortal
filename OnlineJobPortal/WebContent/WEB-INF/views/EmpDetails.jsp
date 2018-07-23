<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Personal & Address</title>
 <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
	
<div style="margin:0 auto">
	<form:form class="form-horizontal" action="registeremployeedetails" method="post" >
	  
	  <div class="form-group">
	    <label class="col-sm-2 control-label">First Name</label>
	    <div class="col-sm-10"> 
	      <input type="text" class="form-control" name="firstname" placeholder="First Name">
	    </div>
	  </div>
	  
	  
	  <div class="form-group">
	    <label class="col-sm-2 control-label">Middle Name</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="midname" placeholder="Middle Name">
	    </div>
	  </div>
	  
	  
	<div class="form-group">
	    <label class="col-sm-2 control-label">Last Name</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="lastname" placeholder="Last Name">
	    </div>
	  </div>
	  
	 <div class="form-group">
	    <label class="col-sm-2 control-label">Contact Number</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="contactnumber" placeholder="Contact Number">
	    </div>
	  </div>
	  
	  
	  <div class="form-group dropdown">
	    <label for="inputEmail3" class="col-sm-2 control-label">Gender</label>
	    <div class="col-sm-10">
	      <select name="gender" class="btn btn-default dropdown-toggle">
	      	<option>Male</option>
	      	<option>FeMale</option>	
	      </select>
	    </div>
	  </div>
	  
	  
	<div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">Date Of Birth</label>
	    <div class="col-sm-10">
	      <input type="date" class="form-control" name="dob">
	 	 </div>
	</div> 
	  
	  
	   <div class="form-group">
	    <label class="col-sm-2 control-label">Home Address</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="address" placeholder="221B Bakers Street">
	    </div>
	  </div>
	  
	  
	   <div class="form-group">
	    <label class="col-sm-2 control-label">City</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="city" placeholder="London">
	    </div>
	  </div>
	  
	  
	   <div class="form-group">
	    <label class="col-sm-2 control-label">Pincode</label>
	    <div class="col-sm-10">
	      <input type="number" class="form-control" name="pincode" placeholder="411005">
	    </div>
	  </div>
	  
	  
	   <div class="form-group">
	    <label class="col-sm-2 control-label">State & Country</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="state" placeholder="Maharashtra/India">
	    </div>
	  </div>
	  	  
	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10">
	      <input type="submit" class="btn btn-default" value="Submit">
	    </div>
	  </div>
</form:form>
</div>

</body>
</html>