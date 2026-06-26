package model;

public class Booking {

    private int bookingId,userId,busId,seatNumber;
    private String passengerName;

    public int getBookingId(){return bookingId;}
    public void setBookingId(int bookingId){this.bookingId=bookingId;}

    public int getUserId(){return userId;}
    public void setUserId(int userId){this.userId=userId;}

    public int getBusId(){return busId;}
    public void setBusId(int busId){this.busId=busId;}

    public int getSeatNumber(){return seatNumber;}
    public void setSeatNumber(int seatNumber){this.seatNumber=seatNumber;}

    public String getPassengerName(){return passengerName;}
    public void setPassengerName(String passengerName){this.passengerName=passengerName;}
}
