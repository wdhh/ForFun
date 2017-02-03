package Selenium.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

public class WebDriverLogger extends AbstractWebDriverEventListener {

    private static final Logger log = LogManager.getLogger(WebDriverLogger.class);
//
    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {

        log.debug("DEBUG");
        log.info("=============================");
        System.out.println("Going to click on element = [" + element.getAttribute("id") + "]");
        log.info("=============================");
    }
}
