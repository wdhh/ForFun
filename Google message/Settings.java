import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 26.12.2016.
 */
public class Settings {


            public WebDriver driver;
            protected String GoogleLogin = "skorpiongk231";
            protected String GooglePassword = "ad4b4e7877";
            protected String Whom = "skorpiongk230@gmail.com";
            protected String ThemeText = "Новая тема";
            protected String LetterText = "Успешный тест";



    By EnterButton = By.cssSelector("#gb_70");
    By EmailField = By.cssSelector("#Email");
    By NextButton = By.cssSelector("#next");
    By PasswordField = By.cssSelector("#Passwd");
    By GoogleMenu = By.cssSelector("#gbwa div a");
    By MailImage = By.cssSelector("#gb23");
    By WriteButton = By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3");
    // By PoPup = By.cssSelector(".AD");
    By ReceuvePerson = By.cssSelector(".GS");
    By Theme = By.cssSelector( ".aoT" );
    By Letter = By.cssSelector( ".GQ" );
    By SendButton = By.cssSelector( ".Up .J-J5-Ji .L3" );



        @Before
        public void setUp(){
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.ru/");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        }

        @After
        public void tearDown() {
            driver.quit();

        }
}
