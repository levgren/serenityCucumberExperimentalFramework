package SerenityCucumber.steps;

import SerenityCucumber.pages.CartPage;
import SerenityCucumber.pages.LayerCartPopup;
import SerenityCucumber.pages.MainPage;
import SerenityCucumber.pages.ProductPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class AddingToTheCartSteps {

    private MainPage mainPage = new MainPage();
    private ProductPage productPage = new ProductPage();
    private LayerCartPopup layerCartPopup = new LayerCartPopup();
    private CartPage cartPage = new CartPage();

    @Step
    public void selectTheProduct(DataTable productType){
        mainPage.selectRandomProduct(productType);
    }

    @Step
    public void pressAddToCartButton(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkTheMessage(String messageText){
        layerCartPopup.verifyTheMessage(messageText);
    }

    @Step
    public void clickOnSubmitButton(){
        layerCartPopup.pressSubmitButton();
    }

    @Step
    public void compareTheProducts(DataTable expectedName){
        cartPage.verifyProductName(expectedName);
    }

    @Step
    public void deleteProductsFromTheCart(){
        cartPage.deleteProductsFromTheCart();
    }

    @Step
    public void verifyMessageText(String text){
        cartPage.checkThatCartIsEmpty(text);
    }
}
