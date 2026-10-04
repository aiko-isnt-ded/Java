package tests;
import model.Session;

public class TestSession {
    public static void main(String args[]) {
        Session s1 = new Session("Kim Dokja", "rn");
        System.out.println(s1.getUsername());

        Session s2 = new Session("Yoo Joonghyuk", "yesterday");
        System.out.println(s2.getUsername());
    }
}