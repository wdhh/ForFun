package selenium.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.Parameters;
import selenium.Selectors;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class LoginPageObject extends Selectors {

    String inputLoginId = "Email";
    String nextButtonID = "next";
    String inputPasswdId = "Passwd";
    String signInButtonId = "signIn";
    private static String URL = Parameters.getUrl();

    public void navigateToPage () {
        Parameters.getDriver().get(URL);
    }

    public boolean isPageLoad () {
        return id(inputLoginId).isDisplayed();
    }

    public void userNameFieldClear () {
        id(inputLoginId).clear();
    }

    public void inputUserName (String userName) {
        id(inputLoginId).sendKeys(userName);
    }

    public void nextButtonClick () {
        id(nextButtonID).click();
    }

    public void passwordFieldClear () {
        id(inputPasswdId).clear();
    }

    public void inputPassword (String password) {
        id(inputPasswdId).sendKeys(password);
    }

    public MailPageObject signInButtonClick () {
        id(signInButtonId).click();
        return new MailPageObject();
    }

    public void waitForInputPasswordVisible() {
        waitForElementVisible(By.id(inputPasswdId), 30);
    }

    private void waitForElementVisible(By locator, Integer time) {
        WebDriverWait wait = new WebDriverWait(Parameters.getDriver(), time);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}





