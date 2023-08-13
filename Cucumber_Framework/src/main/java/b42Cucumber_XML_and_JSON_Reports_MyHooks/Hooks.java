package b42Cucumber_XML_and_JSON_Reports_MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void setUp(Scenario scenario)
	{
		System.out.println("-- Execution Stated for Scenario - "+scenario.getName());
		System.out.println("$$ Browser got launched and maximized $$");
		System.out.println("$$ Application URL got opened in the browser $$");
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		System.out.println("-- Log out from the Application --");
		System.out.println("-- Browser got Closed --");
		System.out.println("** Execution Completed for Scenario - "+scenario.getName());
	}

}
