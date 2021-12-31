Feature: verify the StudentMembership

    Background:
        Given  I navigate to the url
        When   I should  click on cookiebot
        Then   I should navigate to studentMemberShipPage

@regression @smoke
Scenario: verify  MembershipPage
    When   I enter the valid email in email textbox
    And    I select Tilt DropDown
    And    I enter the firstname
    And    I enter surname
    And    I enter the Gender
    And    I enter the Date of birth
    And    I select the ethinicity from Dropdown
    And    I should enter your phone number
    And   I should enter secondary email
    And   I should select overseas student checkbox
    And   I should selec HomeCountry DropDown
    And   I should enter the AddressLine1
    And   I should enter Town or city
    And    I should enter County or Region
    And    I should enter Postcode/Zip code/PO Box
    And    I should select Country
    And    I should select part 1 Institution name
    And    I should select course name
    And    I should enter part1 start date
    And    I should enter part1 completion date
    And    I should select part2  Institution name
    And    I should enter aprt2 course name
    And    I should enter  part2 start date
    And    I should enter part 2 completion date
    And    I should enter password
    And    I should enter retype-password
    And    I should click on I agree checkbox
    And    I should click on Register button
    And    I should navigate to SucessPage


