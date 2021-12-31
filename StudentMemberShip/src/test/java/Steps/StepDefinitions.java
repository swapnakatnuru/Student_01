package Steps;

import Base.BasePage;
import Base.LoggerHelper;
import PageObject.StudentMemberShipPage;
import Utilities.DriverFactory;
import Utilities.DriverUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    @Given("I navigate to the url")
    public void i_navigate_to_the_url() {
        BasePage.driverUtilities.navigatToUrl();
    }

    @When("I should  click on cookiebot")
    public void i_should_click_on_cookiebot() throws InterruptedException {

        BasePage.studentMemberShipPage.clickAcceptCookies();
        //DriverUtilities.getLogger(StudentMemberShipPage.class);
      //  LoggerHelper.getLogger(StudentMemberShipPage.class);



    }


    @Then("I should navigate to studentMemberShipPage")
    public void i_should_navigate_to_student_member_ship_page() {
        //BasePage.driverUtilities.getPageTitle(StudentMemberShipPage.class);
    }

 //  @When("I should  click on cookiebot")
 //   public void i_should_click_on_cookiebot() throws InterruptedException {

   //   BasePage.studentMemberShipPage.clickAcceptCookies();
  //    DriverUtilities.driverlog("Click on Cookies");

 //  }

    @When("I enter the valid email in email textbox")
    public void i_enter_the_valid_email_in_email_textbox() {

        BasePage.studentMemberShipPage.enterEmail();

    }

    @When("I select Tilt DropDown")
    public void i_select_tilt_drop_down() {
        BasePage.studentMemberShipPage.titleDropDwn();
    }

    @When("I enter the firstname")
    public void i_enter_the_firstname() {
        BasePage.studentMemberShipPage.enterfn();
    }

    @When("I enter surname")
    public void i_enter_surname() {
        BasePage.studentMemberShipPage.entersn();
    }

    @When("I enter the Gender")
    public void i_enter_the_gender() {
        BasePage.studentMemberShipPage.selectgender();
    }

    @When("I enter the Date of birth")
    public void i_enter_the_date_of_birth() {
        BasePage.studentMemberShipPage.enterDOB();
    }

    @When("I select the ethinicity from Dropdown")
    public void i_select_the_ethinicity_from_dropdown() {
        BasePage.studentMemberShipPage.selectEnthinicity();

    }

    @When("I should enter your phone number")
    public void i_should_enter_your_phone_number() {
   BasePage.studentMemberShipPage.enterphonenumber();
    }

    @When("I should enter secondary email")
    public void i_should_enter_secondary_email() {
        BasePage.studentMemberShipPage.enterSecondaryEmail();

    }

    @When("I should select overseas student checkbox")
    public void i_should_select_overseas_student_checkbox() throws InterruptedException {
        BasePage.studentMemberShipPage.clickOverseasChckBx();
        //Thread.sleep(1000);

    }
    @When("I should selec HomeCountry DropDown")
    public void i_should_selec_home_country_drop_down() throws InterruptedException {
    BasePage.studentMemberShipPage.selecthomecountryDropDwn();
   // Thread.sleep(30000);
    }

    @When("I should enter the AddressLine1")
    public void i_should_enter_the_address_line1() {


        BasePage.studentMemberShipPage.enterAddressLine1();
    }
    @When("I should enter Town or city")
    public void i_should_enter_town_or_city() {


        BasePage.studentMemberShipPage.enterTown_or_City();

    }
    @When("I should enter County or Region")
    public void i_should_enter_county_or_region() {


        BasePage.studentMemberShipPage.enterCounty_region();
    }
    @When("I should enter Postcode\\/Zip code\\/PO Box")
    public void i_should_enter_postcode_zip_code_po_box() {

    BasePage.studentMemberShipPage.enterPostCode();

    }
    @When("I should select Country")
    public void i_should_select_country() {

        BasePage.studentMemberShipPage.selectCountry();
    }
    @When("I should select part {int} Institution name")
    public void i_should_select_part_institution_name(Integer int1) {
       BasePage.studentMemberShipPage.selectPart1InstitutioName();
    }
    @When("I should select course name")
    public void i_should_select_course_name() {
        BasePage.studentMemberShipPage.selectPart1CourseName();
    }
    @When("I should enter part1 start date")
    public void i_should_enter_part1_start_date() {
       BasePage.studentMemberShipPage.part1StartDate();
    }
    @When("I should enter part1 completion date")
    public void i_should_enter_part1_completion_date() {
        BasePage.studentMemberShipPage.part1CompletionDate();
    }
    @When("I should select part2  Institution name")
    public void i_should_select_part2_institution_name() {
  BasePage.studentMemberShipPage.setPart2Institutionname();
    }
    @When("I should enter aprt2 course name")
    public void i_should_enter_aprt2_course_name() {
       BasePage.studentMemberShipPage.setPart2coursename();
    }
    @When("I should enter  part2 start date")
    public void i_should_enter_part2_start_date() {
       BasePage.studentMemberShipPage.enterpart2StartDate();
    }
    @When("I should enter part {int} completion date")
    public void i_should_enter_part_completion_date(Integer int1) {
       BasePage.studentMemberShipPage.enterpart2CompletionDate();
    }

    @When("I should enter password")
    public void i_should_enter_password() {
        BasePage.studentMemberShipPage.enterPassword();

    }
    @When("I should enter retype-password")
    public void i_should_enter_retype_password() {
       BasePage.studentMemberShipPage.enterRetyppe_password();
    }
    @When("I should click on I agree checkbox")
    public void i_should_click_on_i_agree_checkbox() {
       BasePage.studentMemberShipPage.clickIagree_Checkbox();
    }
    @When("I should click on Register button")
    public void i_should_click_on_register_button() {
      BasePage.studentMemberShipPage.clickRegisterBtn();
      //BasePage.sucessPage.title();
        }
    @When("I should navigate to SucessPage")
    public void i_should_navigate_to_sucess_page() {
        BasePage.sucessPage.title();
       // BasePage.studentMemberShipPage.getPage();
        //BasePage.sucessPage.title();
        //BasePage.driverUtilities.pageRefresh();

       // BasePage.driverUtilities.getPageTitle();
    }


}
