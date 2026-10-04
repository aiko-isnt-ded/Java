package tests;
import model.Date;

public class TestDate {
    public static void main(String args[]) {
        // Initiliaze dates
        Date d1 = new Date();
        Date d2 = new Date(6, 9, 2004, 1);
        Date d3 = new Date(30, 4, 2005, 0);
        Date d4 = new Date(34, 22, 500,14);
        Date d5 = new Date(28, 2, 8784, 0);
        Date d6 = new Date(-8, -12, 1968, 2);

        // Print original dates
        System.out.println("==============================");
        System.out.println("Original Dates:");
        System.out.println("==============================");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
        System.out.println(d5.toString());
        System.out.println(d6.toString());
        
        // Setters
        System.out.println("\n==============================");
        System.out.println("Try setters:");
        System.out.println("==============================");
        d1.setDay(31);
        d1.setMonth(12);
        d1.setYear(2016);
        d1.setFormat(2);
        System.out.printf("New values of d1: %s\n", d1.toString());

        // Getters
        System.out.println("\n==============================");
        System.out.println("Try getters:");
        System.out.println("==============================");
        System.out.printf("Values of d2. Day: %d, Month: %d, Year: %d. MonthName: %s. Format: %d\n", 
                            d2.getDay(), d2.getMonth(), d2.getYear(), d2.getMonthName(), d2.getFormat()
        );

        // Clone
        System.out.println("\n==============================");
        System.out.println("Clone:");
        System.out.println("==============================");
        Date d7 = d4.clone();
        System.out.printf("D4: %s. D7: %s\n", d4.toString(), d7.toString());
        System.out.printf("D4 == D7: %b\n", d4 == d7);

        // Equals
        System.out.println("\n==============================");
        System.out.println("Equals:");
        System.out.println("==============================");
        System.out.printf("D4 EQUALS D7: %b\n", d4.equals(d7));

        System.out.println("\n==============================");
        System.out.println("Next Method:");
        System.out.println("==============================");
        System.out.printf("Current day: %s\n", d3.toString());
        d3.next();
        System.out.printf("Next day: %s\n", d3.toString());

        System.out.println();
        System.out.printf("Current day: %s\n", d1.toString());
        d1.next();
        System.out.printf("Next day: %s\n", d1.toString());
    }
}