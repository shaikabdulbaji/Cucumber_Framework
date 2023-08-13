package b31Multiple_Hooks_and_their_order;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

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
 
 * @Before("@register") and @After("@register") these two tags will apply for register
   tag scenarios only. for that tags it will run before and after each scenario.

 */



public class Login31Step_Defenition_File {
	
	@Before(order = 0)
	public void setupOne()
	{
		System.out.println("++ SetUp One Before Hook Method got Executed ++");
	}
	
	@Before(order = 1)
	public void setupTwo()
	{
		System.out.println("++ SetUp Two Before Hook Method got Executed ++");
	}
	
	@Before(order = 2)
	public void setupThree()
	{
		System.out.println("++ SetUp Three Before Hook Method got Executed ++");
	}
	
	@After(order = 1)
	public void teardownOne()
	{
		System.out.println("-- TearDown One After Hook Method got Executed --");
	}
	
	@After(order = 3)
	public void teardownTwo()
	{
		System.out.println("-- TearDown Two After Hook Method got Executed --");
	}
	
	@After(order = 0)
	public void teardownThree()
	{
		System.out.println("-- TearDown Three After Hook Method got Executed --");
	}
	
	
	@Given("^User navigate to login page$")
	public void user_navigate_to_login_page() {
		
		System.out.println(">> User navigated to login page ");
	    
	}

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String email) {
	    
		System.out.println(">> User enters valid email address " +email);
		
	}

	@When("^Enter valid password (.+)$")
	public void enter_valid_password(String password) {

		System.out.println(">> User enters valid password " +password);
		
	}

	@Then("^click on login button$")
	public void click_on_login_button() {
		
		System.out.println(">> User click on login button ");
	    
	}

	@Then("^User should login successfully.$")
	public void user_should_login_successfully() {
		
		System.out.println(">> User login successfully ");
	    
	}
	
	@When("^User enters invalid email address (.+)$")
	public void user_enters_invalid_email_address(String invalidemailAddressText) {
		
	    System.out.println(">> User enters invalid email address :"+ invalidemailAddressText);
	    
	}

	@When("^Enter invalid password (.+)$")
	public void enter_invalid_password(String invalidpasswordText) {
		
	    System.out.println(">> User enters invalid password text :"+ invalidpasswordText);
	    
	}
	
	@Then("^User should get a proper warning message.$")
	public void user_should_get_a_proper_warning_message() {
		
		System.out.println(">> User successfully get a proper warning message ");
	    
	}
	
	@When("^User not enter email address$")
	public void user_not_enter_email_address() {
	    
		System.out.println(">> User not entered any email address");
		
	}

	@When("^Enter no password$")
	public void enter_no_password() {
	    
		System.out.println(">> User not entered any password");
		
	}
}
