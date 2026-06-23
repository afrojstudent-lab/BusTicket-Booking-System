<%@ page import="java.util.*,model.Bus" %>

<%
    // 🔐 Optional: remind user to login (comment if not needed)
    // if(session.getAttribute("userId") == null){
    //     response.sendRedirect("login.jsp");
    // }

    String user = (String)session.getAttribute("username");
    String role = (String)session.getAttribute("role");
%>

<!-- ================= NAVBAR ================= -->

<div style="margin-bottom:15px;">

<% if(user == null){ %>

    <a href="register.jsp">Register</a> |
    <a href="login.jsp">Login</a>

<% } else { %>

    Welcome, <b><%= user %></b> |

    <a href="myBookings">My Bookings</a> |

    <a href="logout">Logout</a>

<% } %>

</div>

<hr>

<!-- ================= TITLE ================= -->

<h2>Bus List</h2>

<!-- ================= ADMIN ONLY: ADD BUS ================= -->

<%
if("admin".equals(role)){
%>
    <a href="addBus.jsp"> Add Bus</a>
    <br><br>
<%
}
%>

<!-- ================= BUS TABLE ================= -->

<table border="1" cellpadding="8">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Source</th>
    <th>Destination</th>
    <th>Price</th>
    <th>Actions</th>
</tr>

<%
List<Bus> list = (List<Bus>)request.getAttribute("data");

if(list != null){
    for(Bus b : list){
%>

<tr>
    <td><%= b.getId() %></td>
    <td><%= b.getBusName() %></td>
    <td><%= b.getSource() %></td>
    <td><%= b.getDestination() %></td>
    <td><%= b.getPrice() %></td>

    <td>

        <!-- 🪑 Book seat for all logged users -->
        <a href="book?busId=<%= b.getId() %>">Book Seat</a>

        <!-- 🔐 Admin only actions -->
        <%
        if("admin".equals(role)){
        %>
            | <a href="edit?id=<%= b.getId() %>">Edit</a>
            | <a href="delete?id=<%= b.getId() %>">Delete</a>
        <%
        }
        %>

    </td>
</tr>

<%
    }
}
%>

</table>