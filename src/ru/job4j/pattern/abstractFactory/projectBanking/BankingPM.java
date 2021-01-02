package ru.job4j.pattern.abstractFactory.projectBanking;

import ru.job4j.pattern.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages project...");
    }
}
