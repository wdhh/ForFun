package selenium;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.Pages.LoginPageObject;
import selenium.Pages.MailPageObject;

import java.util.List;

public class GmailTest extends Selectors{

    LoginPageObject loginPageObject = new LoginPageObject();
    MailPageObject mailPageObject;


    @Test
    public void sendEmailTest() {
        loginPageObject.navigateToPage();
        assertTrue(loginPageObject.isPageLoad());
        loginPageObject.userNameFieldClear();
        loginPageObject.inputUserName(Parameters.getUserName());
        loginPageObject.nextButtonClick();
        loginPageObject.waitForInputPasswordVisible();
        loginPageObject.passwordFieldClear();
        loginPageObject.inputPassword(Parameters.getUserPasswd());
        loginPageObject.signInButtonClick();
        mailPageObject = new MailPageObject();
        mailPageObject.waitForComposeButton();
        mailPageObject.composeButtonClick();
    }

    public void preConfig () {
        //TODO: config org
    }


}








    //TO DO: add waiter
        // id(inputPasswdId).waitForElementVisible(30);
    //id(inputPasswdId).clear();
    //id(inputPasswdId).sendKeys(PASSWORD);
    //id(signInButtonId).waitForElementVisible(30);

       // id(composeButtonId).click();

//    waitForElementVisible(By.cssSelector(".T-I.J-J5-Ji.T-I-KE"),30);
        //cssSelector(".T-I.J-J5-Ji.T-I-KE").waitForElementVisible(30);

        //cssSelector(".T-I.J-J5-Ji.T-I-KE").click();

    //to do: add waiter for leftPanelId element;

















//List result = driver.findElements(By.cssSelector("span.st"));
//assertTrue(checkResult(result, "Selenium"));
//public boolean checkResult(List res, String keyStr){


//for (WebElement currentResult : res) {
//if (!currentResult.getText().contains(keyStr)) {
// return false;





        //}
        //return true;
    //}
//}
