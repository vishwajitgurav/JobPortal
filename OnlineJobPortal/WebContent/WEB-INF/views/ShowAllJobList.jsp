<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Job List</title>
</head>
<body>
		<table>
			<c:forEach var="jobs" items="${joblist}">
				<tr>
					<td>${jobs.companyname}</td>
					<td>${jobs.positionofjob}</td>
					<td>${jobs.salary}</td>
					<td><a href="applyforjob?id=${jobs.jobpost_id}">Apply</a></td>
				</tr>
			</c:forEach>	
		</table>
</body>
</html>