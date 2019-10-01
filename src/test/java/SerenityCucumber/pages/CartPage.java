package SerenityCucumber.pages;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class CartPage extends PageObject {

    @FindBy(xpath = "//td[@class='cart_delete text-center']/div/a")
    private WebElementFacade deleteProductsButton;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    private WebElementFacade shoppingCartMessage;

    public void verifyProductName(DataTable expectedName){
        List<String> list = expectedName.asList(String.class);
        assertTrue(list.contains(getDriver().findElement(By.xpath("//td[@class='cart_description']//p[@class='product-name']")).getText()));
    }

    public CartPage deleteProductsFromTheCart(){
        deleteProductsButton.click();
        new WebDriverWait(getDriver(),3000).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='alert alert-warning']")));
        return this;
    }

    public void checkThatCartIsEmpty(String text){
        assertTrue(shoppingCartMessage.getText().contains(text));
    }
}
