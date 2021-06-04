package ru.job4j.pattern.factoryMethod.simple1;

public class FactoryCppDeveloper implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
