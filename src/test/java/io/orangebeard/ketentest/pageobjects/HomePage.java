package io.orangebeard.ketentest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.CSS;

public class HomePage extends Page {

    @FindBy(how = CSS, using = "input[name='keywords']")
    private WebElement searchfield;

    @FindBy(how = CSS, using = "input[title=' Quick Find ']")
    private WebElement searchButton;

    public void setSearchfield(String username) {
        searchfield.sendKeys(username);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
