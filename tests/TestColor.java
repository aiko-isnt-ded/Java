package tests;
import model.RGBColor;

public class TestColor {
    public static void main() {
        RGBColor c1 = new RGBColor();
        RGBColor c2 = new RGBColor(12, 43, 4, "Color1");
        RGBColor c3 = new RGBColor(-12, 356, 4, "Color2");
    
        // Try changing c3 values
        c3.setBlue(-100);

        c1.print();
        c2.print();
        c3.print();
        System.out.printf("%06X\n", c1.getRGB());
        System.out.println(c1.toString());


    }
}
