package b42Cucumber_XML_and_JSON_Reports_MyRunner;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * @CucumberOptions(plugin= {"html:target/CucumberReport.html"})
   The above line is attached in Runner class to see then html report.
   html:target/CucumberReport.html --> This is the path where that report is stored.
   pretty --> It will give clear report.
   
   
 * features="src/main/java/b35Running_a_specific_feature_file_features/Login34.feature"
   features="src/main/java/b35Running_a_specific_feature_file_features/Register34.feature"
   If we want to run particular feature then we give the above line of particular feature path.
   
 * It will run except these tags scenarios
   tags="@all and not @dev and not @ignore and not @wip"
   
  */

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/b42Cucumber_XML_and_JSON_Reports_features",
		glue={"b42Cucumber_XML_and_JSON_Reports_Stepdefinition","b42Cucumber_XML_and_JSON_Reports_MyHooks"},
		plugin= {"pretty",
				"html:target/CucumberReports/CucumberReport.html",
				"json:target/CucumberReports/CucumberReport.json",
				"junit:target/CucumberReports/CucumberReport.xml"})
public class MyRunner {

}