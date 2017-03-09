import org.openqa.selenium.By;

/**
 * Created by User on 18.01.2017.
 */
public class MainPageObject extends Selectors {




        By EnterWindow = By.cssSelector(".cursor>b");
        By RegistrationWindow = By.cssSelector("[data-target=\"#sign-up-form-container\"]");
        By EmailLine = By.cssSelector("[name=\'login\']");
        By PasswordLine = By.cssSelector("[name=\'password\']");
        By registerUserButton = By.cssSelector(".btn.btn-block");
        By LogInButton = By.cssSelector(".btn.btn-block[type=\"submit\"]");



    public void registrationAtTheSite() {

        cssSelector(RegistrationWindow).click();
        cssSelector(EmailLine).click();
        cssSelector(EmailLine).sendKeys(UserMail);
        cssSelector(PasswordLine).click();
        cssSelector(PasswordLine).sendKeys(UserPassword);
        cssSelector(LogInButton).click();

    }


    public void loginIntoSite(){
        cssSelector(EnterWindow).click();
        registrationAtTheSite();
        cssSelector(registerUserButton).click();
    }

}
