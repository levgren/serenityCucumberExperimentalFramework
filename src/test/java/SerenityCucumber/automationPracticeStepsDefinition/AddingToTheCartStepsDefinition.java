package SerenityCucumber.automationPracticeStepsDefinition;

import SerenityCucumber.automationPracticeSteps.AddingToTheCartSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddingToTheCartStepsDefinition {

    @Steps
    private AddingToTheCartSteps addingToTheCartSteps;

    @When("user select any product")
    public void user_select_any_product(DataTable productTypeData) {
        addingToTheCartSteps.selectTheProduct(productTypeData);
    }

    @When("user clicks on Add to cart button")
    public void user_clicks_on_Add_to_cart_button() {
        addingToTheCartSteps.pressAddToCartButton();
    }

    @Then("opens a popup with a success message '(.*)'")
    public void opens_a_popup_with_a_success_message(String messageText) {
        addingToTheCartSteps.checkTheMessage(messageText);
    }

    @When("user clicks on proceed to checkout button")
    public void user_clicks_on_proceed_to_checkout_button() {
        addingToTheCartSteps.clickOnSubmitButton();
    }

    @Then("selected product is in the users cart")
    public void selected_product_is_in_the_users_cart(DataTable expected) {
        addingToTheCartSteps.compareTheProducts(expected);
    }

    @Then("user remove all products from the cart")
    public void user_remove_all_products_from_the_cart() {
        addingToTheCartSteps.deleteProductsFromTheCart();
    }

    @Then("check that appears message with text '(.*)'")
    public void check_that_appears_message_with_text(String messageText){
        addingToTheCartSteps.verifyMessageText(messageText);
    }

}
