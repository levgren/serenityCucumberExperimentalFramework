package SerenityCucumber.automationPracticeSteps;

import SerenityCucumber.pagesAutomationPractice.MainPage;
import net.thucydides.core.annotations.Step;

public class SubscriptionSteps {

    private MainPage mainPage = new MainPage();

    @Step
    public void enterEmailForSubscribing(String email){
        mainPage.enteringEmailInNewsletterInput(email);
    }

    @Step
    public void pressSubmitEnteringEmailButton(){
        mainPage.pressSubmitNewsletterButton();
    }

    @Step
    public void verifyAllertMessage(String messageText){
        mainPage.verifyThatMessageContainsSuccessText(messageText);
    }
}
