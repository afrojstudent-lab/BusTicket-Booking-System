package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;
import dao.BookingDAO;
import model.Booking;

public class BookSeatServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {

        int busId = Integer.parseInt(req.getParameter("busId"));

        try {
            List<Integer> booked =
                    new BookingDAO().getBookedSeats(busId);

            req.setAttribute("bookedSeats", booked);
            req.setAttribute("busId", busId);

            req.getRequestDispatcher("seatLayout.jsp")
               .forward(req, res);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession();
        int userId = (Integer)session.getAttribute("userId");

        Booking b = new Booking();

        b.setUserId(userId);
        b.setBusId(Integer.parseInt(req.getParameter("busId")));
        b.setPassengerName(req.getParameter("passengerName"));
        b.setSeatNumber(Integer.parseInt(req.getParameter("seatNumber")));

        try {
            new BookingDAO().bookSeat(b);
        } catch(Exception e) {
            e.printStackTrace();
        }

        res.sendRedirect("view");
    }
}
