package SerenityCucumber.automationPracticeSteps;

import SerenityCucumber.pagesAutomationPractice.MainPage;
import net.thucydides.core.annotations.Step;

public class SearchFunctionSteps {

    private MainPage mainPage = new MainPage();

    @Step
    public void enterSearchRequest(String searchRequest){
        mainPage.typeSearchRequestInSearchInout(searchRequest);
    }

    @Step
    public void clickSubmitButton(){
        mainPage.clickOnSubmitSearchButton();
    }

    @Step
    public void verifyPageHeading(String pageName){
        mainPage.verifySearchedPageName(pageName);
    }
}
