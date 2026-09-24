package tests;
import shapes2d.Rectangle;

public class TestRectangle {
    public static void main(String args[]) {
        System.out.println("Testing class Rectangle");
        // Crear objeto rectángulo 
        Rectangle r1 = new Rectangle();

        // Asignarle valores al objeto
        r1.base = 5;
        r1.height = 8;        
        r1.print();

        // Rectángulo r2 de base 7 y altura 3
        Rectangle r2 = new Rectangle();
        r2.base = 7;
        r2.height = 3;
        r2.print();

        // Rectangle con nuevos constructores
        Rectangle r3 = new Rectangle(5, 2);
        r3.print();

        Rectangle r4 = new Rectangle(9);
        r4.print();

        Rectangle r5 = new Rectangle(12, -20);
        r5.print();

        Rectangle r6 = new Rectangle();
        r6.print();

        // Imprimir
        System.out.println(r6);

        // Comparar con equals
        r3.setHeight(8);
        if (r1.equals(r3)) {
            System.out.println("r1 equals r3");
        } else {
            System.out.println("r1 does NOT equal r3");
        }
    } 
}