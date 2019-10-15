package SerenityCucumber.automationPracticeStepsDefinition;

import SerenityCucumber.automationPracticeSteps.SubscriptionSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SubscriptionStepsDefinition {

    @Steps
    private SubscriptionSteps subscriptionSteps;

    @When("user enters his email '(.*)' in email field")
    public void user_enters_his_email_jekson_gmail_com_in_email_field(String email) {
        subscriptionSteps.enterEmailForSubscribing(email);
    }

    @When("user press submitNewsletter button")
    public void user_press_submitNewsletter_button() {
        subscriptionSteps.pressSubmitEnteringEmailButton();
    }

    @Then("user should see message '(.*)'")
    public void user_should_see_Newsletter_You_have_successfully_subscribed_to_this_newsletter(String messageText) {
        subscriptionSteps.verifyAllertMessage(messageText);
    }

}
