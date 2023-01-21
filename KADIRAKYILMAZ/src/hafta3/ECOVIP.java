public class ECOVIP
    { public int calculatePriceTHY(Flight flight, String classType) {
    int price = flight.getPrice();
    if (classType.equals("Business")) {
        price = price * 1.5;
    }
    return price;
}

    public int calculatePricePegasus(Flight flight, String classType) {
        int price = flight.getPrice();
        if (classType.equals("Business")) {
            price = price * 1.3;
        }
        return price;
    }

    public void bookTicket(Flight flight, String airline, String classType) {
        int price = 0;
        if (airline.equals("THY")) {
            price = calculatePriceTHY(flight, classType);
        } else if (airline.equals("Pegasus")) {
            price = calculatePricePegasus(flight, classType);
        }
        // bilet satın alma işlemleri
    }
}
