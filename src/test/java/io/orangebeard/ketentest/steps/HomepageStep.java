package io.orangebeard.ketentest.steps;

import io.cucumber.java.nl.Als;
import io.cucumber.java.nl.Gegeven;
import io.orangebeard.ketentest.Browser;
import io.orangebeard.ketentest.pageobjects.HomePage;
import org.springframework.beans.factory.annotation.Autowired;


public class HomepageStep {

    @Autowired
    private Browser browser;

    @Gegeven("ik naar orangebeard ga")
    public void goToOrangebeard() {
        browser.openURL("http://31.14.96.60/","Praegus Workshop!");
    }

    @Als("ik zoek op: {word}")
    public void searchFor(String searchterm) {
        HomePage homePage = browser.laadPagina(HomePage.class);
        homePage.setSearchfield(searchterm);
        homePage.clickSearchButton();
    }
}
