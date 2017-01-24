package Selenium.Configuration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfig extends Assert {

    @BeforeClass
    public static void startDriver() {
        new Parameters();
        if (Parameters.getBrowserName().toLowerCase().equals("chrome")) {
            Parameters.setDriver(new ChromeDriver());
        }
        if (Parameters.getBrowserName().toLowerCase().equals("firefox")) {
            Parameters.setDriver(new FirefoxDriver());
        }

        Parameters.getDriver().manage().window().maximize();
    }

    @AfterClass
    public static void stopDriver(){
        Parameters.getDriver().quit();
    }
}
