package ru.job4j.poly;

public class AutoBus implements Vehicle{
    private String name;
    private int accommodation;

    public AutoBus(String name, int accommodation) {
        this.name = name;
        this.accommodation = accommodation;
    }

    @Override
    public void move() {
        System.out.println("The bus goes on the road");
    }

    @Override
    public int accommodate() {
        return accommodation;
    }

    public String getName() {
        return name;
    }
}
