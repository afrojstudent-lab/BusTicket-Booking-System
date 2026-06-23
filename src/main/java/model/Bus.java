package model;

public class Bus {

    private int id;
    private String busName,source,destination;
    private double price;

    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public String getBusName(){return busName;}
    public void setBusName(String busName){this.busName=busName;}

    public String getSource(){return source;}
    public void setSource(String source){this.source=source;}

    public String getDestination(){return destination;}
    public void setDestination(String destination){this.destination=destination;}

    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;}
}
