public class Bilet
    {  public void bookTicket(Flight flight, String airline) {
    int price = 0;
    if (airline.equals("THY")) {
        price = calculatePriceTHY(flight);
    } else if (airline.equals("Pegasus")) {
        price = calculatePricePegasus(flight);
    }
    // bilet satın alma işlemleri
}
}
