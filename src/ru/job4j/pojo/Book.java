package ru.job4j.pojo;

public class Book {
    private String BookName;
    private int numberOfPages;

    public Book(String name, int number) {
        this.BookName = name;
        this.numberOfPages = number;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

}
