package Enum;

public class Main {
    public static void main(String[] args) {
        for (SimpleColor color : SimpleColor.values()) {
            color.printRGB();
        }
    }
}
