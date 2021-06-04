package ru.job4j.poly;

public class Train implements Vehicle{
    private String name;
    private int accommodation;

    public Train(String name, int accommodation) {
        this.name = name;
        this.accommodation = accommodation;
    }

    @Override
    public void move() {
        System.out.println("The train rides on the rails");
    }

    @Override
    public int accommodate() {
        return accommodation;
    }

    public String getInfo() {
        return name;
    }
}
