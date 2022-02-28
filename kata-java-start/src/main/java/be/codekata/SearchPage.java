package be.codekata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class SearchPage {
    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicksearch() {
        WebElement searchinput = driver.findElement(By.xpath("/html/body/header/section[3]/div[2]/div[2]/div/form/button"));
        searchinput.click();
    }

    public void inputSearch(String text) {
        WebElement searchinput = driver.findElement(By.xpath("/html/body/header/section[3]/div[2]/div[2]/div/form/input"));
        searchinput.sendKeys(text);
    }

    public void clicksearchbox() {
        WebElement searchbox = driver.findElement(By.xpath("/html/body/header/section[3]/div[1]/div/nav/div[1]/div"));
        searchbox.click();
    }
}
