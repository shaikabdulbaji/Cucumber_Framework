package b38Overriding_tags_in_Runner_class_using_Maven_command_line_command_MyRunner;
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
   
 * The correct (or) real time putting of feature files in "src/main/resource", to run this  
   features="src/main/resource/b36Organizing_Feature_Files_in_Maven_Project_feature"
   we give above line in Runner class
   
 * This session is all about overriding of  --tags="@smoke"-- with maven command line command.
   we want to run the test with maven command line go to project right on project click on properties then click
   on arrow it will redirect to project location then search bar type on "cmd" cmd will open give this command 
   -------mvn test -Dcucumber.filter.tags="@login"-------
   
   
   
   
  */

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/b38Overriding_tags_in_Runner_class_using_Maven_command_line_command_feature",
		glue="b38Overriding_tags_in_Runner_class_using_Maven_command_line_command_Stepdefinition",
		tags="@smoke",
		plugin= {"pretty","html:target/CucumberReport.html"})
public class MyRunner {

}
