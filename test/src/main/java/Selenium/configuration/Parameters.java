package Selenium.configuration;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Parameters {

    private static final String PROP_NAME = "src/test.properties";

    private static String userName;
    private static String userPasswd;
    private static String url;
    private static String browserName;
    private static String gridUrl;
    private static String gridPort;
    private static Boolean useGrid;

    private static WebDriver driver;

    protected Parameters() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(PROP_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.userName = properties.getProperty("userLogin");
        this.userPasswd = properties.getProperty("userPasswd");
        this.url = properties.getProperty("mainUrl");
        this.browserName = properties.getProperty("browserName");
        this.useGrid = properties.getProperty("use.grid").toLowerCase().equals("true");
        this.gridUrl = properties.getProperty("grid.url");
        this.gridPort = properties.getProperty("grid.port");
    }

    public static String getUserName() {
        return userName;
    }

    public static String getUserPasswd() {
        return userPasswd;
    }
     public static String getUrl() {
        return url;
    }
     public static String getBrowserName() {
        return browserName;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setDriver(WebDriver currentDriver) {
        driver = currentDriver;
    }

    public static String getGridUrl(){
        return gridUrl;
    }

    public static String getGridPort(){
        return gridPort;
    }
    public static Boolean useGrid() {
        return useGrid;
    }
}
