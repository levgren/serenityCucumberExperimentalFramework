package SerenityCucumber.pagesAutomationPractice;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertTrue;

public class CreateAnAccountPage extends PageObject {

    @FindBy(xpath = "//div[@id='center_column']")
    private WebElementFacade registrationForm;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElementFacade firstNameInput;

    @FindBy(xpath = "//input[@id='email']")
    private WebElementFacade emailInput;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElementFacade surnameInput;

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElementFacade usersFirstNameInput;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElementFacade passwordInput;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElementFacade usersSurnameInput;

    @FindBy(xpath = "//input[@id='address1']")
    private WebElementFacade addressInput;

    @FindBy(xpath = "//input[@id='city']")
    private WebElementFacade cityInput;

    @FindBy(xpath = "//select[@id='id_country']")
    private WebElementFacade countryDropdown;

    @FindBy(xpath = "//select[@id='id_state']")
    private WebElementFacade stateDropdown;

    @FindBy(xpath = "//input[@id='postcode']")
    private WebElementFacade postalCodeInput;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElementFacade mobilePhoneInput;

    @FindBy(xpath = "//input[@id='alias']")
    private WebElementFacade aliasAddressInput;

    @FindBy(xpath = "//span[contains(text(),'Register')]")
    private WebElementFacade registerButton;

    public boolean verify() {
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(registrationForm));
        try {
            return registrationForm.isVisible();
        } catch (Exception e) {
            return false;
        }
    }

    public CreateAnAccountPage verifyThatRegistrationPageIsAvailable(String titleText) {
        assertTrue(registrationForm.isVisible() && registrationForm.getText().toLowerCase().contains(titleText.toLowerCase()));
        return new CreateAnAccountPage();
    }

    public CreateAnAccountPage enterFirstName(String firstName) {
        firstNameInput.shouldBeVisible();
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public CreateAnAccountPage enterSurname(String surnmae) {
        surnameInput.shouldBeVisible();
        surnameInput.clear();
        surnameInput.sendKeys(surnmae);
        return this;
    }

    public CreateAnAccountPage enterEmail(String email) {
        emailInput.shouldBeVisible();
        emailInput.clear();
        emailInput.sendKeys(email);
        return this;
    }

    public CreateAnAccountPage enterPassword(String password){
        passwordInput.shouldBeVisible();
        passwordInput.clear();
        passwordInput.sendKeys(password);
        return this;
    }

    public CreateAnAccountPage enterUsersFirstName(String usersName) {
        usersFirstNameInput.shouldBeVisible();
        usersFirstNameInput.clear();
        usersFirstNameInput.sendKeys(usersName);
        return this;
    }

    public CreateAnAccountPage enterUsersLastName(String usersLastName) {
        usersSurnameInput.shouldBeVisible();
        usersSurnameInput.clear();
        usersSurnameInput.sendKeys(usersLastName);
        return this;
    }

    public CreateAnAccountPage enterAddress(String address) {
        addressInput.shouldBeVisible();
        addressInput.clear();
        addressInput.sendKeys(address);
        return this;
    }

    public CreateAnAccountPage enterCity(String city) {
        cityInput.shouldBeVisible();
        cityInput.clear();
        cityInput.sendKeys(city);
        return this;
    }

    public CreateAnAccountPage selectCountry(String country) {
        new Select(countryDropdown).selectByVisibleText(country);
        return this;
    }

    public CreateAnAccountPage selectState(String state){
        new Select(stateDropdown).selectByVisibleText(state);
        return this;
    }

    public CreateAnAccountPage enterPostalCode(String postalCode) {
        postalCodeInput.shouldBeVisible();
        postalCodeInput.clear();
        postalCodeInput.sendKeys(postalCode);
        return this;
    }

    public CreateAnAccountPage enterMobilePhone(String phone){
        mobilePhoneInput.shouldBeVisible();
        mobilePhoneInput.clear();
        mobilePhoneInput.sendKeys(phone);
        return this;
    }

    public CreateAnAccountPage enterAliasAddress(String aliasAddress){
        aliasAddressInput.shouldBeVisible();
        aliasAddressInput.clear();
        aliasAddressInput.sendKeys(aliasAddress);
        return this;
    }

    public MyAccountPage pressRegisterButton(){
        registerButton.click();
        return new MyAccountPage();
    }
}
