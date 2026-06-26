package dao;
import java.sql.*;
import model.User;
import util.DBConnection;

public class UserDAO {

    public void register(User u)throws Exception{
        Connection con=DBConnection.getConnection();

        PreparedStatement ps=con.prepareStatement(
        "INSERT INTO user(username,password,role) VALUES(?,?,?)");

        ps.setString(1,u.getUsername());
        ps.setString(2,u.getPassword());
        ps.setString(3,"user");

        ps.executeUpdate();
        con.close();
    }

    public User validate(User u) throws Exception {

        User user = null;

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM user WHERE username=? AND password=?"
        );

        ps.setString(1, u.getUsername());
        ps.setString(2, u.getPassword());

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setRole(rs.getString("role")); // ⭐ MUST EXIST
        }

        con.close();
        return user;
    }
}
