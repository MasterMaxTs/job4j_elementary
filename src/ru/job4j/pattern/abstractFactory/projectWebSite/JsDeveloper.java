package ru.job4j.pattern.abstractFactory.projectWebSite;

import ru.job4j.pattern.abstractFactory.Developer;

public class JsDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JS Developer writes js code...");
    }
}
