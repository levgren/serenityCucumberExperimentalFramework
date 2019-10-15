package SerenityCucumber.automationPracticeSteps;

import SerenityCucumber.pagesAutomationPractice.MainPage;
import net.thucydides.core.annotations.Step;

public class CheckingSearchResultOrderSteps {

    private MainPage mainPage = new MainPage();

    @Step
    public void selectNecessaryOrderType(String orderType){
        mainPage.selectTypeOfOrderFromDropdown(orderType);
    }

    @Step
    public void verifyOrderOfAds(){
        mainPage.verifyOrder();
    }
}
