package SerenityCucumber.automationPracticeStepsDefinition;

import SerenityCucumber.automationPracticeSteps.CheckingSearchResultOrderSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckingSearchResultOrderStepsDefinition {

    @Steps
    CheckingSearchResultOrderSteps checkingSearchResultOrderSteps;

    @When("user selects '(.*)' from selectProductSort")
    public void user_selects_name_asc_from_selectProductSort(String orderType) {
        checkingSearchResultOrderSteps.selectNecessaryOrderType(orderType);
    }

    @Then("user should see results sorted in ascending order")
    public void user_should_see_results_sorted_in_ascending_order() {
        checkingSearchResultOrderSteps.verifyOrderOfAds();
    }
}
