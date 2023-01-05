package hafta2;

public class CarRentalCompany { private List<Car> cars;

    // Kiralık araçların listesi

    public CarRentalCompany() {
        cars = new ArrayList<>();
        cars.add(new Car("SUV"));
        cars.add(new Car("Sedan"));
        cars.add(new Car("Hatchback"));
    }
    public void rentCar(String carType, int duration) {
        for (Car car : cars) {
            if (car.getType().equals(carType) && !car.isRented()) {
                if (carType.equals("Hatchback") && duration != 1) {
                System.out.println("Hatchback araçlar sadece günlük kiralanabilir.");
                    return;
                }
                car.setRented(true);
                System.out.println(carType + " türünde bir araç başarıyla kiralandı.");

                if (carType.equals("SUV") && duration != 1) {
                    System.out.println("SUV araçlar günlük ve aylık kiralanabilir.");
                    return;
                }
                car.setRented(true);
                System.out.println(carType + " türünde bir araç başarıyla kiralandı.");


                // case2 için

                public boolean canSeeAllCars() {
                    return userType.equals("company");
                }

                public boolean canRentHatchback() {
                    return userType.equals("individual") && rentalPreference.equals("hatchback");
                }

            // case3 için
                private String make;
                private String model;
                private String color;
                public enum CarColor {
                    BLACK, WHITE, RED
                }
                //Örneğin kırmızı rengi seçelim
                Car car = new Car();
                car.setColor(CarColor.RED);
                private double dailyRate;
                private double weeklyRate;
                private double monthlyRate;
                private int luggageCapacity;




            }
