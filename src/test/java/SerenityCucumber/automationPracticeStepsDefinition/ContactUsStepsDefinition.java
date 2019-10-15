package SerenityCucumber.automationPracticeStepsDefinition;

import SerenityCucumber.automationPracticeSteps.ContactUsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactUsStepsDefinition {

    @Steps
    private ContactUsSteps contactUsSteps;

    @When("user press a Contact us button")
    public void user_press_a_Contact_us_button() {
        contactUsSteps.pressContactButton();
    }

    @When("user choose Subject Handling as '(.*)'")
    public void user_choose_subject_Handling_as(String subject) {
        contactUsSteps.selectSubjectFromDropDown(subject);
    }

    @When("user enter his valid email '(.*)'")
    public void user_enter_his_valid_email(String email) {
        contactUsSteps.enterEmail(email);
    }

    @When("user enter message text '(.*)'")
    public void user_enter_message_text(String contactUsMessageText) {
        contactUsSteps.enterMessageText(contactUsMessageText);
    }

    @When("user press a send button")
    public void user_press_button_Send() {
        contactUsSteps.pressSubmitButton();
    }

    @Then("appears a confirmation message with text '(.*)'")
    public void appears_a_confirmation_message_with_text(String allertMessageText) {
        contactUsSteps.checkAllertMessage(allertMessageText);
    }

}
