package SerenityCucumber.pages;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SubcategoriesPage {

    @FindBy(xpath = "//span[@class='cat-name']")
    private WebElementFacade subcategoryName;

    public SubcategoriesPage checkThatOpenedPgeCorrespondsToSelected(DataTable actualCategory){
        List<String> list = actualCategory.asList(String.class);
        assertTrue(list.contains(getDriver().findElement(By.xpath("//span[@class='cat-name']")).getText()));
        return this;
    }
}
