package ru.job4j.pattern.abstractFactory.projectBanking;

import ru.job4j.pattern.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes java code...");
    }
}
