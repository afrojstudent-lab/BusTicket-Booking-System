package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

import dao.UserDAO;
import model.User;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        // 1️⃣ Get form data
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 2️⃣ Create user object
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);

        try {
            // 3️⃣ Validate user
            User valid = new UserDAO().validate(u);

            if (valid != null) {

                // 4️⃣ Create NEW session (invalidate old if exists)
                HttpSession oldSession = req.getSession(false);
                if (oldSession != null) {
                    oldSession.invalidate();
                }

                HttpSession session = req.getSession(true);

                // 5️⃣ Store user data in session  ⭐ VERY IMPORTANT
                session.setAttribute("userId", valid.getId());
                session.setAttribute("username", valid.getUsername());
                session.setAttribute("role", valid.getRole());

                // (optional) session timeout
                session.setMaxInactiveInterval(30 * 60); // 30 minutes

                // 6️⃣ Redirect to view page
                res.sendRedirect("view");

            } else {
                // ❌ Invalid login
                res.sendRedirect("login.jsp?error=1");
            }

        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("login.jsp?error=server");
        }
    }
}