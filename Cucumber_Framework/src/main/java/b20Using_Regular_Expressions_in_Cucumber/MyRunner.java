package b20Using_Regular_Expressions_in_Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * @CucumberOptions(plugin= {"html:target/CucumberReport.html"})
   The above line is attached in Runner class to see then html report.
   html:target/CucumberReport.html --> This is the path where that report is stored.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/CucumberReport.html"})
public class MyRunner {

}
