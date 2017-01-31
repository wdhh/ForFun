package selenium;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class GoogleTest {
    @Test
    public void yandexSearchTest()  {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.yandex.com");
        WebElement inputElement = driver.findElement(By.cssSelector("input[id='text']"));
        assertTrue(inputElement.isDisplayed());
        inputElement.sendKeys("Selenium");
        driver.findElement(By.cssSelector(".search2__button button")).click();
        driver.quit();
    }


    @Test
    public void googleSearchTest()  {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        assertTrue(driver.findElement(By.id("body")).isDisplayed());
        WebElement inputElement = driver.findElement(By.id("gs_htif0"));
        assertTrue(inputElement.isDisplayed());
        inputElement.sendKeys("Selenium");
        driver.findElement(By.name("btnK")).click();
        List result = driver.findElements(By.cssSelector("span.st"));
        checkResult(result, "Selenium");
        driver.quit();
    }
    public void checkResult(List<WebElement> res, String keyStr) {
        for (WebElement currentResult : res) {
            assertTrue(currentResult.getText().contains(keyStr));
        }
    }





}
