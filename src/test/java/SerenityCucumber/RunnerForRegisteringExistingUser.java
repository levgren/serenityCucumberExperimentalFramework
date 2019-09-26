package SerenityCucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles/abilityToRegisterExistingUser.feature",
        plugin = {"pretty"})

public class RunnerForRegisteringExistingUser {
}
