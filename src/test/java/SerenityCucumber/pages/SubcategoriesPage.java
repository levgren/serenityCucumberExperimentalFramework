package SerenityCucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


import static junit.framework.TestCase.assertTrue;

public class SubcategoriesPage extends PageObject {

    @FindBy(xpath = "//span[@class='cat-name']")
    private WebElementFacade subcategoryName;

    public SubcategoriesPage checkThatOpenedPgeCorrespondsToSelected(String actualCategory){
        assertTrue(subcategoryName.getText().toLowerCase().contains(actualCategory.toLowerCase()));
        return this;
    }
}
