package SerenityCucumber.stepsDefinition;

import SerenityCucumber.steps.SigningInSteps;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SigningInStepsDefinition {

    @Steps
    SigningInSteps signingInSteps;

    @When("user enters valid email '(.*)'")
    public void user_enters_valid_email_jekson_gmail_com(String email) {
        signingInSteps.enterEmailInSignInSection(email);
    }

    @When("user enters valid password '(.*)'")
    public void user_enters_valid_password_ACE(String password) {
        signingInSteps.enterThePassword(password);
    }

    @When("press sign in button")
    public void press_sign_in_button() {
        signingInSteps.pressSigninButton();
    }
}
