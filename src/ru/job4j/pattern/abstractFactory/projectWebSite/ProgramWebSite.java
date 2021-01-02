package ru.job4j.pattern.abstractFactory.projectWebSite;

import ru.job4j.pattern.abstractFactory.Developer;
import ru.job4j.pattern.abstractFactory.ProjectManager;
import ru.job4j.pattern.abstractFactory.Tester;

public class ProgramWebSite {
    /* Цель - есть проект.
     * Необходимо создать команду разработчиков целиком для реализации проекта
     * Пример команды для разработки приложения Web сайта:*/

    /**
     PhpDeveloper phpDeveloper = new PhpDeveloper();
     QATester manualTester = new QATester();
     WebsitePM projectManager = new WebsitePM();

     System.out.println("WebSite project is creating...");

     phpDeveloper.writeCode();
     manualTester.testCode();
     projectManager.manageProject();
     **/

    public static void main(String[] args) {
        WebSiteTeamFactory webSiteTeamFactory = new WebSiteTeamFactory();
        Developer phpDeveloper = webSiteTeamFactory.createDeveloper();
        Tester tester = webSiteTeamFactory.createManualTester();
        ProjectManager webSitePM = webSiteTeamFactory.createPM();
        System.out.printf("WebSite project team is working...%n%n");
        phpDeveloper.writeCode();
        tester.testCode();
        webSitePM.manageProject();
    }
}
