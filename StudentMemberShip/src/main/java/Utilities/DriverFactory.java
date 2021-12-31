package Utilities;

import Base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class DriverFactory {
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver(){
        System.out.println("in driver factory class");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.navigate().refresh();
        BasePage.initPages();
        return driver;
    }
    public static void closeDriver(){
        driver.quit();
    }
}

