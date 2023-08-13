package b38Overriding_tags_in_Runner_class_using_Maven_command_line_command_Stepdefinition;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

/*
 * In this session we replace {String} by (.+) this is use of Regular Expression
 */

public class Register38Step_Defenition_File {
	
	
	@Given("^User navigate to Register Account Page$")
	public void user_navigate_to_register_account_page() {
		
		System.out.println(">> User navigated to login page ");
	    
	}
	
	@When("^User enter below details into the fields$")
	public void User_enter_below_details_into_the_fields(DataTable dataTable)
	{
		
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		
		System.out.println(">> User has entered the first name as "+map.get("firstname"));
		System.out.println(">> User has entered the last name as "+map.get("lastname"));
		System.out.println(">> User has entered the email address as "+map.get("emailaddress"));
		System.out.println(">> User has entered the telephone as "+map.get("telephone"));
		System.out.println(">> User has entered the password as "+map.get("password"));
		System.out.println(">> User has entered the password as "+map.get("password"));

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
