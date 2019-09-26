package SerenityCucumber.steps;

import SerenityCucumber.pages.AuthenticationPage;
import net.thucydides.core.annotations.Step;

public class RegistrationOfExistingUserSteps {

    private AuthenticationPage authenticationPage = new AuthenticationPage();

    @Step
    public void openAuthenticationPage(String pageName){
        authenticationPage.open();
        authenticationPage.checkThatAuthenticationPageAppears(pageName);
    }

    @Step
    public void enterExistingEmail(String email){
        authenticationPage.enterEmail(email);
    }

    @Step
    public void pressRegistrationButton() throws InterruptedException {
        authenticationPage.pressCreateAnAccountButton();
    }

    @Step
    public void verifyAllertMessage(String allertText){
        authenticationPage.checkAllertMessage(allertText);
    }
}
