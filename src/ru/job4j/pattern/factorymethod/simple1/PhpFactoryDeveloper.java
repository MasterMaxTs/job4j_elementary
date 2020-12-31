package ru.job4j.pattern.factorymethod.simple1;

public class PhpFactoryDeveloper implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
