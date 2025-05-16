package OOP;

public class Walle extends Robot{

    public Walle(String username, String brand, int power) {
        super(username, brand, power);
    }

    @Override
    public void work(int i) {
        System.out.println("Walle: " + Math.pow(i, 2));
    }
    
}
