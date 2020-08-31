<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
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
   <h1>Forecast for ${cityName}</h1>
   <h2>Today's Date is ${date}</h2>
   <table class="table table-bordered table-dark">
   		<thead>
   			<tr>
   			<th>Day1</th><th>Day2</th><th>Day3</th><th>Day4</th><th>Day5</th><th>Day6</th><th>Day7</th>
   			<th>Day8</th><th>Day9</th><th>Day10</th><th>Day11</th><th>Day12</th><th>Day13</th><th>Day14</th>   	
   			</tr>
   		</thead>
   		<tbody>
   			<tr>
			 <c:forEach var="data" items="${data.temperature}">
   				<td><c:out value="${data}"/></td>
   			</c:forEach></tr>
   			<tr>
			 <c:forEach var="data" items="${data.text}">
   				<td><c:out value="${data}"/></td>
   			</c:forEach></tr>
   		</tbody>
   </table>
</body>
</html>