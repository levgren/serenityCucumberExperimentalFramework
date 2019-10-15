package SerenityCucumber.automationPracticeStepsDefinition;

import SerenityCucumber.automationPracticeSteps.SearchFunctionSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchFunctionStepsDeffinition {

    @Steps
    SearchFunctionSteps searchFunctionSteps;

    @When("user fill in search_query with '(.*)'")
    public void user_fill_in_search_query_with_summer_dress(String searchRequest) {
        searchFunctionSteps.enterSearchRequest(searchRequest);
    }

    @When("user press submit_search")
    public void user_press_submit_search() {
        searchFunctionSteps.clickSubmitButton();
    }

    @Then("user should see Search results page for '(.*)'")
    public void user_should_see_Search_results_page_for_summer_dress(String pageName) {
        searchFunctionSteps.verifyPageHeading(pageName);
    }
}
