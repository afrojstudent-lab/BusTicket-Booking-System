package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

import dao.BookingDAO;
import model.Booking;

public class MyBookingsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {
    	
    	

        HttpSession session = req.getSession(false);

        // 🔐 check login
        if (session == null || session.getAttribute("userId") == null) {
            res.sendRedirect("login.jsp");
            return;
        }

        int userId = (Integer) session.getAttribute("userId");

        try {
            BookingDAO dao = new BookingDAO();
            List<Booking> list = dao.getUserBookings(userId);

            req.setAttribute("bookings", list);

            RequestDispatcher rd =
                    req.getRequestDispatcher("myBookings.jsp");
            rd.forward(req, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}