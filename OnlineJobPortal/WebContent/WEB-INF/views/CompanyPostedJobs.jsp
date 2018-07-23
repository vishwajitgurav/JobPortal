<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jobs Posted by Company</title>
</head>
<body>
		<table>
		<c:forEach var="job" items="${jobpostlist}">			
			<tr> 
				<td>${job.tech1}</td>
				<td>${job.tech2}</td>
				<td>${job.tech3}</td>
				<td>${job.tech4}</td>
				<td>${job.qualification}</td>
				<td>${job.positionofjob}</td>
				<td>${job.salary}</td>
				<td>${job.experience}</td>
				<td>${job.location}</td>
				<td>${job.vacancy}</td>	
			</tr>
		</c:forEach>			
			
		</table>
	

</body>
</html>