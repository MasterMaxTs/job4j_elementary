package ru.job4j.poly;

public class Airplane implements Vehicle{
    private String name;
    private int accommodation;

    public Airplane(String name, int accommodation) {
        this.name = name;
        this.accommodation = accommodation;
    }

    @Override
    public void move() {
        System.out.println("Airplane is flying");
    }

    @Override
    public int accommodate() {
        return accommodation;
    }

    public String getInfo() {
        return name;
    }
}
