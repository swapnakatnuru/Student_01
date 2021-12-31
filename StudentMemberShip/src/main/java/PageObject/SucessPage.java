package PageObject;

import Utilities.DriverFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SucessPage {
    WebDriver driver;
    public  SucessPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void title(){
      String str= DriverFactory.driver.getCurrentUrl();
        System.out.println(str);


    }
    }

