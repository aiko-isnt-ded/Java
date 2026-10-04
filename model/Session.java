package model;

public class Session {
    private String username;
    private String time;
    private static Session instance;

    // =======================
    // Constructor
    // =======================

    public static Session getInstance(username, time) {
        if(instance == null) instance = new Session(username, time);
        return instance;
    }

    private Session(String username, String time) {
        this.username = username;
        this.time = time;
    }

    // =======================
    // Getters
    // =======================

    public String getUsername() {
        return this.username;
    }

    public String getTime() {
        return this.time;
    }
}