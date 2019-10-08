package SerenityCucumber.automationPracticeStepsDefinition;

import SerenityCucumber.automationPracticeSteps.RegistrationOfExistingUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisteringExistingUserStepsDefinition {

    @Steps
    RegistrationOfExistingUserSteps registration;

    @Given("the user is on the '(.*)' page")
    public void the_user_is_on_the_authentication_page(String pageName) {
        registration.openAuthenticationPage(pageName);
    }

    @When("he enters his valid email '(.*)'")
    public void he_enters_his_valid_email(String email) {
        registration.enterExistingEmail(email);
    }

    @When("press Create an account button")
    public void press_Create_an_account_button() throws InterruptedException {
        registration.pressRegistrationButton();
    }

    @Then("appears an allert massage with the text '(.*)'")
    public void appears_an_allert_massage_with_the_text(String allertText) {
        registration.verifyAllertMessage(allertText);
    }
}
