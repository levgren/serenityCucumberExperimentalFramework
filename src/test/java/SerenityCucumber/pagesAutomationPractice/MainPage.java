package SerenityCucumber.pagesAutomationPractice;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static junit.framework.TestCase.assertEquals;
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

    @FindBy(xpath = "//select[@id='selectProductSort']")
    private WebElementFacade productSortSelect;

    @FindBy(xpath = "//input[@id='newsletter-input']")
    private WebElementFacade newsletterInput;

    @FindBy(xpath = "//button[@name='submitNewsletter']")
    private WebElementFacade submitNewsletterButton;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElementFacade successAllertMessage;

    public AuthenticationPage clickSignInButton(){
        signInButton.shouldBeVisible();
        signInButton.click();
        return new AuthenticationPage();
    }

    public ProductPage selectRandomProduct(DataTable productTypeData) {
        List<String> list = productTypeData.asList(String.class);
        if (IntStream.range(0, list.size()).anyMatch(i -> true)) {
            $(By.cssSelector("#homefeatured .right-block [title='" + list.get(new Random().nextInt(5)) + "']")).click();
        }
        return new ProductPage();
    }

    public CategoryPage clickOnTheCategoryButton(String buttonName){
        $(By.xpath("//div[@id='block_top_menu']/ul/li[2]/a[@title='" + buttonName + "']")).click();
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

    public MainPage selectTypeOfOrderFromDropdown(String orderType){
        new Select(productSortSelect).selectByValue(orderType);
        return this;
    }

    public MainPage verifyOrder(){
        ArrayList<String> obtainedList;
        List<WebElementFacade> elementList = $$(By.xpath("//h5[@itemprop='name']//a[@class='product-name']"));
        obtainedList = elementList.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toCollection(ArrayList::new));
//        elementList.forEach(element -> obtainedList.add(element.getText()));          //working variant using forEach() method with lambda expression
        ArrayList<String> sortedList = new ArrayList<>(obtainedList);
        Collections.sort(sortedList);
        assertEquals(sortedList, obtainedList);
        return this;
    }

    public MainPage enteringEmailInNewsletterInput(String email){
        newsletterInput.shouldBeVisible();
        newsletterInput.clear();
        newsletterInput.sendKeys(email);
        return this;
    }

    public MainPage pressSubmitNewsletterButton(){
        submitNewsletterButton.shouldBeVisible();
        submitNewsletterButton.click();
        return this;
    }

    public MainPage verifyThatMessageContainsSuccessText(String messageText){
        successAllertMessage.shouldBeVisible();
        assertTrue(successAllertMessage.getText().toLowerCase().contains(messageText.toLowerCase()));
        return this;
    }
}
