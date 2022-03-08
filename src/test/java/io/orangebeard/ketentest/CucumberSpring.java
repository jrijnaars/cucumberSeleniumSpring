package io.orangebeard.ketentest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment= WebEnvironment.RANDOM_PORT)
public class CucumberSpring {

    @Autowired
    private Browser browser;

    @Before
    public void setup() {
        browser.startBrowser();
    }

    @After
    public void teardown() {
        browser.afsluitenBrowser();
    }

}
