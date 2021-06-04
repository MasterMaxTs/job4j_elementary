package ru.job4j.pattern.factorymethod.simple1;

public class FactoryJavaDeveloper implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
