package io.orangebeard.ketentest;

import io.orangebeard.ketentest.pageobjects.Page;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
public class Browser {

    private WebDriver driver;

    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        ChromeOptions options = new ChromeOptions();
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        driver = new ChromeDriver(options);

        driver.manage()
              .timeouts()
              .implicitlyWait(10, TimeUnit.SECONDS);
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage()
              .window()
              .setSize(dimension);
    }

    public void afsluitenBrowser() {
        driver.quit();
    }

    public void openURL(String url, String paginaTitel) {
        driver.get(url);
        waitForPageTitle(paginaTitel);
        assertThat(driver.getTitle()).isEqualTo(paginaTitel);
    }

    public <E extends Page> E laadPagina(Class<E> pageClass) {
        return PageFactory.initElements(driver, pageClass);
    }

    public void waitForPageTitle(String title) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs(title));
    }
}
