package model;

public class RGBColor {
    // Valores default
    private int red = 0, green = 0, blue = 0;
    private String name = "";

    // ============================
    // Constructores
    // ============================    

    // Default: generates Grey
    public RGBColor() {
        this(127, 127, 127, "Gray");
    }

    // No Name: Calls next constructor using this()
    public RGBColor(int r, int g, int b) {
        this(r, g, b, "Undefined");
    }

    // Has Name
    public RGBColor(int r, int g, int b, String name) {
        setRed(r);
        setGreen(g);
        setBlue(b);
        setName(name);
    }

    // ============================
    // Métodos
    // ============================

    // Setters
    public void setRed(int red) {
        if (red > 0 && red <= 255) {
            this.red = red;
        }
    }

    public void setGreen(int green) {
        if (green > 0 && green <= 255) {
            this.green = green;
        }
    }

    public void setBlue(int blue) {
        if (blue > 0 && blue <= 255) {
            this.blue = blue;
        }
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    // Getters
    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

    public String getName() {
        return this.name;
    }

    // Get Cyan, Magenta, Yellow
    public int getCyan() {
        return 255 - this.red;
    }

    public int getMagenta() {
        return 255 - this.green;
    }

    public int getYellow() {
        return 255 - this.blue;
    }

    // Get RGB in bits: | operator concatenates bits
    // Funciona para la clase
    public static int getRGB(int red, int blue, int green) {
        return (red<<16) | (green>>8) | (blue);
    }

    // Get RGB in bits: | operator concatenates bits
    // Funciona para el objeto
    public int getRGB() {
        return getRGB(this.red, this.blue, this.green);
    }

    // Other Methods
    public void print() {
        System.out.println(this.name + ": <" + this.red + ", " + this.green + ", " + this.blue + ">");
    }

    // String
    @Override
    public String toString() {
        return String.format("{red: %d, green: %d, blue: %d. Name: %s}", 
                                this.red, this.green, this.blue, this.name);
    } 

    // Equals
    @Override 
    public boolean equals(Object obj) {
        // En caso de que no pertenezca a la clase RGBColor
        if (!(obj instanceof RGBColor)) return false;
        
        // Parsear a RGBColor
        RGBColor c = (RGBColor) obj;

        // Checar si es igual
        return 
        c.getRed() == this.red && 
        c.getGreen() == this.green &&
        c.getBlue() == this.blue &&
        c.getName().equals(this.name);
    }

    // Greyscale
    public static int getGreyScale(RGBColor c) {
        int grey = (int) ((0.299 * c.getRed()) + (0.587 * c.getGreen()) + (0.114 * c.getBlue()));
        return grey;
    }

    // Clone
    public RGBColor clone() {
        return new RGBColor(this.red, this.green, this.blue, this.name);
    }

    public RGBColor RED() {
        return new RGBColor(255, 0, 0);
    }

}
