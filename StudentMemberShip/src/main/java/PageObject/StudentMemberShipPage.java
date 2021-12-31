package PageObject;

import Base.BasePage;
import Base.LoggerHelper;
import Utilities.DriverFactory;
import Utilities.DriverUtilities;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.log4j.Logger;

public class StudentMemberShipPage {
    static Logger log = Logger.getLogger(StudentMemberShipPage.class);
    WebDriver driver;
    //  Properties prop;
    //public  String MainWindow;
    // public String MainWindow;

    public StudentMemberShipPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#Email")
    public WebElement email;
    @FindBy(xpath = "//button[contains(text(),'Allow all cookies')]")
    public WebElement allowallcokkies;
    @FindBy(css = "a#CybotCookiebotDialogNavDetails")
    public WebElement details;
    @FindBy(css="select#Title")
    public WebElement title;
    @FindBy(css="input#FirstName")
    public WebElement fname;
    @FindBy(css="input#Surname")
    public WebElement sname;
  @FindBy(css="select#Gender")
  public WebElement gender;
  @FindBy(css="input#DOB")
  public WebElement dob;
  @FindBy(css="select#Ethnicity")
  public WebElement ethinicity;
  @FindBy(css="input#PhoneNumber")
 public WebElement yourphonenumber;
  @FindBy(css="input#SecondaryEmail")
  public  WebElement secondaryem;
  @FindBy(css="div.radio-button__label")
  public WebElement overseasChkbox;
  @FindBy(css="select#InternationalCountry")
  public WebElement homecountrydropdown;
  @FindBy(xpath="//input[@name='AddressLine1']")
  public WebElement addressLine1;
  @FindBy(css="input#TownOrCity")
  public WebElement townorcity;
  @FindBy(css="input#County")
  public WebElement county_or_region;
  @FindBy(css="input#Postcode")
  public  WebElement postcode;
  @FindBy(css="select#Country")
  public WebElement selectcountry;
  @FindBy(css="select#PartOneInstitutionName")
  public WebElement part1Institutionname;
  @FindBy(css="select#PartOneCourseName")
  public WebElement part1Coursename;
 @FindBy(css="input#PartOneStartDate")
 public WebElement part1startdate;
@FindBy(css="input#PartOneCompletionDate")
public  WebElement part1Completiondate;
@FindBy(css="select#PartTwoInstitutionName")
public  WebElement part2Institutionname;
@FindBy(css="select#PartTwoCourseName")
public WebElement part2coursename;
@FindBy(css="input#PartTwoStartDate")
public  WebElement part2startdate;
@FindBy(css="input#PartTwoCompletionDate")
public WebElement part2completiondate;
@FindBy(css="input#Password")
public WebElement password;
@FindBy(css="input#ConfirmPassword")
public WebElement confirmpassword;
@FindBy(css="p.checkbox__text")
public  WebElement iagreechckbox;
@FindBy(css="input#RegisterButton")
public  WebElement registerbtn;




    public void clickConsent() {
        Actions ack = new Actions(driver);
        ack.moveToElement(details).build().perform();
        details.click();
    }

    public void clickAcceptCookies() throws InterruptedException {

        Thread.sleep(3000);
        // driver.navigate().refresh();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", allowallcokkies);
        LoggerHelper.getLogger(StudentMemberShipPage.class);
        log.info("cookie consent");

     //   Logger log = Logger.getLogger(StudentMemberShipPage.class);



    }
         public void enterEmail(){
        email.sendKeys(DriverUtilities.prop.getProperty("email"));
        log.info("email sucessfully entered");
    }
        public void titleDropDwn(){
        Select s1=new Select(title);
        s1.selectByValue(DriverUtilities.prop.getProperty("title"));
        log.info("title entered sucessfully");
    }
    public void enterfn(){
        fname.sendKeys(DriverUtilities.prop.getProperty("FirstName"));
    }
    public void entersn(){
        sname.sendKeys(DriverUtilities.prop.getProperty("Surname"));

    }
    public void selectgender(){
        Select g1 = new Select(gender);
        g1.selectByValue(DriverUtilities.prop.getProperty("Gender"));
    }
    public void enterDOB(){
        dob.sendKeys(DriverUtilities.prop.getProperty("DOB"));

    }
    public void selectEnthinicity(){
        Select e1 = new Select(ethinicity);
        e1.selectByVisibleText(DriverUtilities.prop.getProperty("Ethenicity"));
    }
    public void enterphonenumber(){
        yourphonenumber.sendKeys(DriverUtilities.prop.getProperty("phonenumber"));
    }
    public void enterSecondaryEmail(){
        secondaryem.sendKeys(DriverUtilities.prop.getProperty("SecondaryEmail"));

    }
    public void clickOverseasChckBx(){
        overseasChkbox.click();

    }
    public void selecthomecountryDropDwn(){
        Select i1= new Select(homecountrydropdown);
        i1.selectByValue(DriverUtilities.prop.getProperty("HomeCountry"));

    }
    public void enterAddressLine1(){
        addressLine1.sendKeys(DriverUtilities.prop.getProperty("AddressLine1"));
    }
    public  void enterTown_or_City(){
        townorcity.sendKeys(DriverUtilities.prop.getProperty("Town_or_city"));
    }
    public void enterCounty_region(){
        county_or_region.sendKeys(DriverUtilities.prop.getProperty("County_or_region"));
    }
    public void enterPostCode(){
        postcode.sendKeys(DriverUtilities.prop.getProperty("PostCode"));
    }
    public void selectCountry(){
        Select c1= new Select(selectcountry);
         c1.selectByValue(DriverUtilities.prop.getProperty("Country"));
    }
    public void selectPart1InstitutioName(){
        Select s1=new Select(part1Institutionname);
        s1.selectByValue(DriverUtilities.prop.getProperty("Part1_Instituion_Name"));
    }
    public void selectPart1CourseName(){
        Select s1= new Select(part1Coursename);
        s1.selectByValue(DriverUtilities.prop.getProperty("part1_CourseName"));
    }
    public void part1StartDate(){
        part1startdate.sendKeys(DriverUtilities.prop.getProperty("part1_StartDate"));
    }
    public void part1CompletionDate(){
        part1Completiondate.sendKeys(DriverUtilities.prop.getProperty("part1_completiondate"));
    }
    public void setPart2Institutionname(){
        Select s1= new Select(part2Institutionname);
        s1.selectByValue(DriverUtilities.prop.getProperty("part2_InstitutionName"));
    }
    public  void setPart2coursename(){
        Select s2=new Select(part2coursename);
        s2.selectByValue(DriverUtilities.prop.getProperty("part2_Coursename"));
    }
    public void enterpart2StartDate(){
        part2startdate.sendKeys(DriverUtilities.prop.getProperty("part2_StartDate"));
    }
    public void enterpart2CompletionDate(){
        part2completiondate.sendKeys(DriverUtilities.prop.getProperty("part2_CompletionDate"));
    }
    public  void enterPassword(){
        password.sendKeys(DriverUtilities.prop.getProperty("password"));

    }
    public void  enterRetyppe_password(){
        confirmpassword.sendKeys(DriverUtilities.prop.getProperty("retype-password"));
    }
    public void clickIagree_Checkbox(){
        iagreechckbox.click();
    }
    public void clickRegisterBtn(){
        registerbtn.click();


    }
    public void getPage(){
        String   expected="https://uat-register.architecture.com/Students/Success";
        String actual =  DriverFactory.driver.getCurrentUrl();
        System.out.println(actual);
        Assertions.assertEquals(actual,expected);
    }

   // public static void main(String[] args)
   // {
        //Logger log = Logger.getLogger(StudentMemberShipPage.class);
    //}
}





