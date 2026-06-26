<%@ page import="java.util.*" %>

<%
List<Integer> booked =
(List<Integer>)request.getAttribute("bookedSeats");

int busId =
(Integer)request.getAttribute("busId");
%>

<h2>Select Seat</h2>

<form action="book" method="post">

<input type="hidden" name="busId"
value="<%= busId %>">

Passenger Name:
<input type="text" name="passengerName"><br><br>

Seat:
<select name="seatNumber">

<%
for(int i=1;i<=40;i++){

if(booked.contains(i)){
%>
<option disabled>
Seat <%= i %> (Booked)
</option>
<%
}else{
%>
<option value="<%= i %>">
Seat <%= i %>
</option>
<%
}
}
%>

</select>

<input type="submit" value="Book Seat">

</form>
