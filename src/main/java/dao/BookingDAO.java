package dao;
import java.sql.*;
import java.util.*;
import model.Booking;
import util.DBConnection;

public class BookingDAO {

    public void bookSeat(Booking b)throws Exception{
        Connection con=DBConnection.getConnection();

        PreparedStatement ps=con.prepareStatement(
        "INSERT INTO booking(user_id,bus_id,passenger_name,seat_number) VALUES(?,?,?,?)");

        ps.setInt(1,b.getUserId());
        ps.setInt(2,b.getBusId());
        ps.setString(3,b.getPassengerName());
        ps.setInt(4,b.getSeatNumber());

        ps.executeUpdate();
    }

    public List<Integer> getBookedSeats(int busId)throws Exception{
        List<Integer> seats=new ArrayList<>();
        Connection con=DBConnection.getConnection();

        PreparedStatement ps=con.prepareStatement(
        "SELECT seat_number FROM booking WHERE bus_id=?");

        ps.setInt(1,busId);

        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            seats.add(rs.getInt("seat_number"));
        }
        return seats;
    }
    
    public List<Booking> getUserBookings(int userId) throws Exception {

        List<Booking> list = new java.util.ArrayList<>();

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM booking WHERE user_id=?"
        );

        ps.setInt(1, userId);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Booking b = new Booking();

            b.setBookingId(rs.getInt("booking_id"));
            b.setUserId(rs.getInt("user_id"));
            b.setBusId(rs.getInt("bus_id"));
            b.setPassengerName(rs.getString("passenger_name"));
            b.setSeatNumber(rs.getInt("seat_number"));

            list.add(b);
        }

        con.close();
        return list;
    }
    
    public void deleteBooking(int bookingId) throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
            "DELETE FROM booking WHERE booking_id=?"
        );

        ps.setInt(1, bookingId);

        ps.executeUpdate();

        con.close();
    }

}
