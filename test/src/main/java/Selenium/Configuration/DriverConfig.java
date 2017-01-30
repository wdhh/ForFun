package Selenium.Configuration;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;


public class DriverConfig extends Assert {



    static Parameters parameters = new Parameters();
//    static WebDriver driver;
     static EventFiringWebDriver driver;

     @BeforeMethod(alwaysRun = true)
    public static void startDriver() {

       if (driver == null) {
            if (Parameters.getBrowserName().toLowerCase().equals("chrome")) {
//                driver =new ChromeDriver();
            }
            if (Parameters.getBrowserName().toLowerCase().equals("firefox")) {
//                driver = new FirefoxDriver();
                driver = new EventFiringWebDriver(new FirefoxDriver());
                driver.register(new WebDriverLogger());
            }
            parameters.setDriver(driver);
            parameters.getDriver().manage().window().maximize();
       }
    }


    @AfterMethod()
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
            parameters.getDriver().quit();
    }

}
