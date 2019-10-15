package SerenityCucumber.pagesAutomationPractice;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static junit.framework.TestCase.assertTrue;

@DefaultUrl("http://automationpractice.com")
public class MainPage extends PageObject{

    @FindBy(xpath = "//a[@class='login']")
    private WebElementFacade signInButton;

    @FindBy(css = "[title='Contact Us']")
    private WebElementFacade contactUsButton;

    @FindBy(xpath = "//input[@name='search_query']")
    private WebElementFacade searchInput;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElementFacade submitSearchButton;

    @FindBy(xpath = "//h1[@class='page-heading  product-listing']")
    private WebElementFacade pageHeading;

    public AuthenticationPage clickSignInButton(){
        signInButton.shouldBeVisible();
        signInButton.click();
        return new AuthenticationPage();
    }

    public ProductPage selectRandomProduct(DataTable productTypeData) {
        List<String> list = productTypeData.asList(String.class);
        for (int i = 0; i < list.size(); i++) {
            $(By.cssSelector("#homefeatured .right-block [title='" + list.get(new Random().nextInt(5)) + "']")).click();
            break;
        }
        return new ProductPage();
    }

    public CategoryPage clickOnTheCategoryButton(String buttonName){
        getDriver().findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/a[@title='" + buttonName + "']")).click();
        return new CategoryPage();
    }

    public ContactUsPage pressContactUsButton(){
        contactUsButton.shouldBeVisible();
        contactUsButton.click();
        return new ContactUsPage();
    }

    public MainPage typeSearchRequestInSearchInout(String searchRequest){
        searchInput.shouldBeVisible();
        searchInput.clear();
        searchInput.sendKeys(searchRequest);
        return this;
    }

    public MainPage clickOnSubmitSearchButton(){
        submitSearchButton.click();
        return this;
    }

    public MainPage verifySearchedPageName(String pageName){
        pageHeading.shouldBeVisible();
        assertTrue(pageHeading.getText().toUpperCase().contains(pageName.toUpperCase()));
        return this;
    }
}
