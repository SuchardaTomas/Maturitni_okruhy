package Navrhove_vzory;

public class Car {
    public String name;
    public String color;
    public String brand;
    public String engine;
    
    public Car(String name, String color, String brand, String engine) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", color=" + color + ", brand=" + brand + ", engine=" + engine + "]";
    }

    
}
