package io.orangebeard.ketentest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.How.CLASS_NAME;

public class SearchResultsPage extends Page {

    @FindBy(how = CLASS_NAME, using = "productListingData")
    private List<WebElement> productList;

    public int getAmountOfFoundProducts() {
        return productList.size();
    }
}
