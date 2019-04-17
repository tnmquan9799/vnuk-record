<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add a new contact</title>
		<link rel="stylesheet" type="text/css" href="css/jquery-ui.css">
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/jquery-ui.js"></script>
	</head>
	<body>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
		<%@ taglib tagdir="/WEB-INF/tags" prefix="DF" %>
		<c:import url="header.jsp" />
		
		<h1>Add contacts</h1>
	
	        <form action="addContact" method="POST">
	        	<div>
	        		<label for="name">Name: </label>
	            	<input type="text" name="name" id="name">
	            </div>
	            
	        	<div>
	        		<label for="email">E-mail: </label>
	            	<input type="text" name="email" id="email">
	            </div>
	            
	        	<div>
	        		<label for="address">Address: </label>
	            	<input type="text" name="address" id="address">
	            </div>
	            
	        	<DF:myDateField label="Date of birth" name="date_of_birth" id="date-of-birth"/>
	            
	            
	            <input type="submit" value="Save" />
	        </form>
	        
		<c:import url="footer.jsp" />
		
	</body>
</html>