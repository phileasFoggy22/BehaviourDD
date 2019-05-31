package Testing;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\BehDataDevelopment\\src\\test\\java\\Testing\\Parametisation.feature", glue = {
		"Testing" })
// @CucumberOptions(features =
// "C:\\Users\\Admin\\eclipse-workspace\\BehDataDevelopment\\src\\test\\java\\Testing\\TeaTesting.feature",
// glue = {
// "Testing" })
public class Runner {

}
