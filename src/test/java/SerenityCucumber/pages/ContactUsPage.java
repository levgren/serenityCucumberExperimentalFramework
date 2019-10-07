package SerenityCucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertTrue;

public class ContactUsPage extends PageObject {

    @FindBy(css = "#id_contact")
    private WebElementFacade subjectLocator;

    @FindBy(xpath = "//input[@id='email']")
    private WebElementFacade emailInput;

    @FindBy(css = "#message")
    private WebElementFacade messageInputField;

    @FindBy(xpath = "//button[@id='submitMessage']")
    private WebElementFacade submitButton;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElementFacade allertSuccess;

    public ContactUsPage selectSubject(String subject){
        new Select(subjectLocator).selectByVisibleText(subject);
        return this;
    }

    public ContactUsPage enterEmail(String email){
        emailInput.shouldBeVisible();
        emailInput.clear();
        emailInput.sendKeys(email);
        return this;
    }

    public ContactUsPage enterMessageText(String messageText){
        messageInputField.shouldBeVisible();
        messageInputField.clear();
        messageInputField.sendKeys(messageText);
        return this;
    }

    public ContactUsPage pressSendButton(){
        submitButton.shouldBeVisible();
        submitButton.click();
        return this;
    }

    public ContactUsPage verifyAllertMessage(String allertText){
        allertSuccess.shouldBeVisible();
        assertTrue(allertSuccess.getText().equalsIgnoreCase(allertText));
        return this;
    }
}
