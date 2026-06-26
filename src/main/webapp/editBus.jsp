<%@ page import="model.Bus" %>

<%
Bus b = (Bus)request.getAttribute("bus");
%>

<html>
<body>

<h2>Edit Bus</h2>

<form action="update" method="post">

<input type="hidden" name="id"
value="<%= b.getId() %>">

Name:
<input type="text" name="busName"
value="<%= b.getBusName() %>"><br>

Source:
<input type="text" name="source"
value="<%= b.getSource() %>"><br>

Destination:
<input type="text" name="destination"
value="<%= b.getDestination() %>"><br>

Price:
<input type="text" name="price"
value="<%= b.getPrice() %>"><br>

<input type="submit" value="Update">

</form>


</body>
</html>
