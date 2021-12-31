package Base;

//import PageObject.Logger;
import PageObject.StudentMemberShipPage;
import PageObject.SucessPage;
import Utilities.DriverFactory;
import Utilities.DriverUtilities;
import com.aventstack.extentreports.ExtentReports;

public class BasePage {
    public ExtentReports extent;
   public static StudentMemberShipPage studentMemberShipPage;
    public static SucessPage sucessPage;
    public static DriverUtilities driverUtilities;
 //   public static  Logger  logger;

    public static  void initPages(){
        studentMemberShipPage= new StudentMemberShipPage(DriverFactory.driver);
        sucessPage=new SucessPage(DriverFactory.driver);
        driverUtilities = new DriverUtilities();

       // logger = new Logger(DriverFactory.driver);
    }
}

