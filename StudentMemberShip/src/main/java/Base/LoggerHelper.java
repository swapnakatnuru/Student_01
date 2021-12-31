package Base;

import PageObject.StudentMemberShipPage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoggerHelper {

        //WebDriver driver;
        // log = Logger.getLogger(Class cls);
        // public Logger(WebDriver driver) {
        //    this.driver = driver;
        //   PageFactory.initElements(driver, this);
        //}


        public static Logger getLogger(Class cls) {
            PropertyConfigurator.configure("src/test/resources/Logger/log4j.properties");
            ChromeOptions options = new ChromeOptions();
            options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
            return Logger.getLogger(cls);
        }



        public static void main(String[] args) {

            Logger log = LoggerHelper.getLogger(LoggerHelper.class);
           log.info("hello");



        }
    }

