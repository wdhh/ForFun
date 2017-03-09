import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 18.01.2017.
 */
public class BrowserSettings  {

    protected WebDriver driver;


    String UserMail = "andreypo1@ukr.net";
    String UserPassword = "somepassword";



    public void setUp(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://avto.pro/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }


        @After
        public void tearDown() {
            driver.quit();
        }
    }







