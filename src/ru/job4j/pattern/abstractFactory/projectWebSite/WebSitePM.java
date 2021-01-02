package ru.job4j.pattern.abstractFactory.projectWebSite;

import ru.job4j.pattern.abstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web site PM manages site...");
    }
}
