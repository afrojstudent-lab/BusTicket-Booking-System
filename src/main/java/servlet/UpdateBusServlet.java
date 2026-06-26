package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import dao.BusDAO;
import model.Bus;

public class UpdateBusServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        // Create Bus object
        Bus b = new Bus();

        // Get updated values from form
        b.setId(Integer.parseInt(req.getParameter("id")));
        b.setBusName(req.getParameter("busName"));
        b.setSource(req.getParameter("source"));
        b.setDestination(req.getParameter("destination"));
        b.setPrice(Double.parseDouble(req.getParameter("price")));

        try {
            // Call DAO update method
            new BusDAO().updateBus(b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Redirect to view page after update
        res.sendRedirect("view");
    }
}
