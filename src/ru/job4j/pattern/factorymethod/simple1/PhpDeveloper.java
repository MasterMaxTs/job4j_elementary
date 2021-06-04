package ru.job4j.pattern.factorymethod.simple1;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("PHP Developer writes PHP code...");
    }
}
