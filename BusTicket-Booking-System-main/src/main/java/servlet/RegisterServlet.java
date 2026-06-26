package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import dao.UserDAO;
import model.User;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        User u = new User();
        u.setUsername(req.getParameter("username"));
        u.setPassword(req.getParameter("password"));

        try {
            new UserDAO().register(u);

            // ✅ AFTER REGISTER → GO TO LOGIN
            res.sendRedirect("login.jsp");

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}