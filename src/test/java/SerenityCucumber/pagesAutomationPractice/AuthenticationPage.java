package SerenityCucumber.pagesAutomationPractice;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.junit.Assert.assertTrue;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class AuthenticationPage extends PageObject {

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElementFacade emailInput;

    @FindBy(xpath = "//button[@id='SubmitCreate']/span")
    private WebElementFacade submitButton;

    @FindBy(xpath = "//div[@id='create_account_error']")
    private WebElementFacade allertMessage;

    @FindBy(xpath = "//input[@id='email']")
    private WebElementFacade signiInEmailInput;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElementFacade passwordInput;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElementFacade signInButton;

    public AuthenticationPage checkThatAuthenticationPageAppears(String pageName){
        assertTrue(getDriver().getCurrentUrl().toLowerCase().contains(pageName.toLowerCase()));
        System.out.println(pageName);
        return this;
    }

    public AuthenticationPage enterEmail(String email){
        emailInput.shouldBeVisible();
        emailInput.clear();
        emailInput.sendKeys(email);
        return this;
    }

    public CreateAnAccountPage pressCreateAnAccountButton() throws InterruptedException {
        submitButton.click();
        Thread.sleep(3000);     //that moment, when only Tread.sleep could help
        return new CreateAnAccountPage();
    }

    public AuthenticationPage checkAllertMessage(String allerText){
        assertTrue(allertMessage.getText().toLowerCase().contains(allerText.toLowerCase()));
        return this;
    }

    public AuthenticationPage enterEmailInSignInInput(String email){
        signiInEmailInput.shouldBeVisible();
        signiInEmailInput.clear();
        signiInEmailInput.sendKeys(email);
        return this;
    }

    public AuthenticationPage enterPassword(String password){
        passwordInput.shouldBeVisible();
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }

    public AuthenticationPage clickOnSignInButton(){
        signInButton.click();
        return this;
    }
}
