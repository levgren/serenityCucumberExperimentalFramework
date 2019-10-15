package SerenityCucumber.automationPracticeStepsDefinition;

import SerenityCucumber.automationPracticeSteps.SigningInSteps;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SigningInStepsDefinition {

    @Steps
    private SigningInSteps signingInSteps;

    @When("user enters valid email (.*)")
    public void user_enters_valid_email(String email) {
        signingInSteps.enterEmailInSignInSection(email);
    }

    @When("user enters valid password (.*)")
    public void user_enters_valid_password(String password) {
        signingInSteps.enterThePassword(password);
    }

    @When("press sign in button")
    public void press_sign_in_button() {
        signingInSteps.pressSigninButton();
    }
}
