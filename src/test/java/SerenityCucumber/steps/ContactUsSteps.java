package SerenityCucumber.steps;

import SerenityCucumber.pagesAutomationPractice.ContactUsPage;
import SerenityCucumber.pagesAutomationPractice.MainPage;
import net.thucydides.core.annotations.Step;

public class ContactUsSteps {

    private MainPage mainPage = new MainPage();
    private ContactUsPage contactUsPage = new ContactUsPage();

    @Step
    public void pressContactButton(){
        mainPage.pressContactUsButton();
    }

    @Step
    public void selectSubjectFromDropDown(String subject){
        contactUsPage.selectSubject(subject);
    }

    @Step
    public void enterEmail(String email){
        contactUsPage.enterEmail(email);
    }

    @Step
    public void enterMessageText(String messageText){
        contactUsPage.enterMessageText(messageText);
    }

    @Step
    public void pressSubmitButton(){
        contactUsPage.pressSendButton();
    }

    @Step
    public void checkAllertMessage(String allertMessageText){
        contactUsPage.verifyAllertMessage(allertMessageText);
    }
}
