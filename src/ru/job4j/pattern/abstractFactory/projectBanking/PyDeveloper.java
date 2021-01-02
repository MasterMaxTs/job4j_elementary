package ru.job4j.pattern.abstractFactory.projectBanking;

import ru.job4j.pattern.abstractFactory.Developer;

public class PyDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python Developer writes python code...");
    }
}
