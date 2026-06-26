package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import dao.BusDAO;

public class ViewBusServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,
			HttpServletResponse res)throws IOException,ServletException{

			try{
			req.setAttribute("data",
			new BusDAO().getAllBus());

			req.getRequestDispatcher("viewBus.jsp")
			.forward(req,res);

			}catch(Exception e){e.printStackTrace();}
			}

}
