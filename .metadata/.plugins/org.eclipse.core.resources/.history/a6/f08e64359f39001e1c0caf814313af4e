package b40Organizing_Hooks_in_Cucumber_Project_MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setUp()
	{
		System.out.println("$$ Browser got launched and maximized $$");
		System.out.println("$$ Application URL got opened in the browser $$");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("-- Log out from the Application --");
		System.out.println("-- Browser got Closed --");
	}

}
