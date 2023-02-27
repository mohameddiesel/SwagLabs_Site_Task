package runner;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;



@CucumberOptions(features="src/test/java/features/login.feature", glue="definitions",
plugin = {"pretty","html:tsrget/cucumber-html-report"})
public class TestRunner extends TestBase {
	


}
