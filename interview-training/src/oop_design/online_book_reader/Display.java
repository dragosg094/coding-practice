package oop_design.online_book_reader;

public class Display {
    private Book activeBook;
    private User activeUser;
    private int pageNumber;

    public void displayUser(User user) {
        activeUser = user;
        refreshUsername();
    }

    public void displayBook(Book book) {
        pageNumber = 0;
        activeBook = book;

        refreshTitle();
        refreshDetails();
        refreshPage();
    }

    public void turnPageForward() {
        pageNumber++;
        refreshPage();
    }

    private void refreshPage() {
    }

    public void refreshTitle() {
    }

    public void refreshUsername() {
    }

    public void refreshDetails() {
    }

}
