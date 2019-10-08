package SerenityCucumber.automationPracticeStepsDefinition;

import SerenityCucumber.automationPracticeSteps.OpeningCorrectCategorySteps;
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

    @Then("opens page with (.*)")
    public void opens_page_with(String actualCategory) {
        openingCorrectCategorySteps.checkThatOpensCorrectPge(actualCategory);
    }

}
