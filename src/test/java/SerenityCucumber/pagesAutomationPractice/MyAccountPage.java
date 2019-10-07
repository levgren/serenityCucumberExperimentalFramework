package SerenityCucumber.pagesAutomationPractice;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertTrue;

public class MyAccountPage {

    public void checkThatMyAccountPageAppears(String pageName) {
        assertTrue(getDriver().getCurrentUrl().toLowerCase().contains(pageName.toLowerCase()));
        System.out.println(pageName.toUpperCase() + " PAGE OPENS");
    }
}
