package Selenium;

import Selenium.Configuration.DriverConfig;
import Selenium.Configuration.Parameters;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectors extends DriverConfig {
    WebDriver driver;
    public Selectors (){
        super();
        driver = Parameters.getDriver();
    }
    public WebElement id(String selector){
        return driver.findElement(By.id(selector));
    }

    public WebElement name(String selector){
        return driver.findElement(By.name(selector));
    }

    public WebElement cssSelector(String selector){
        return driver.findElement(By.cssSelector(selector));
    }

    public WebElement xpath(String selector){
        return driver.findElement(By.xpath(selector));
    }

    public WebElement className(String selector){
        return driver.findElement(By.className(selector));
    }

    public void waitForElementVisible(By locator, Integer time) {

        WebDriverWait wait = new WebDriverWait(Parameters.getDriver(), time);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
