package be.codekata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class CookieClicker {
    private final WebDriver driver;

    public CookieClicker(WebDriver driver) {
        this.driver = driver;
    }

    public void clickaccept(){
        driver.switchTo().frame("sp_message_iframe_609148");
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/button[1]"));
        iframe.click();
    }
}
