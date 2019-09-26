package SerenityCucumber.steps;

import SerenityCucumber.pages.MainPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class AddingToTheCartSteps {

    private MainPage mainPage = new MainPage();

    @Step
    public void selectTheProduct(DataTable productType){
        mainPage.selectRandomProduct(productType);
    }
}
