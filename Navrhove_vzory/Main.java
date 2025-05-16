package Navrhove_vzory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car car1 = factory.createCar("Rapid");
        Car car2 = factory.createCar("Miata");
        Car car3 = factory.createCar("Passat");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
