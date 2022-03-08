package io.orangebeard.ketentest.steps;

import io.cucumber.java.nl.Gegeven;
import io.orangebeard.ketentest.Browser;
import io.orangebeard.ketentest.pageobjects.HomePage;
import org.springframework.beans.factory.annotation.Autowired;


public class HomepageStep {

    @Autowired
    private Browser browser;

    @Gegeven("ik naar orangebeard ga")
    public void goToOrangebeard() {
        browser.openURL("https://orangebeard.io/","Orangebeard | Intelligent automated testing ");
        HomePage homePage = browser.laadPagina(HomePage.class);
        homePage.setNameInput("testname");
        homePage.setCompagnyInput("testcompagny");
    }
}
