package servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.BusDAO;

public class DeleteBusServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        try {
            new BusDAO().deleteBus(id);
        } catch(Exception e){
            e.printStackTrace();
        }

        res.sendRedirect("view");
    }
}
