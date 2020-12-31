package ru.job4j.pattern.factorymethod.simple2;

public class SphereFactoryShape implements FactoryShape{
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
