package SerenityCucumber.automationPracticeSteps;


import SerenityCucumber.pagesAutomationPractice.AuthenticationPage;
import SerenityCucumber.pagesAutomationPractice.CreateAnAccountPage;
import SerenityCucumber.pagesAutomationPractice.MainPage;
import net.thucydides.core.annotations.Step;

public class OpeningRegistrationPageSteps {

    private MainPage mainPage = new MainPage();
    private AuthenticationPage authenticationPage = new AuthenticationPage();
    private CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();

    @Step
    public void openMainSitePage(){
        mainPage.open();
    }

    @Step
    public void clickOnSignIn(){
        mainPage.clickSignInButton();
    }

    @Step
    public void verifyUrl(String pageName) {
        authenticationPage.checkThatAuthenticationPageAppears(pageName);
    }

    @Step
    public void enterTheEmail(String email){
        authenticationPage.enterEmail(email);
    }

    @Step
    public void pressCreateAccountButton() throws InterruptedException {
        authenticationPage.pressCreateAnAccountButton();
    }

    @Step
    public void verifyPresenceOfRegistrationForm(String pageTitleText){
        createAnAccountPage.verifyThatRegistrationPageIsAvailable(pageTitleText);
    }




}
