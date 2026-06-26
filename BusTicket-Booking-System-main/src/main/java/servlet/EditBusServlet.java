package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import dao.BusDAO;
import model.Bus;

public class EditBusServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {

        // Get bus id from URL
        int id = Integer.parseInt(req.getParameter("id"));

        try {

            // Fetch bus from database
            Bus b = new BusDAO().getBusById(id);

            // Send bus object to JSP
            req.setAttribute("bus", b);

            // Forward to editBus.jsp
            RequestDispatcher rd =
                    req.getRequestDispatcher("editBus.jsp");

            rd.forward(req, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
