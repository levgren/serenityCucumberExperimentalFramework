package SerenityCucumber.steps;

import SerenityCucumber.pages.CategoryPage;
import SerenityCucumber.pages.MainPage;
import SerenityCucumber.pages.SubcategoriesPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class OpeningCorrectCategorySteps {

    private MainPage mainPage = new MainPage();
    private CategoryPage categoryPage = new CategoryPage();
    private SubcategoriesPage subcategoriesPage = new SubcategoriesPage();

    @Step
    public void pressCategoryButton(String buttonName){
        mainPage.clickOnTheCategoryButton(buttonName);
    }

    @Step
    public void selectSubcategory(String subcatName){
        categoryPage.selectSubcategory(subcatName);
    }

    @Step
    public void checkThatOpensCorrectPge(String actualCategory){
        subcategoriesPage.checkThatOpenedPgeCorrespondsToSelected(actualCategory);
    }
}
