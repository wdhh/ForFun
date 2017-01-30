package Selenium.P;

import Selenium.Configuration.Parameters;
import Selenium.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObject extends Selectors {

    String inputLoginId = "Email";
    String nextButtonId = "next";
    String inputPasswordId = "Passwd";
    String signInButtonId = "signIn";

    public void navigateToPage(){
        Parameters.getDriver().get(Parameters.getUrl());
    }
    public boolean isPageToLoad(){
        return id(inputLoginId).isDisplayed();
    }

    public void inputFiledClear(){
        id(inputLoginId).clear();
    }

    public void typeUserName(String userName) {
        id(inputLoginId).sendKeys(userName);
    }

    public void nextButtonClick(){
        id(nextButtonId).click();
    }

    public void passwordInputClear(){
        id(inputPasswordId).clear();
    }

   public void inputPassword(String password){
       id(inputPasswordId).sendKeys(password);
   }

   public MailPageObject signInButtonClick() {
       id(signInButtonId).click();
       return new MailPageObject();
   }

   public void waitForInputPasswdVisible() {
       waitForElementVisible(By.id(inputPasswordId), 50);
   }

}
