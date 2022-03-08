package io.orangebeard.ketentest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.CSS;

public class HomePage extends Page {

    @FindBy(how = CSS, using = "input[data-original_id='name']")
    private WebElement nameInput;

    @FindBy(how = CSS, using = "input[data-original_id='company']")
    private WebElement compagnyInput;

    @FindBy(how = CSS, using = "button[type='submit']")
    private WebElement callmeButton;

    public void setNameInput(String username) {
        nameInput.sendKeys(username);
    }

    public void setCompagnyInput(String password) {
        compagnyInput.sendKeys(password);
    }

    public void clickCallmeButton() {
        callmeButton.click();
    }
}
