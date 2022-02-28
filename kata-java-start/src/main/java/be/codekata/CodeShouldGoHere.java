package be.codekata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class HelloSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\git\\Kata-FizzBuzz-Starter");
        driver.get("https://selenium.dev");

        driver.quit();
    }
}