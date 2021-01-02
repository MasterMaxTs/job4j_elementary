package ru.job4j.pattern.abstractFactory;

public interface ProjectTeamFactory {
    Developer createDeveloper();
    Tester createManualTester();
    ProjectManager createPM();

}
