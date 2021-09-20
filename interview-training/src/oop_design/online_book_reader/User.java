package oop_design.online_book_reader;

public class User {
    private int userId;
    private String details;
    private int accountType;

    public void renewMembership() {
    }

    public User(int id, String details, int accountType) {
        userId = id;
        this.details = details;
        this.accountType = accountType;
    }

    public int getID() {
        return userId;
    }

    public void setID(int id) {
        userId = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int t) {
        accountType = t;
    }
}
