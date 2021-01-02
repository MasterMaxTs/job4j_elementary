package ru.job4j.pattern.abstractFactory.projectBanking;

import ru.job4j.pattern.abstractFactory.Developer;
import ru.job4j.pattern.abstractFactory.ProjectManager;
import ru.job4j.pattern.abstractFactory.Tester;

public class ProgramBanking {

        /* Цель - есть проект.
        * Необходимо создать команду разработчиков целиком для реализации проекта
        * Пример команды для разработки Банковского приложения:*/

        /**
         *  JavaDeveloper javaDeveloper = new JavaDeveloper();
            QATester tester = new QATester();
            BankingPM projectManager = new BankingPM();

        System.out.println("Banking project is creating...");

            javaDeveloper.writeCode();
            manualTester.testCode();
            projectManager.manageProject();
         **/

        public static void main(String[] args) {
            /*Create object of factory*/
            BankingTeamFactory bankingTeam = new BankingTeamFactory();
            /*Create developers*/
            Developer javaDeveloper = bankingTeam.createDeveloper();
            Tester manualTester = bankingTeam.createManualTester();
            ProjectManager projectManager = bankingTeam.createPM();
            System.out.printf("Banking team is working...%n%n");
            javaDeveloper.writeCode();
            manualTester.testCode();
            projectManager.manageProject();
        }
}
