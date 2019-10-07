package SerenityCucumber.pagesAutomationPractice;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoryPage extends PageObject {

    public SubcategoriesPage selectSubcategory(String subcategoryName){
        $(By.xpath("//a[@class='subcategory-name'][contains(text(),'" + subcategoryName + "')]")).click();
        return new SubcategoriesPage();
    }
}
