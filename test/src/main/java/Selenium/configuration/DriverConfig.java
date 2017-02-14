package Selenium.configuration;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverConfig extends Assert {

    static Parameters parameters = new Parameters();
    WebDriver driverRemote;
    EventFiringWebDriver driver;
    DesiredCapabilities capabilities;


     @BeforeMethod(alwaysRun = true)
    public void startDriver() throws MalformedURLException {
        String gridUrl = String.format("http://%s:%s/wd/hub", Parameters.getGridUrl(), Parameters.getGridPort());

       if (Parameters.useGrid()){
           if (Parameters.getBrowserName().toLowerCase().equals("chrome")) {
               capabilities = DesiredCapabilities.chrome();
           }
           if (Parameters.getBrowserName().toLowerCase().equals("firefox")) {
               capabilities = DesiredCapabilities.firefox();

           }

           driverRemote = new RemoteWebDriver(new URL(gridUrl), capabilities );
            parameters.setDriver(driverRemote);
       } else{

            if (driver == null) {
                if (Parameters.getBrowserName().toLowerCase().equals("chrome")) {
                    driver = new EventFiringWebDriver(new ChromeDriver());
                }

                if (Parameters.getBrowserName().toLowerCase().equals("firefox")) {
                    driver = new EventFiringWebDriver(new FirefoxDriver());
                }
                driver.register(new WebDriverLogger());
                parameters.setDriver(driver);
                parameters.getDriver().manage().window().maximize();
           }
       }
    }

    @AfterMethod(alwaysRun = true)
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("testResult\\screenShot\\"+ Parameters.getBrowserName() + " - " + testResult.getTestClass().getRealClass().getSimpleName() + "." + testResult.getMethod().getMethodName() +".jpg"));
        }
        if (testResult.isSuccess()) {
            System.out.println("================================================================================");
            System.out.println(testResult.getTestClass().getRealClass().getSimpleName() + "." + testResult.getMethod().getMethodName() + " test PASSED!");
            System.out.println("================================================================================");
        } else {
            System.out.println("================================================================================");
            System.out.println(testResult.getTestClass().getRealClass().getSimpleName() + "." + testResult.getMethod().getMethodName() + " test FAILED!");
            System.out.println("================================================================================");

        }

    }

   @AfterClass()
    public static void stopDriver(){

    }

}
