package ru.job4j.pattern.abstractFactory.projectBanking;

import ru.job4j.pattern.abstractFactory.Developer;
import ru.job4j.pattern.abstractFactory.ProjectManager;
import ru.job4j.pattern.abstractFactory.Tester;
import ru.job4j.pattern.abstractFactory.ProjectTeamFactory;

public class BankingTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer createDeveloper(String speciality) {
        if ("Java".equalsIgnoreCase(speciality)) {
            return new JavaDeveloper();
        } else if ("Python".equalsIgnoreCase(speciality)) {
            return new PyDeveloper();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality!");
        }
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
