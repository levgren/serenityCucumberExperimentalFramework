package SerenityCucumber.stepsDefinition;

import SerenityCucumber.steps.OpeningCorrectCategorySteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OpeningCorrectCategoryStepDefinition {

    @Steps
    OpeningCorrectCategorySteps openingCorrectCategorySteps;

    @When("when user press button '(.*)'")
    public void when_user_press_button_Dresses(String btnName) {
        openingCorrectCategorySteps.pressCategoryButton(btnName);
    }

    @When("user press on (.*)")
    public void user_press_on(String expectedCategory) {
        openingCorrectCategorySteps.selectSubcategory(expectedCategory);
    }

    @Then("opens page with subcategory")
    public void opens_page_with(DataTable actualCategory) {
        openingCorrectCategorySteps.checkThatOpensCorrectPge(actualCategory);
    }

}