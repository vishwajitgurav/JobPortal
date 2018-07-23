<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Company Details</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="js/jquery-3.3.1.min.js"></script>
<style type="text/css">
.div-center {
    width: 300px;
    height: 250px;
    margin: auto;
    right: 0; 
    top: 0;
    left: 0;
    bottom: 0;
    position: absolute;
    padding: 30px;
    background-color: bisque;
    border-radius: 5px;
    -webkit-box-shadow: 10px 10px 20px 1px #c4c7ca;
    box-shadow: 10px 10px 20px 1px #c4c7ca;
}
</style>
</head>
<body>
<form:form class="form-horizontal" modelAttribute="company"  method="post" action="registercompanydetails">
<div class="div-center">
	<div><strong>Company Details:</strong></div>
  <div class="form-group">
    <label for="inputcompanyname" class="col-sm-2 control-label">Companyname</label>
    <div class="col-sm-12">
      <input type="text" class="form-control" id="companyname" name="companyname" placeholder="eg. Apple">
    </div>
  </div>
  <div class="form-group">
    <label for="inputcompanytype" class="col-sm-2 control-label">Company Type</label>
    <div class="col-sm-12">
      <input type="text" class="form-control" id="companytype" name="companytype" placeholder="">
    </div>
  </div>
  <div class="form-group">
    <label for="inputindustry" class="col-sm-2 control-label">Industry</label>
    <div class="col-sm-12">
      <input type="text" class="form-control" id="industry" name="industry" placeholder="">
    </div>
  </div>
  <div><strong>Company Address Details:</strong></div>
  <div class="form-group">
    <label for="inputaddress" class="col-sm-2 control-label">Address</label>
    <div class="col-sm-12">
    	<textarea rows="6" cols="30" class="form-control" id="address" name="address"></textarea>
    </div>
  </div>
   <div class="form-group">
    <label for="inputcity" class="col-sm-2 control-label">City</label>
    <div class="col-sm-12">
      <input type="text" class="form-control" id="city" name="city" placeholder="">
    </div>
  </div>
   <div class="form-group">
    <label for="inputpincode" class="col-sm-2 control-label">Pincode</label>
    <div class="col-sm-12">
      <input type="text" class="form-control" id="pincode" name="pincode" placeholder="">
    </div>
  </div>
   <div class="form-group">
    <label for="inputstate" class="col-sm-2 control-label">State</label>
    <div class="col-sm-12">
      <input type="text" class="form-control" id="state" name="state" placeholder="">
    </div>
  </div>
   <div class="form-group">
    <label for="inputcountry" class="col-sm-2 control-label">Country</label>
    <div class="col-sm-12">
      <input type="text" class="form-control" id="country" name="country" placeholder="">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <input type="submit" id="btn"  value="Submit" name="Submit" class="btn btn-success">
    </div>
  </div>
    <div>
	<h3 style="color: red">${company}</h3>  
  </div>  
</div>
</form:form>
</body>
</html>