package b23Using_pretty_in_Cucumber_options_of_Runner_class;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * @CucumberOptions(plugin= {"html:target/CucumberReport.html"})
   The above line is attached in Runner class to see then html report.
   html:target/CucumberReport.html --> This is the path where that report is stored.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/CucumberReport.html"})
public class MyRunner {

}
