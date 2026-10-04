package tests;
import model.Date;

public class TestDate {
    public static void main(String args[]) {
        Date d1 = new Date();
        Date d2 = new Date(6, 9, 2004, 1);
        Date d3 = new Date(4, 12, 1905, 2);
        Date d4 = new Date(34, 22, 500,14);

        d1.print();
        d2.print();
        d3.print();
        d4.print();

        System.out.println("");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
    }
}