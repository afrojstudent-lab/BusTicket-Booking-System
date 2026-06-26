package util;
import java.sql.*;

public class DBConnection {

    static String url="jdbc:mysql://localhost:3306/bus_booking";
    static String user="root";
    static String pass="root123";

    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,user,pass);
    }
}
