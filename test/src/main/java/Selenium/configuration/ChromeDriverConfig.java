package Selenium.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by IEUser on 12/30/2016.
 */
public class ChromeDriverConfig extends DriverConfig {

    public void init(WebDriver driver){
        driver = new ChromeDriver();
    }
}
