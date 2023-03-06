public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Mercedes", 2020, "diesel", 50, "1");
        Bus bus2 = new Bus("Ikarus", 1960, "AI80", 500000, "2");
        Car car1 = new Car("Skoda", 2021, "AI98", 30000, 180);
        Car car2 = new Car("Ford", 2017, "AI92", 50000, 150);

        bus1.getInfo();
        bus2.getInfo();
        car1.getInfo();
        car2.getInfo();
    }

}