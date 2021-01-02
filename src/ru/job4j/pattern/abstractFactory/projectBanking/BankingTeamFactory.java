package ru.job4j.pattern.abstractFactory.projectBanking;

import ru.job4j.pattern.abstractFactory.Developer;
import ru.job4j.pattern.abstractFactory.ProjectManager;
import ru.job4j.pattern.abstractFactory.Tester;
import ru.job4j.pattern.abstractFactory.ProjectTeamFactory;

public class BankingTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createManualTester() {
        return new QATester();
    }

    @Override
    public ProjectManager createPM() {
        return new BankingPM();
    }
}
