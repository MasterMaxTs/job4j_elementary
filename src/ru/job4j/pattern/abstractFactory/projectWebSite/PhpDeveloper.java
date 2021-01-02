package ru.job4j.pattern.abstractFactory.projectWebSite;

import ru.job4j.pattern.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP Developer writes php code...");
    }
}
