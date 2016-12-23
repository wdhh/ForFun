import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 22.12.2016.
 */
public class Google extends Listeners {


    @Test
    public void googleTest() throws InterruptedException {
         WebDriver driver;
         //driver = new FirefoxDriver(); // Не знаю почему, но Firefox у меня работает в разы быстрее
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.google.ru/");
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         By SearchLine = By.cssSelector("#lst-ib.gsfi");
         By NavigationLine = By.cssSelector("#hdtb-s > div");
         By Video = By.cssSelector("#vidthumb1");
         driver.findElement(SearchLine).click();
         driver.findElement(SearchLine).sendKeys("Google test for Sergey:)");
         driver.findElement(SearchLine).sendKeys(Keys.ENTER);
//            if
//           (driver.findElement(NavigationLine).isDisplayed())
//
//            {
//             System.out.println("Search is successful");
//            }
//            else {
//             System.out.println("Search is fail");
//            }
//
//
//         driver.findElement(By.cssSelector("#hdtb-msb .hdtb-mitem:nth-child(3)")).click();
//         if
//         (driver.findElement(Video).isDisplayed()){
//             System.out.println("Search for videos is successful");
//         }
//         else {
//             System.out.println("Search for videos is fail");
//         }
//         TimeUnit.SECONDS.sleep(2);


        // либо можно написать как ты показывал: потом скажи как правильнее.

        WebElement NavigationPanel = driver.findElement(By.cssSelector("#hdtb-s > div"));
        Assert.assertTrue(NavigationPanel.isDisplayed());
        driver.findElement(By.cssSelector("#hdtb-msb .hdtb-mitem:nth-child(3)")).click();
        WebElement FirstVideo = driver.findElement(By.cssSelector("#vidthumb1"));
        Assert.assertTrue(FirstVideo.isDisplayed());

        if (driver.getWindowHandles().size() > 1) {
            driver.close();
        } else {
            driver.quit();
        }
            driver.quit();
        }



}

