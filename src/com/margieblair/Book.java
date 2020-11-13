package com.margieblair;

public class Book {
    private String title;
    private String author;
    private boolean status;

    public Book(String title, String author, boolean checkedIn) {
        this.title = title;
        this.author = author;
        this.status = checkedIn;
    }

    public boolean isCheckedIn() {
        return status;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.status = checkedIn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
