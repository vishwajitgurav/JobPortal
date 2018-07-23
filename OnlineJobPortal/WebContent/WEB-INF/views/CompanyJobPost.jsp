<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Company Job Post</title>
 <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
	
<div style="margin:0 auto">
	<form:form class="form-horizontal" action="registercompanyjobpost" method="post" >
	 
	 
	 
	  <div class="form-group dropdown">
	    <label for="inputEmail3" class="col-sm-2 control-label">Language & Technology Known</label>
	    <div class="col-sm-10">
	      <select name="tech1" class="btn btn-default dropdown-toggle">
	      	<option>Java</option>
	      	<option>.Net</option>	
	      	<option>Hibernate</option>
	      	<option>Spring</option>	
	      	<option>Angular</option>
	      	<option>PHP</option>	
	      	<option>Python</option>
	      	<option>CPP</option>	
	      </select>
	    </div>
	  </div>
	  
	  <div class="form-group dropdown">
	    <label for="inputEmail3" class="col-sm-2 control-label">Language & Technology Known</label>
	    <div class="col-sm-10">
	      <select name="tech2" class="btn btn-default dropdown-toggle">
	      	<option>Java</option>
	      	<option>.Net</option>	
	      	<option>Hibernate</option>
	      	<option>Spring</option>	
	      	<option>Angular</option>
	      	<option>PHP</option>	
	      	<option>Python</option>
	      	<option>CPP</option>	
	      </select>
	    </div>
	  </div>
	  
	  <div class="form-group dropdown">
	    <label for="inputEmail3" class="col-sm-2 control-label">Language & Technology Known</label>
	    <div class="col-sm-10">
	      <select name="tech3" class="btn btn-default dropdown-toggle">
	      	<option>Java</option>
	      	<option>.Net</option>	
	      	<option>Hibernate</option>
	      	<option>Spring</option>	
	      	<option>Angular</option>
	      	<option>PHP</option>	
	      	<option>Python</option>
	      	<option>CPP</option>	
	      </select>
	    </div>
	  </div>
	  
	  <div class="form-group dropdown">
	    <label for="inputEmail3" class="col-sm-2 control-label">Language & Technology Known</label>
	    <div class="col-sm-10">
	      <select name="tech4" class="btn btn-default dropdown-toggle">
	      	<option>Java</option>
	      	<option>.Net</option>	
	      	<option>Hibernate</option>
	      	<option>Spring</option>	
	      	<option>Angular</option>
	      	<option>PHP</option>	
	      	<option>Python</option>
	      	<option>CPP</option>	
	      </select>
	    </div>
	  </div>
	
	 
	 
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">Qualification</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="qualification" placeholder="B.E.">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">Position of Job</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="positionofjob" placeholder="Software Developer">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">Experience</label>
	    <div class="col-sm-10">
	      <input type="number" class="form-control" name="experience" placeholder="1">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">Annual Salary</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="salary" placeholder="450000">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail3" class="col-sm-2 control-label">Location</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="location" placeholder="Pune">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword3" class="col-sm-2 control-label">Vacancy</label>
	    <div class="col-sm-10">
	      <input type="number" class="form-control" name="vacancy" placeholder="20">
	    </div>
	  </div>
	  
	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10">
	      <input type="submit" class="btn btn-default" value="Post Job">
	    </div>
	  </div>
</form:form>
</div>

</body>
</html>