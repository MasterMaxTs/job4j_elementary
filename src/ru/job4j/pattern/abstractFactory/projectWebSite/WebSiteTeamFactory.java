package ru.job4j.pattern.abstractFactory.projectWebSite;

import ru.job4j.pattern.abstractFactory.Developer;
import ru.job4j.pattern.abstractFactory.ProjectManager;
import ru.job4j.pattern.abstractFactory.ProjectTeamFactory;
import ru.job4j.pattern.abstractFactory.Tester;
import ru.job4j.pattern.abstractFactory.projectBanking.QATester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper(String speciality) {
        if ("PHP".equalsIgnoreCase(speciality)) {
            return new PhpDeveloper();
        } else if ("JS".equalsIgnoreCase(speciality)) {
            return new JsDeveloper();
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
        return new WebSitePM();
    }
}
