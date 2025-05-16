package Interface;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Micka");

        dog.sleep();
        dog.eat();
        dog.makeSound("Haf haf");

        System.out.println();

        cat.sleep();
        cat.eat();
        cat.makeSound("Meow meow");
    }
}
