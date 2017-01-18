import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by User on 18.01.2017.
 */
public class Selectors extends BrowserSettings {

     WebDriver driver;

    public Selectors (WebDriver driver){
        this.driver = driver;
    }

    public Selectors() {

    }

    private WebElement id(By selector){
        return driver.findElement(By.id(String.valueOf(selector)));
    }
    public WebElement name(String selector){
        return driver.findElement(By.name(selector));
    }
    public WebElement xpath(String selector){
        return driver.findElement(By.xpath(selector));
    }
    public WebElement className(String selector){
        return driver.findElement(By.className(selector));
    }
    public WebElement cssSelector(By selector){
        return driver.findElement(By.cssSelector(String.valueOf(selector)));
    }

}
