package SerenityCucumber.pages;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

@DefaultUrl("http://automationpractice.com")
public class MainPage extends PageObject{

    @FindBy(xpath = "//a[@class='login']")
    private WebElementFacade signInButton;

    public AuthenticationPage clickSignInButton(){
        signInButton.shouldBeVisible();
        signInButton.click();
        return new AuthenticationPage();
    }

    public ProductPage selectRandomProduct(DataTable productTypeData) {
        List<String> list = productTypeData.asList(String.class);
        for (int i = 0; i < list.size(); i++) {
            getDriver().findElement(By.cssSelector("#homefeatured .right-block [title='" + list.get(new Random().nextInt(5)) + "']")).click();
            break;
        }
        return new ProductPage();
    }
}
