package b17Scenario_Outline_and_Examples_Data_Driven_Testing;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

import io.cucumber.java.en.*;

/*
 * import io.cucumber.java.en.Given;
   import io.cucumber.java.en.Then;
   import io.cucumber.java.en.When;
   
 * In place of above three imports we can use single import by "Regular Expression"
 * import io.cucumber.java.en.*;

 */

public class Login13Step_Defenition_File {
	
	@Given("User navigate to login page")
	public void user_navigate_to_login_page() {
		
		System.out.println(">> User navigated to login page ");
	    
	}

	@When("User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String email) {
	    
		System.out.println(">> User enters valid email address " +email);
		
	}

	@When("Enter valid password (.+)$")
	public void enter_valid_password(String password) {

		System.out.println(">> User enters valid password " +password);
		
	}

	@Then("click on login button")
	public void click_on_login_button() {
		
		System.out.println(">> User click on login button ");
	    
	}

	@Then("User should login successfully.")
	public void user_should_login_successfully() {
		
		System.out.println(">> User login successfully ");
	    
	}
	
	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidemailAddressText) {
		
	    System.out.println(">> User enters invalid email address :"+ invalidemailAddressText);
	    
	}

	@When("Enter invalid password {string}")
	public void enter_invalid_password(String invalidpasswordText) {
		
	    System.out.println(">> User enters invalid password text :"+ invalidpasswordText);
	    
	}
	
	@Then("User should get a proper warning message.")
	public void user_should_get_a_proper_warning_message() {
		
		System.out.println(">> User successfully get a proper warning message ");
	    
	}
	
	@When("User not enter email address")
	public void user_not_enter_email_address() {
	    
		System.out.println(">> User not entered any email address");
		
	}

	@When("Enter no password")
	public void enter_no_password() {
	    
		System.out.println(">> User not entered any password");
		
	}
}
