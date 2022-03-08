package io.orangebeard.ketentest.steps;

import io.cucumber.java.nl.Dan;
import io.orangebeard.ketentest.Browser;
import io.orangebeard.ketentest.pageobjects.SearchResultsPage;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;


public class SearchpageResultsStep {

    @Autowired
    private Browser browser;

    @Dan("moet ik {int} producten in de lijst zien")
    public void checkAmountOfProducts(int expectedAmount) {
        SearchResultsPage searchResultsPage = browser.laadPagina(SearchResultsPage.class);
        Assertions.assertThat(searchResultsPage.getAmountOfFoundProducts()).isEqualTo(expectedAmount);
    }
}
