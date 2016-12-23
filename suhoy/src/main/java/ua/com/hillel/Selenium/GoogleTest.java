package ua.com.hillel.Selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by dreasty on 21.12.16.
 */

public class GoogleTest {
    @Test
    public void googleSearchGeckoDriverFirefox(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com.ua/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.id("body")).isDisplayed());
        driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("test"+Keys.ENTER);
//        List<WebElement> result1 = driver.findElements(By.xpath("//div[@class=\"_NId\"]/div[@class=\"srg\"]/div/div/h3/a"));
        List<WebElement> result = driver.findElements(By.cssSelector("div#ires .g .r a"));
        Assert.assertEquals(10, result.size());
        for ( WebElement we: result) {
            System.out.println(we.getAttribute("href"));
            System.out.println(we.getText());
            Assert.assertTrue(we.getAttribute("href").contains("Test") | we.getAttribute("href").contains("test")| we.getText().contains("Test"));
        }
        driver.quit();
    }

    @Test
    public void googleSearchChromeDriver(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/chromedriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com.ua/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.id("body")).isDisplayed());
        driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("test"+Keys.ENTER);
//        List<WebElement> result1 = driver.findElements(By.xpath("//div[@class=\"_NId\"]/div[@class=\"srg\"]/div/div/h3/a"));
        List<WebElement> result = driver.findElements(By.cssSelector("div#ires .g .r a"));
        Assert.assertEquals(10, result.size());
        for ( WebElement we: result) {
            System.out.println(we.getAttribute("href"));
            System.out.println(we.getText());
            Assert.assertTrue(we.getAttribute("href").contains("Test") | we.getAttribute("href").contains("test")| we.getText().contains("Test"));
        }
        driver.quit();
    }
    @Test
    public void yandexSearchGeckoDriverFirefox(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://yandex.ua/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.cssSelector("form.search2")).isDisplayed());
        driver.findElement(By.cssSelector("input#text")).sendKeys("test"+Keys.ENTER);
//        List<WebElement> result1 = driver.findElements(By.xpath("//div[@class=\"_NId\"]/div[@class=\"srg\"]/div/div/h3/a"));
        List<WebElement> result = driver.findElements(By.cssSelector("div.organic a.organic__url"));
        Assert.assertEquals(10,result.size());
        for ( WebElement we: result) {
            System.out.println(we.getAttribute("href"));
            System.out.println(we.getText());
            Assert.assertTrue(we.getAttribute("href").contains("Test") | we.getAttribute("href").contains("test")| we.getText().contains("Test")| we.getText().contains("Тест"));
        }
        driver.quit();
    }

    @Test
    public void yandexSearchChromeDriver(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/chromedriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://yandex.ua/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.cssSelector("form.search2")).isDisplayed());
        driver.findElement(By.cssSelector("input#text")).sendKeys("test"+Keys.ENTER);
//        List<WebElement> result1 = driver.findElements(By.xpath("//div[@class=\"_NId\"]/div[@class=\"srg\"]/div/div/h3/a"));
        List<WebElement> result = driver.findElements(By.cssSelector("div.organic a.organic__url"));
        Assert.assertEquals(10,result.size());
        for ( WebElement we: result) {
            System.out.println(we.getAttribute("href"));
            System.out.println(we.getText());
            Assert.assertTrue(we.getAttribute("href").contains("Test") | we.getAttribute("href").contains("test")| we.getText().contains("Test")| we.getText().contains("Тест"));
        }
        driver.quit();
    }

}
