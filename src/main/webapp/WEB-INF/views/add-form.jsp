<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link href="/style.css" rel="stylesheet" />

</head>
<body>
<div class="container">
 <form action="show-data">
  <h1>be'FORE Cast</h1>
  	<label>Latitude</label>
  	<input type="number" name="lat" step=".01" value="Lat"/><br><br>
  	<label>Longitute</label>
  	<input type="number" name="lon" step=".01" value="Lon" /><br><br>
  	<button type="submit">Weather</button>
  </form>
</div>	
</body>
</html>