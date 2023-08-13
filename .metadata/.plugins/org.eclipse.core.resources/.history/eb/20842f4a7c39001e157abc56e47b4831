package b28Hooks_in_Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * @CucumberOptions(plugin= {"html:target/CucumberReport.html"})
   The above line is attached in Runner class to see then html report.
   html:target/CucumberReport.html --> This is the path where that report is stored.
   pretty --> It will give clear report.
   tags="@all" --> It will run all the feature file scenarios which are placed as "@all"
   tags="@smoke" --> It will run all the feature file scenarios which are placed as "@smoke"
   tags="@allfields" --> It will run all the feature file scenarios which are placed as "@allfields"
   tags="@allfields and @regression" --> It will run all the feature file scenarios which are placed as "@allfields and @regression"
   tags="not @allfields" --> It will run the scenarios which are except @allfields in feature file.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty",
		"html:target/CucumberReport.html"})
public class MyRunner {

}
