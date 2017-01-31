package selenium.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryObject {
    @FindBy(id = "login")
    public WebElement loginInput;

    @FindBy (css = ".password")
    public WebElement passwordInput;

    public PageFactoryObject () {
        PageFactory.initElements(new ChromeDriver(), this);
    }

    public void userNameFieldClear () {
        loginInput.clear();
    }

}
