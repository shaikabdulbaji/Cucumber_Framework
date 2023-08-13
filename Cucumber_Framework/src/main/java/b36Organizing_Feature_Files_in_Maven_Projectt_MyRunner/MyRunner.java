package b36Organizing_Feature_Files_in_Maven_Projectt_MyRunner;
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
   
   
  */

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resource/b36Organizing_Feature_Files_in_Maven_Project_feature",
		glue="b36Organizing_Feature_Files_in_Maven_Project_Stepdefinition",
		plugin= {"pretty","html:target/CucumberReport.html"})
public class MyRunner {

}
