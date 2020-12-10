package ru.job4j.pojo;

public class Library {

    public static void viewOfLibrary(Book[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + " Book name is " + array[i].getBookName()
                    + ", number of pages is " + array[i].getNumberOfPages());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Book book1 = new Book("\"Queen of the sun\"",  253);
        Book book2 = new Book("\"Clean code\"",  432);
        Book book3 = new Book("\"Fathers and children\"",  240);
        Book book4 = new Book("\"Effective programming\"",  311);
        Book[] array = {book1, book2, book3, book4};
        viewOfLibrary(array);
        Book temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        viewOfLibrary(array);
        for (int i = 0; i < array.length; i++) {
            if("\"Clean code\"".equals(array[i].getBookName())) {
                System.out.println("#" + i + " Book name is " + array[i].getBookName()
                        + "number of pages is " + array[i].getNumberOfPages());
            }
        }
    }
}
