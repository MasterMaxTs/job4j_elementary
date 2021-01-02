package ru.job4j.pattern.abstractFactory.projectBanking;

import ru.job4j.pattern.abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests code...");
    }
}
