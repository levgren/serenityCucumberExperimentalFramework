package SerenityCucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles/contactUs.feature",
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true)
public class RunnerForContactUsTest {
}
