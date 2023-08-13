package b34Organizing_the_Cucumber_Project_MyRunner;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * @CucumberOptions(plugin= {"html:target/CucumberReport.html"})
   The above line is attached in Runner class to see then html report.
   html:target/CucumberReport.html --> This is the path where that report is stored.
   pretty --> It will give clear report.
  */

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/b34Organizing_the_Cucumber_Project_Feature",
		glue="b34Organizing_the_Cucumber_Project_Stepdefinition",
		plugin= {"pretty",
		"html:target/CucumberReport.html"})
public class MyRunner {

}
