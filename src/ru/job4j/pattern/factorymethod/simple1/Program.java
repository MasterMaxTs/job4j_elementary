package ru.job4j.pattern.factorymethod.simple1;

public class Program {
    public static void main(String[] args) {
        FactoryDeveloper factoryDeveloper = getDeveloperBySpeciality("PHP");
        Developer developer = factoryDeveloper.createDeveloper();
        developer.writeCode();


    }

    public static FactoryDeveloper getDeveloperBySpeciality(String speciality) {
        if (speciality.equals("Java")) {
            return new FactoryJavaDeveloper();
        } else if (speciality.equals("C++")) {
            return new FactoryCppDeveloper();
        } else if (speciality.equals("PHP")) {
            return new PhpFactoryDeveloper();
        } else {
            throw new RuntimeException(speciality + "is unknown!");
        }
    }
}
