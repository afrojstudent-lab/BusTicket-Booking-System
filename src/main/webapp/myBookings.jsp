<%@ page import="java.util.*,model.Booking" %>

<h2>My Bookings</h2>

<table border="1" cellpadding="8">

<tr>
    <th>Booking ID</th>
    <th>Bus ID</th>
    <th>Passenger</th>
    <th>Seat</th>
    <th>Action</th>
</tr>

<%
List<Booking> list =
    (List<Booking>) request.getAttribute("bookings");

if (list != null && !list.isEmpty()) {
    for (Booking b : list) {
%>

<tr>
    <td><%= b.getBookingId() %></td>
    <td><%= b.getBusId() %></td>
    <td><%= b.getPassengerName() %></td>
    <td><%= b.getSeatNumber() %></td>

    <td>
        <a href="cancelBooking?id=<%= b.getBookingId() %>"
           onclick="return confirm('Cancel this booking?')">
            Cancel
        </a>
    </td>
</tr>

<%
    }
} else {
%>

<tr>
    <td colspan="5">No bookings found</td>
</tr>

<%
}
%>

</table>