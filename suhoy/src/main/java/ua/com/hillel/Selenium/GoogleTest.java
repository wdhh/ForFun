package ua.com.hillel.Selenium;

import org.apache.wml.WMLEmElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dreasty on 21.12.16.
 */
public class GoogleTest {
    @Test
    public void googleSearch(){
        System.setProperty("webdriver.gecko.driver","/home/dreasty/aqa/ForFun/suhoy/src/main/resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com/?ncr");
        Assert.assertTrue(driver.findElement(By.id("body")).isDisplayed());
        driver.quit();
    }

    @Test
    public void yandexSearch(){
        System.setProperty("webdriver.gecko.driver","/home/dreasty/aqa/ForFun/suhoy/src/main/resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://yandex.ua");
        WebElement inputElement = driver.findElement(By.cssSelector("input[id='text']"));
        Assert.assertTrue(inputElement.isDisplayed());
        inputElement.sendKeys("Selenium"+Keys.ENTER);
//        driver.findElement(By.cssSelector(".search2__button button")).click();

        driver.quit();
    }
}
