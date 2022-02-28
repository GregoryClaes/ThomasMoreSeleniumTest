package be.codekata;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestsShouldGoHere {

    private WebDriver driver;

    @BeforeEach
    void setup(){
        setDrivers();
        driver = new ChromeDriver();
        openHln(driver);
    }
    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    public void keyword() throws InterruptedException {

        SearchPage searchpage = new SearchPage(driver);
        Resultpage resultpage = new Resultpage(driver);
        CookieClicker cookieClicker = new CookieClicker(driver);

        cookieClicker.clickaccept();
        TimeUnit.SECONDS.sleep(1);
        searchpage.clicksearchbox();
        TimeUnit.MILLISECONDS.sleep(50);
        searchpage.inputSearch("krc genk");
        TimeUnit.MILLISECONDS.sleep(50);
        searchpage.clicksearch();
        TimeUnit.MILLISECONDS.sleep(50);
        resultpage.clickFirst();
        TimeUnit.MILLISECONDS.sleep(50);
        String firstresult = resultpage.getTitle().getText();
        TimeUnit.MILLISECONDS.sleep(50);
        assertThat(firstresult,
                    equalTo("Gwyneth Vanaenrode en KRC Genk Ladies pakken punt" +
                            " tegen Standard en spelen PO1: “We speelden een schitterende terugronde”"));
    }

    @Test
    public void author() throws InterruptedException {

        SearchPage searchpage = new SearchPage(driver);
        Resultpage resultpage = new Resultpage(driver);
        CookieClicker cookieClicker = new CookieClicker(driver);

        cookieClicker.clickaccept();
        TimeUnit.SECONDS.sleep(1);
        searchpage.clicksearchbox();
        TimeUnit.MILLISECONDS.sleep(50);
        searchpage.inputSearch("Lucien Claessens");
        TimeUnit.MILLISECONDS.sleep(50);
        searchpage.clicksearch();
        TimeUnit.MILLISECONDS.sleep(50);
        resultpage.clickFirst();
        TimeUnit.MILLISECONDS.sleep(50);
        String firstresult = resultpage.getauthor().getText();
        TimeUnit.MILLISECONDS.sleep(50);
        assertThat(firstresult,
                equalTo("Lucien Claessens"));
    }
    @Test
    public void title() throws InterruptedException {

        SearchPage searchpage = new SearchPage(driver);
        Resultpage resultpage = new Resultpage(driver);
        CookieClicker cookieClicker = new CookieClicker(driver);

        cookieClicker.clickaccept();
        TimeUnit.SECONDS.sleep(1);
        searchpage.clicksearchbox();
        TimeUnit.MILLISECONDS.sleep(50);
        searchpage.inputSearch("Gwyneth Vanaenrode en KRC Genk Ladies pakken punt tegen Standard en spelen PO1: “We speelden een schitterende terugronde”");
        TimeUnit.MILLISECONDS.sleep(50);
        searchpage.clicksearch();
        TimeUnit.MILLISECONDS.sleep(50);
        resultpage.clickFirst();
        TimeUnit.MILLISECONDS.sleep(50);
        String firstresult = resultpage.getTitle().getText();
        TimeUnit.MILLISECONDS.sleep(50);
        assertThat(firstresult,
                equalTo("Gwyneth Vanaenrode en KRC Genk Ladies pakken punt tegen Standard en spelen PO1: “We speelden een schitterende terugronde”"));
    }

    private void openHln(WebDriver driver) {
        driver.get("https://www.hln.be/");
    }

    private void setDrivers() {
        System.setProperty("webdriver.chrome.driver", "E:\\git\\Kata-FizzBuzz-Starter\\chromedriver.exe");
    }
}
