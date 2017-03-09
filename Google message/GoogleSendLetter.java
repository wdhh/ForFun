import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


/**
 * Created by User on 26.12.2016.
 */
public class GoogleSendLetter extends Settings {



    @Test
    public void main() throws InterruptedException {

        driver.findElement(EnterButton).click();
        driver.findElement(EmailField).click();
        driver.findElement(EmailField).clear();
        driver.findElement(EmailField).sendKeys(GoogleLogin);
        driver.findElement(NextButton).sendKeys(Keys.ENTER);
        driver.findElement(PasswordField).sendKeys(GooglePassword);
        driver.findElement(PasswordField).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep( 2 );
        driver.findElement( GoogleMenu ).click();

        WebElement MenuGoogle = (WebElement) driver.findElements( By.cssSelector( "#gbwa .gb_ja.gb_ca" ) );
        Assert.assertTrue(MenuGoogle.isDisplayed());
        driver.findElement( MailImage ).click();

        WebElement Write = driver.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3"));
        Assert.assertTrue(Write.isDisplayed());
        driver.findElement(WriteButton).click();

        WebElement NewMessage = driver.findElement(By.cssSelector(".AD"));
        Assert.assertTrue(NewMessage.isDisplayed());
        NewMessage.findElement(ReceuvePerson).click();
        NewMessage.findElement(ReceuvePerson).sendKeys(Whom);
        NewMessage.findElement(Theme).click();
        NewMessage.findElement(Theme).sendKeys( ThemeText );
        NewMessage.findElement(Letter).click();
        NewMessage.findElement(Letter).sendKeys(LetterText) ;
        NewMessage.findElement(SendButton).click();
        WebElement LetterSend = driver.findElement(By.cssSelector(".vh"));
        Assert.assertTrue(LetterSend.isDisplayed());
        }
}





