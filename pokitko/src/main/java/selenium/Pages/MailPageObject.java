package selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.Parameters;
import selenium.Selectors;

public class MailPageObject extends Selectors {
    String leftPanelId = ":4u";
    String composeButtonId = ":4s";



    public void composeButtonClick () {
        id(composeButtonId).click();
    }

    public void waitForComposeButton () {
        waitForElementVisible(By.id(composeButtonId), 50);
    }

    private void waitForElementVisible(By locator, Integer time) {
        WebDriverWait wait = new WebDriverWait(Parameters.getDriver(), time);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}




