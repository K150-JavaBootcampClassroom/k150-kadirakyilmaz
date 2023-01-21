public class Filght
    { public class Flight {
    private String flightNumber;
    private String departure;
    private String arrival;
    private int price;

    public Flight(String flightNumber, String departure, String arrival, int price) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getPrice() {
        return price;
    }
}

}
