package SerenityCucumber.steps;

import SerenityCucumber.pagesAutomationPractice.CreateAnAccountPage;
import SerenityCucumber.pagesAutomationPractice.MyAccountPage;
import net.thucydides.core.annotations.Step;

public class RegistrtionSteps {

    private CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
    private MyAccountPage myAccountPage = new MyAccountPage();

    @Step
    public void verifyPresenceOfPage() {
        createAnAccountPage.verify();
    }

    @Step
    public void enterFirstName(String firstName){
        createAnAccountPage.enterFirstName(firstName);
    }

    @Step
    public void enterEmail(String email){
        createAnAccountPage.enterEmail(email);
    }

    @Step
    public void enterSurname(String surnsme){
        createAnAccountPage.enterSurname(surnsme);
    }

    @Step
    public void enterPassword(String pass){
        createAnAccountPage.enterPassword(pass);
    }

    @Step
    public void enterUsersName(String usersName){
        createAnAccountPage.enterUsersFirstName(usersName);
    }

    @Step
    public void enterUserSurname(String surname){
        createAnAccountPage.enterUsersLastName(surname);
    }

    @Step
    public void enterAddress(String address){
        createAnAccountPage.enterAddress(address);
    }

    @Step
    public void enterCity(String city){
        createAnAccountPage.enterCity(city);
    }

    @Step
    public void selectTheCountry(String country) {
        createAnAccountPage.selectCountry(country);
    }

    @Step
    public void selectTheState(String state){
        createAnAccountPage.selectState(state);
    }

    @Step
    public void enterThePostalCode(String postalCode){
        createAnAccountPage.enterPostalCode(postalCode);
    }

    @Step
    public void enterTheMobilePhone(String phone){
        createAnAccountPage.enterMobilePhone(phone);
    }

    @Step
    public void enterAliasAddress(String aliasAddress){
        createAnAccountPage.enterAliasAddress(aliasAddress);
    }

    @Step
    public void pressRegisterButton(){
        createAnAccountPage.pressRegisterButton();
    }

    @Step
    public void verifyPageUrl(String pageName){
        myAccountPage.checkThatMyAccountPageAppears(pageName);
    }
}
