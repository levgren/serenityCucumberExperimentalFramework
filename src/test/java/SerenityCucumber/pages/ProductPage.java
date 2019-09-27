package SerenityCucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    private WebElementFacade addToCartButton;

    public LayerCartPopup clickAddToCartButton(){
        addToCartButton.waitUntilVisible();
        addToCartButton.click();
        return new LayerCartPopup();
    }
}
