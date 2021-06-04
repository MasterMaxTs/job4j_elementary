package ru.job4j.pattern.factoryMethod.simple1;

public class FactoryJavaDeveloper implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
