package SerenityCucumber.automationPracticeStepsDefinition;

import SerenityCucumber.automationPracticeSteps.OpeningRegistrationPageSteps;
import SerenityCucumber.automationPracticeSteps.RegistrtionSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterTheNewUserStepDefinition {

    @Steps
    OpeningRegistrationPageSteps endUser;

    @Steps
    RegistrtionSteps endUsersSteps;

    @Given("the user is on the automationpractice page")
    public void the_user_is_on_the_automationpractice_page() {
        endUser.openMainSitePage();
    }

    @When("he clicks Sign in button")
    public void he_clicks_Sign_in_button() {
        endUser.clickOnSignIn();
    }

    @Then("appears page '(.*)'")
    public void appears_page_authentication(String pageName) {
        endUser.verifyUrl(pageName);
    }

    @When("the user enters '(.*)'")
    public void the_user_enters_jeka_gmail_com_in_the_Email_address_input(String email) {
        endUser.enterTheEmail(email);
    }

    @When("press 'Create an account' button")
    public void press_Create_an_account_button() throws InterruptedException {
        endUser.pressCreateAccountButton();
    }

    @Then("the registration form opens on the page '(.*)'")
    public void the_page_with_registration_form_opens(String pageTitleText) {
        endUser.verifyPresenceOfRegistrationForm(pageTitleText);
    }

    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page(){
        endUsersSteps.verifyPresenceOfPage();
    }

    @When("he enters a valid first name '(.*)'")
    public void he_enters_a_valid_first_name(String firstName) {
        endUsersSteps.enterFirstName(firstName);
    }

    @When("enters a valid last name '(.*)'")
    public void enters_a_valid_last_name(String surname) {
        endUsersSteps.enterSurname(surname);
    }

    @When("enters a valid email '(.*)'")
    public void enters_a_valid_email(String email) {
        endUsersSteps.enterEmail(email);
    }

    @When("enters a password '(.*)'")
    public void enters_a_password(String pass) {
        endUsersSteps.enterPassword(pass);
    }

    @When("enters in the address section a name '(.*)'")
    public void enters_in_the_address_section_a_name(String usersName) {
        endUsersSteps.enterUsersName(usersName);
    }

    @When("enters in the address section a surname '(.*)'")
    public void enters_in_the_address_section_a_surname(String surname) {
        endUsersSteps.enterUserSurname(surname);
    }

    @When("enters in the address section an address '(.*)'")
    public void enters_in_the_address_section_an_address(String address) {
        endUsersSteps.enterAddress(address);
    }

    @When("enters in the address section a city '(.*)'")
    public void enters_in_the_address_section_a_city(String city) {
        endUsersSteps.enterCity(city);
    }

    @When("chose from the dropdown a country '(.*)'")
    public void chose_from_the_dropdown_a_country(String country)  {
        endUsersSteps.selectTheCountry(country);
    }

    @When("chose from the dropdown a state '(.*)'")
    public void chose_from_the_dropdown_a_state(String state) {
        endUsersSteps.selectTheState(state);
    }

    @When("enters postal code '(.*)'")
    public void enters_postal_code(String postalCode){
        endUsersSteps.enterThePostalCode(postalCode);
    }

    @When("enters mobile phone '(.*)'")
    public void enters_mobile_phone(String phone) {
        endUsersSteps.enterTheMobilePhone(phone);
    }

    @When("enters alias address '(.*)'")
    public void enters_alias_address_address(String aliasAddress) {
        endUsersSteps.enterAliasAddress(aliasAddress);
    }

    @When("press Register button")
    public void press_Registration_button(){
        endUsersSteps.pressRegisterButton();
    }

    @Then("opens a '(.*)' page")
    public void opens_a_page(String pageName){
        endUsersSteps.verifyPageUrl(pageName);
    }
}