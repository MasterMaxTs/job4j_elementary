package ru.job4j.pattern.abstractFactory;

public interface ProjectTeamFactory {
    Developer createDeveloper(String speciality);
    Tester createManualTester();
    ProjectManager createPM();

}
