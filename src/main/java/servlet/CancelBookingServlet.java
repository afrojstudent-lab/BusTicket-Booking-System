package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import dao.BookingDAO;

public class CancelBookingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {

        try {

            int bookingId =
                Integer.parseInt(req.getParameter("id"));

            BookingDAO dao = new BookingDAO();
            dao.deleteBooking(bookingId);

            // ✅ redirect back to my bookings
            res.sendRedirect("myBookings");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}