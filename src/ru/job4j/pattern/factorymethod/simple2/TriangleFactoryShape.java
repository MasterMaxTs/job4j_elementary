package ru.job4j.pattern.factorymethod.simple2;

public class TriangleFactoryShape implements FactoryShape{
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
