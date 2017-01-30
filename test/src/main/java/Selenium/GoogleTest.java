package Selenium;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void googleSearchTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Assert.assertTrue(driver.findElement(By.id("body")).isDisplayed());
        driver.quit();
    }

    @Test
    public void yandexSearchTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://yandex.com");
//        Assert.assertTrue();
        WebElement inputElement = driver.findElement(By.cssSelector("input[id='text']"));
        Assert.assertTrue(inputElement.isDisplayed());
        inputElement.sendKeys("Selenium");
        driver.findElement(By.cssSelector(".search2__button button")).click();
        driver.quit();
    }
}
