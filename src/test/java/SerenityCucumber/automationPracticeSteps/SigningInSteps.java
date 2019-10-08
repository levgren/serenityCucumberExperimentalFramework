package SerenityCucumber.automationPracticeSteps;

import SerenityCucumber.pagesAutomationPractice.AuthenticationPage;
import net.thucydides.core.annotations.Step;

public class SigningInSteps {

    private AuthenticationPage authenticationPage = new AuthenticationPage();

    @Step
    public void enterEmailInSignInSection(String email){
        authenticationPage.enterEmailInSignInInput(email);
    }

    @Step
    public void enterThePassword(String pass){
        authenticationPage.enterPassword(pass);
    }

    @Step
    public void pressSigninButton(){
        authenticationPage.clickOnSignInButton();
    }
}
