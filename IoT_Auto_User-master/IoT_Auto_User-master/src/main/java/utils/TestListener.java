package utils;

/**
 * Created by User on 26.01.2017.
 */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TestListener implements ITestListener {

    private String params;

    private File captureScreenshot(WebDriver driver) {
        File file = null;
        try {
            file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            screenshotToAllure(file);
        }catch (WebDriverException e){
            e.printStackTrace();
        }
        return file;
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] screenshotToAllure(File screen) {
        byte[] screenShot = new byte[0];
        try {
            screenShot = Files.readAllBytes(screen.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screenShot;
    }


    @Override
    public void onTestStart(ITestResult iTestResult) {

        System.out.println("============TEST STARTED============");


    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("============TEST SUCCESS============");
        String pathSucceed = "target/screenshots/"+params+"/success/" + tr.getMethod().getMethodName() + ".png";

        File screen = captureScreenshot(WebDriverManager.getDriver());
        try {
            FileUtils.copyFile(screen, new File(pathSucceed));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Screesnshot captured for test case:" + tr.getMethod().getMethodName());
    }


    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println("============TEST FAILED============");
        String pathFailed = "target/screenshots/"+params+"/failed/" + tr.getMethod().getMethodName() + ".png";

        File screen = captureScreenshot(WebDriverManager.getDriver());
        try {
            FileUtils.copyFile(screen, new File(pathFailed));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Screesnshot captured for test case:" + tr.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("============TEST SKIPPED============");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("======TEST FAILED BUT WITHIN SUCCESS PERCENTAGE========");

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("============STARTING TESTING============");
        String browserName = iTestContext.getCurrentXmlTest().getParameter("browserName");
        String useGrid = iTestContext.getCurrentXmlTest().getParameter("useGrid");
        Boolean boo = useGrid.contentEquals("true");

        WebDriver driver = WebDriverFactory.createInstance(browserName, boo);
        WebDriverManager.setWebDriver(driver);


        Utils util = new Utils();
        String currentDate = util.getTime();

        params = currentDate +"-"+browserName+"-grid-"+useGrid;
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("==========FINISHING TESTING============");
        WebDriver driver = WebDriverManager.getDriver();
        WaitsAsserts waits = new WaitsAsserts();
        waits.sleep(5000);
        if (driver != null) {
            driver.quit();
        }

    }
}