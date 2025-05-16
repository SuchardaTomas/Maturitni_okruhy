package Interface;

public class Dog implements Animal{
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void makeSound(String sound) {
        System.out.println(name + " make sound " + sound);
    }

}
