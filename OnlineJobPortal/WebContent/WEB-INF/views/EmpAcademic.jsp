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
	<form:form class="form-horizontal" action="registeremployeeacademic" method="post" >
	  <div class="form-group">
	    <label class="col-sm-2 control-label">SSC School Name</label>
	    <div class="col-sm-10"> 
	      <input type="text" class="form-control" name="schoolname" placeholder="School Name">
	    </div>
	  </div>
	  
	  <div class="form-group">
	    <label class="col-sm-2 control-label">SSC Percentage</label>
	    <div class="col-sm-10">
	      <input type="number" class="form-control" name="sscmarks" placeholder="85.45">
	    </div>
	  </div>
	  
	<div class="form-group">
	    <label class="col-sm-2 control-label">HSC Collage Name</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="hscclgname" placeholder="HSC Collage Name">
	    </div>
	  </div>
	  
	 <div class="form-group">
	    <label class="col-sm-2 control-label">HSC Stream</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="hscstream" placeholder="Arts/Commerce/Science">
	    </div>
	  </div>
	  
	  
	  <div class="form-group">
	    <label class="col-sm-2 control-label">HSC Percentage</label>
	    <div class="col-sm-10">
	      <input type="number" class="form-control" name="hscmarks" placeholder="85.45">
	    </div>
	  </div>
	  
	 <div class="form-group">
	    <label class="col-sm-2 control-label">Diploma Collage Name</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="diplomaclgname" placeholder="Diploma Collage Name">
	    </div>
	  </div>
	  
	 <div class="form-group">
	    <label class="col-sm-2 control-label">Diploma Stream</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="diplomastream" placeholder="Electronics">
	    </div>
	  </div>
	  
	  
	  <div class="form-group">
	    <label class="col-sm-2 control-label">Diploma Percentage</label>
	    <div class="col-sm-10">
	      <input type="number" class="form-control" name="diplomamarks" placeholder="78.00">
	    </div>
	  </div>
	  
	 <div class="form-group">
	    <label class="col-sm-2 control-label">Degree Collage Name</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="degreeclgname" placeholder="Degree Collage Name">
	    </div>
	  </div>
	  
	 <div class="form-group">
	    <label class="col-sm-2 control-label">Degree Stream</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="degreestream" placeholder="Electronics">
	    </div>
	  </div>
	  
	  
	  <div class="form-group">
	    <label class="col-sm-2 control-label">Degree Percentage</label>
	    <div class="col-sm-10">
	      <input type="number" class="form-control" name="degreemarks" placeholder="78.00">
	    </div>
	  </div>
	 
	 <div class="form-group">
	    <label class="col-sm-2 control-label">Degree</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control" name="degree" placeholder="Electronics">
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