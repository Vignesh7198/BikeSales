<%@page import="java.io.BufferedReader"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bike.dto.Bike"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a style= text-align:left; href="frontPage.xhtml"> Back to Home Page</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a style= text-align:left; href="home.jsp">Add Bikes</a>

<table border="10px">

<tr>

  <th> Bike Model Number </th>
  <th> Bike Name </th>
  <th> Bike Color </th>
  <th> Delete Bike  </th>
  

</tr>
<%List<Bike> list = (ArrayList)request.getAttribute("list"); %>

<%for(Bike bike : list){ %>

<tr>
<td><%=bike.getBikeModelNo()%></td>
<td><%=bike.getBikeName()%></td>
<td><%=bike.getBikeColor()%></td>
<td><a href="delete?bikeModelNo=<%=bike.getBikeModelNo() %>">Delete</a></td>
</tr>

<%} %>

</table>


</body>
</html>