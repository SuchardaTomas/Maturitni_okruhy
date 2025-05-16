package OOP;

abstract class Robot {
    private String username;
    private String brand;
    private int power;

    
    public Robot(String username, String brand, int power) {
        this.username = username;
        this.brand = brand;
        this.power = power;
    }

    public abstract void work(int i);
    
}
