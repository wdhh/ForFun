package Selenium.pageObjects;

import Selenium.Selectors;
import org.openqa.selenium.By;

public class MailPageObject extends Selectors{
    String composeButtonId = ":4s";



    public void composeButtonClick(){
        id(composeButtonId).click();
    }

    public void waitForComposeButton() {
        waitForElementVisible(By.id(composeButtonId),50);
    }

}
