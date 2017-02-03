package Selenium;

import Selenium.configuration.Parameters;
import Selenium.pageObjects.LoginPageObject;
import Selenium.pageObjects.MailPageObject;
import org.testng.annotations.Test;


public class GmailTest extends Selectors {

    LoginPageObject loginPageObject = new LoginPageObject();
    MailPageObject mailPageObject;

    @Test
    public void sendMailTest() {
        loginPageObject.navigateToPage();

        assertTrue(loginPageObject.isPageToLoad());
        loginPageObject.inputFiledClear();
        loginPageObject.typeUserName(Parameters.getUserName());
        loginPageObject.nextButtonClick();
        loginPageObject.waitForInputPasswdVisible();
        loginPageObject.passwordInputClear();
        loginPageObject.inputPassword(Parameters.getUserPasswd());
        loginPageObject.signInButtonClick();

        mailPageObject = new MailPageObject();

        mailPageObject.waitForComposeButton();
        mailPageObject.composeButtonClick();
    }

    @Test
    public void clearTrashBin(){
        loginPageObject.navigateToPage();
        assertTrue(loginPageObject.isPageToLoad());
        loginPageObject.inputFiledClear();
        loginPageObject.inputPassword(Parameters.getUserPasswd());
        loginPageObject.nextButtonClick();
        loginPageObject.waitForInputPasswdVisible();
        loginPageObject.passwordInputClear();
        loginPageObject.inputPassword(Parameters.getUserPasswd());

    }


}
