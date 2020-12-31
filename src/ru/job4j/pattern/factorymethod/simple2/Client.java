package ru.job4j.pattern.factorymethod.simple2;

public class Client {
    public static void main(String[] args) {
        FactoryShape factoryShape = getFactoryShape("Triangle");
        Shape triangle = factoryShape.createShape();
        triangle.draw();
    }

    public static FactoryShape getFactoryShape(String shape) {
        if (shape.equals("Sphere")) {
            return new SphereFactoryShape();
        } else if (shape.equals("Triangle")) {
            return new TriangleFactoryShape();
        } else {
            throw new RuntimeException(shape + "is unknown!");
        }
    }
}
