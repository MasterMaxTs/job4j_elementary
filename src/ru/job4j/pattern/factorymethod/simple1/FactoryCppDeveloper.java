package ru.job4j.pattern.factorymethod.simple1;

public class FactoryCppDeveloper implements FactoryDeveloper{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
