package Enum;

public enum SimpleColor implements Color{

    RED(255, 0, 0),
    BLUE(0, 0, 255),
    GREEN(0, 255, 0),
    YELLOW(255, 0, 255),
    PURPLE(255, 255, 0);

    
    public int red;
    public int green;
    public int blue;

    private SimpleColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public void printRGB() {
        System.out.println(name() + " -> (" + red + ", " + green + ", " + blue + ")");
    }
}
