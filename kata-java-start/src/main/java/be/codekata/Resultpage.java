package be.codekata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resultpage {
    private final WebDriver driver;

    public Resultpage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTitle() {
        WebElement title = driver.findElement(By.xpath("//*[@id=\"page-main-content\"]/div[2]/div[2]/div/div/div[1]/article/div/header/h1"));
        return title;
    }

    public void clickFirst() {
        WebElement firstLi = driver.findElement(By.xpath("//*[@id=\"page-main-content\"]/div[2]/div/div/div[1]/div/ul/li[1]/article/a/div/div[2]/h2"));
        firstLi.click();
    }

    public WebElement getauthor() {
        WebElement author = driver.findElement(By.xpath("//*[@id=\"page-main-content\"]/div[2]/div[2]/div/div/div[1]/article/div/div[1]/span[1]"));
        return author;
    }
}
