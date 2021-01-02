package ru.job4j.pattern.abstractFactory.projectWebSite;

import ru.job4j.pattern.abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests code...");
    }
}
