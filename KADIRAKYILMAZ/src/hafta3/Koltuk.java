public class Koltuk
    {private String flightNumber;
    private String departure;
    private String arrival;
    private int price;
    private boolean[][] seats;

    public Flight(String flightNumber, String departure, String arrival, int price, int rows, int seatsPerRow) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
        this.seats = new boolean[rows][seatsPerRow];
    }

    public boolean bookSeat(int row, int seat) {
        if (!seats[row][seat]) {
            seats[row][seat] = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean[][] getSeats() {
        return seats;
    }
}
