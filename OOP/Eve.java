package OOP;

public class Eve extends Robot{

    public Eve(String username, String brand, int power) {
        super(username, brand, power);
        
    }

    @Override
    public void work(int i) {
        System.out.println("Eve: " + Integer.toBinaryString(i));
    }
    
}
