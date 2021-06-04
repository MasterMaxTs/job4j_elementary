package ru.job4j.pattern.factoryMethod.simple1;

public class Program {
    public static void main(String[] args) {
        FactoryDeveloper factoryDeveloper = FactoryMethod.getDeveloperBySpeciality("PHP");
        Developer developer = factoryDeveloper.createDeveloper();
        developer.writeCode();


    }

}
