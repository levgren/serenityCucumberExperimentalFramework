package SerenityCucumber.stepsDefinition;

import SerenityCucumber.steps.AddingToTheCartSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AddingToTheCartStepsDefinition {

    @Steps
    AddingToTheCartSteps addingToTheCartSteps;

    @When("user select any product")
    public void user_select_any_product(DataTable productTypeData) {
        addingToTheCartSteps.selectTheProduct(productTypeData);
    }

    @Then("the '(.*)' page opens")
    public void the_product_page_opens(String pageName) {

    }

    @When("user clicks on Add to cart button")
    public void user_clicks_on_Add_to_cart_button() {

    }

    @Then("opens a popup with a success message '(.*)'")
    public void opens_a_popup_with_a_success_message() {

    }

    @When("user clicks on proceed to checkout button")
    public void user_clicks_on_proceed_to_checkout_button() {

    }

    @Then("opens a shopping cart page '(.*)'")
    public void opens_a_shopping_cart_page_order() {

    }

    @Then("selected '(.*)' is in the users cart")
    public void selected_product_is_in_the_users_cart() {

    }

    @Then("user remove all products from the cart")
    public void user_remove_all_products_from_the_cart() {

    }

}
