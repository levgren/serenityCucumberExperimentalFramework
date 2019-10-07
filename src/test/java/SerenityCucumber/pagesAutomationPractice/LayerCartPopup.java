package SerenityCucumber.pagesAutomationPractice;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static junit.framework.TestCase.assertTrue;

public class LayerCartPopup extends PageObject {

    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']")
    private WebElementFacade layerCartInfoSection;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    private WebElementFacade submitButton;

    public void verifyTheMessage(String messageText){
        assertTrue(layerCartInfoSection.getText().toLowerCase().contains(messageText.toLowerCase()));
    }

    public CartPage pressSubmitButton(){
        submitButton.shouldBeVisible();
        submitButton.click();
    return new CartPage();
    }
}
