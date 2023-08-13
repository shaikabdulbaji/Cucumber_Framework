package b45andb46and47andb48Using_publish_attribute_for_generating_Cucumber_Reports_on_Cloud_MyRunner;
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
   
 * To test the "dryRun" first of all add one step in feature file and run "MyRunner" then
   put dryRun="true" you will see the difference.
   
 * In this session If we run the test they will run normally but we want to run in cloud we put 
   ---publish=true----
   after then click on run the tests will run normally, then in console we see one link is there 
   we copy that link and paste that in chrome browser to see the report.
   
  */

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/b45Using_publish_attribute_for_generating_Cucumber_Reports_on_Cloud_features",
		glue={"b45Using_publish_attribute_for_generating_Cucumber_Reports_on_Cloud_Stepdefinition","b45Using_publish_attribute_for_generating_Cucumber_Reports_on_Cloud_MyHooks"},
		tags="@all",
		plugin= {"pretty",
				"html:target/CucumberReports/CucumberReport.html",
				"json:target/CucumberReports/CucumberReport.json",
				"junit:target/CucumberReports/CucumberReport.xml"})
public class MyRunner {

}
