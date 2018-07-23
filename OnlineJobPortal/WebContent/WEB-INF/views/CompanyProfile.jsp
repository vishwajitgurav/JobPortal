<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Company Profile</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
    <script src="js/jquery-3.3.1.min.js"></script>
</head>

<body>
<div class="container">
  <div class="jumbotron">

  <ul class="list-group">
  <li class="list-group-item list-item">
      <div><strong>Username</strong>: ${cd.username}</div>
      <div><strong>Email</strong>: ${cd.email}</div>
      <div><strong>Company Name:</strong>: ${cd.companyname}</div>
      <div><strong>Company Type:</strong>: ${cd.companytype}</div>
      <div><strong>Industry:</strong>: ${cd.industry}</div>
      <div><strong>Address:</strong>: ${cd.address}</div>
      <div><strong>City:</strong>: ${cd.city}</div>
      <div><strong>Pincode</strong>: ${cd.pincode}</div>
      <div><strong>State</strong>: ${cd.state}</div>
      <div><strong>Country:</strong>: ${cd.country}</div>
 
  </li>
  </ul>
        
</div> 
</div>               

</body>
</html>