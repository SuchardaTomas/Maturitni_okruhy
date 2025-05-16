package Navrhove_vzory;

public class CarFactory {
    public Car createCar(String name) {
        switch (name) {
            case "Rapid" -> {
                return new Car("Rapid", "Blue", "SKODA AUTO", "1.0 TSI");
            }
            case "Octavia" -> {
                return new Car("Octavia", "Grey", "SKODA AUTO", "1.9 TDI");
            }
            case "Passat" -> {
                return new Car("Passat", "Blue", "Volkswagen", "2.0 TDI");
            }
            case "Miata" -> {
                return new Car("Miata", "Silver", "Mazda", "1.5i");
            }
            case "Fabia" -> {
                return new Car("Fabia", "Red", "SKODA AUTO", "1.2 HTP");
            }
            default -> {
                return null;
            }
            
        }
    }
}
