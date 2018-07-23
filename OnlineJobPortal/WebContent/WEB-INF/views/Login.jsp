<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-3.3.1.min.js"></script>
    <style>
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
    background-color: darkgray;
    border-radius: 5px;
    -webkit-box-shadow: 10px 10px 20px 1px #c4c7ca;
    box-shadow: 10px 10px 20px 1px #c4c7ca;
    }
    </style>
    </head>
<body>
	<form:form action="verifylogin" method="post" modelAttribute="user">
	<div class="div-center">
        <div class="form"> 
            <div class="form-group">
                <label for="">Email</label>
                <input name="email" type="email" class="form-control">
            </div>
            <div class="form-group">
                <label for="">Password</label>
                <input name="password" type="password" class="form-control">
            </div>
            <div class="form-group">
                <input type="submit"  value="Login" class="btn btn-success"/>
            </div>
        </div>
    </div>
    
    ${user}
	</form:form>
	
</body>
</html>




