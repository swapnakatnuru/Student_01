package Utilities;

import PageObject.StudentMemberShipPage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.util.Properties;

public class DriverUtilities {
    public static Properties prop;
    WebDriver driver;
    //static Logger log = Logger.getLogger(StudentMemberShipPage.class);

    public void navigatToUrl() {
        prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("src/test/resources/data.properties");
            prop.load(fs);


        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println("url---" + prop.getProperty("url"));
        DriverFactory.driver.navigate().to(prop.getProperty("url"));

    }

    public void getPageTitle() {
        String str = DriverFactory.driver.getTitle();
        System.out.println(str);

    }

    public void pageRefresh() {

        DriverFactory.driver.navigate().refresh();
    }


}

