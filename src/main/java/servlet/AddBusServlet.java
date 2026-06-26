package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import dao.BusDAO;
import model.Bus;

public class AddBusServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        Bus b = new Bus();

        b.setBusName(req.getParameter("busName"));
        b.setSource(req.getParameter("source"));
        b.setDestination(req.getParameter("destination"));
        b.setPrice(Double.parseDouble(req.getParameter("price")));

        try {
            new BusDAO().addBus(b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        res.sendRedirect("view");
    }
}
