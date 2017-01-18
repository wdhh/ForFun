import org.junit.Test;

/**
 * Created by User on 18.01.2017.
 */
public class TestStartClass extends BrowserSettings{

    @Test
    public void Registration(){
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.registrationAtTheSite();
    }

    @Test
    public void logIn(){
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.loginIntoSite();
    }

}
