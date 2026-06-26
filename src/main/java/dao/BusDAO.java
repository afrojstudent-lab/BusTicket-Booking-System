package dao;
import java.sql.*;
import java.util.*;
import model.Bus;
import util.DBConnection;

public class BusDAO {

    public void addBus(Bus b)throws Exception{
        Connection con=DBConnection.getConnection();

        PreparedStatement ps=con.prepareStatement(
        "INSERT INTO bus(bus_name,source,destination,price) VALUES(?,?,?,?)");

        ps.setString(1,b.getBusName());
        ps.setString(2,b.getSource());
        ps.setString(3,b.getDestination());
        ps.setDouble(4,b.getPrice());

        ps.executeUpdate();
        con.close();
    }

    public List<Bus> getAllBus()throws Exception{
        List<Bus> list=new ArrayList<>();
        Connection con=DBConnection.getConnection();

        ResultSet rs=con.createStatement()
        .executeQuery("SELECT * FROM bus");

        while(rs.next()){
            Bus b=new Bus();
            b.setId(rs.getInt("id"));
            b.setBusName(rs.getString("bus_name"));
            b.setSource(rs.getString("source"));
            b.setDestination(rs.getString("destination"));
            b.setPrice(rs.getDouble("price"));
            list.add(b);
        }
        return list;
    }

    public void deleteBus(int id)throws Exception{
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(
        "DELETE FROM bus WHERE id=?");
        ps.setInt(1,id);
        ps.executeUpdate();
    }
    
    public Bus getBusById(int id) throws Exception {

        Bus b = null;

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
            con.prepareStatement("SELECT * FROM bus WHERE id=?");

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            b = new Bus();
            b.setId(rs.getInt("id"));
            b.setBusName(rs.getString("bus_name"));
            b.setSource(rs.getString("source"));
            b.setDestination(rs.getString("destination"));
            b.setPrice(rs.getDouble("price"));
        }

        con.close();

        return b;
    }

    public void updateBus(Bus b) throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
            "UPDATE bus SET bus_name=?, source=?, destination=?, price=? WHERE id=?"
        );

        ps.setString(1, b.getBusName());
        ps.setString(2, b.getSource());
        ps.setString(3, b.getDestination());
        ps.setDouble(4, b.getPrice());
        ps.setInt(5, b.getId());

        ps.executeUpdate();

        con.close();
    }

}
