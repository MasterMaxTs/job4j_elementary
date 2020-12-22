package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int index = 0;
        for (String el : value) {
            if (el.equals(key)) {
                rsl = index;
                break;
            }
            index++;
        } if (rsl == -1) {
            throw new ElementNotFoundException("Element not found!");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"One", "Two", "Three", "Four"};
        try {
            System.out.println("\"Two\" has index is " + indexOf(value, "Two"));
            System.out.println("\"Seven\" has index is " + indexOf(value, "Seven"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}


