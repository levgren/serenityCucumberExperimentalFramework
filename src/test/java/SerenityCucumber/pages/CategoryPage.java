package SerenityCucumber.pages;

import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CategoryPage {

    public SubcategoriesPage selectSubcategory(String subcategoryName){
        getDriver().findElement(By.xpath("//a[@class='subcategory-name'][contains(text(),'" + subcategoryName + "')]")).click();
        return new SubcategoriesPage();
    }
}
