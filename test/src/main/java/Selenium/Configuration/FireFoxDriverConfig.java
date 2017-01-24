package Selenium.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by IEUser on 12/30/2016.
 */
public class FireFoxDriverConfig extends DriverConfig {

    public void init(WebDriver driver){
        driver = new FirefoxDriver();
    }
}
