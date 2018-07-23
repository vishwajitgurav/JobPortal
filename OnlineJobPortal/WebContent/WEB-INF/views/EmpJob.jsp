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
	<form:form class="form-horizontal" action="registeremployeejob" method="post" >
	 
	
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
	    <label class="col-sm-2 control-label">Position of Job Required</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="positionofjob" placeholder="Software Developer">
	    </div>
	  </div>
	  
	  <div class="form-group">
	    <label class="col-sm-2 control-label">Location</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="location" placeholder="Delhi">
	    </div>
	  </div>
	  
	  <div class="form-group">
	    <label class="col-sm-2 control-label">Package Application</label>
	    <div class="col-sm-10">
	      <input type="number" class="form-control" name="pkgexpected" placeholder="356000">
	    </div>
	  </div>
	  
	   <div class="form-group">
	    <label class="col-sm-2 control-label">Experience(In Years)</label>
	    <div class="col-sm-10">
	      <input type="number" class="form-control" name="experience" placeholder="3">
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