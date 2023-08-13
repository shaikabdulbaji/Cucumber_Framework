package b30BeforeStep_and_AfterStep_Hooks;

import io.cucumber.java.en.*;

/*
 * In this session we replace {String} by (.+) this is use of Regular Expression
 */

public class Register30Step_Defenition_File {
	
	@Given("^User navigate to Register Account Page$")
	public void user_navigate_to_register_account_page() {
		
		System.out.println(">> User navigated to login page ");
	    
	}

	@When("^User enter first name (.+) into the First Name Field$")
	public void user_enter_first_name_into_the_first_name_field(String firstname) {
		
		System.out.println(">> User enter first name" +firstname+  "into the First Name Field ");
	    
	}

	@When("^User enter last name (.+) into the Last Name Field$")
	public void user_enter_last_name_into_the_last_name_field(String lastname) {
	    
		System.out.println(">> User enter last name" +lastname+  "into the Last Name Field ");
		
	}

	@When("^User enter email address (.+) into the Email Address Field$")
	public void user_enter_email_address_into_the_email_address_field(String emailaddress) {
		
		System.out.println(">> User enter email address" +emailaddress+  "into the Email Address Field ");
	    
	}

	@When("^User enter telephone (.+) into the Telephone Field$")
	public void user_enter_telephone_into_the_telephone_field(String telephone) {
	   
		System.out.println(">> User enter telephone" +telephone+ "into the Telephone Field ");
		
	}

	@When("^User enter password (.+) into the Password Field$")
	public void user_enter_password_into_the_password_field(String password) {
	    
		System.out.println(">> User enter password" +password+ "into the Password Field");
		
	}

	@When("^User enter password (.+) into the Confirm Password Field$")
	public void user_enter_password_into_the_confirm_password_field(String confirmpassword) {
	 
		System.out.println(">> User enter password" +confirmpassword+ "into the Confirm Password Field");
		
	}

	@When("^Selects Privacy Policy field$")
	public void selects_privacy_policy_field() {
	  
		System.out.println(">> Selects Privacy Policy field ");
		
	}

	@When("^Clicks on Continue button$")
	public void clicks_on_continue_button() {
	   
		System.out.println(">> Clicks on Continue button");
		
	}

	@Then("^Account Creaated Successfully.$")
	public void account_creaated_successfully() {
	    
		System.out.println(">> Account Creaated Successfully.");
		
	}

	@When("^Select Yes for Newsletter$")
	public void select_yes_for_newsletter() {
	    
		System.out.println(">> Select Yes for Newsletter");
		
	}

	@When("^User dont enter details into anyfields$")
	public void user_dont_enter_details_into_anyfields() {
	    
		System.out.println(">> User dont enter details into anyfields");
		
	}

	@Then("^User should get a proper warning message displayed for the mandatory fields.$")
	public void user_should_get_a_proper_warning_message_displayed_for_the_mandatory_fields() {
	   
		System.out.println(">> User should get a proper warning message displayed for the mandatory fields. ");
		
	}

	@Then("^messaging like duplicate fields.$")
	public void messaging_like_duplicate_fields() {
		
		System.out.println(">> messaging like duplicate fields.");
	    
	}

}
