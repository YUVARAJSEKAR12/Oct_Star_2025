package com.app.stepdefinition;

import java.util.List;
import java.util.Map;

import com.app.pageexe.LoginPageExe;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("Load the browser")
	public void load_the_browser() {
		System.out.println("Chrome");
	}

	@Given("Load the URL")
	public void load_the_url() {
		System.out.println("url");
	}

	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		System.out.println(user);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		System.out.println(pass);
	}

	@When("Click the login button")
	public void click_the_login_button() {
		System.out.println("login Button");
	}

	@Then("Validate the home page")
	public void validate_the_home_page() {
		System.out.println("homepage");
	}

	@Given("Login to application")
	public void login_to_application() {
		System.out.println("login into the application");
	}

	@When("Select the Mobile Module")
	public void select_the_mobile_module() {
		System.out.println("module");
	}

	@When("Select the mobile {string}")
	public void select_the_mobile(String mobile) {
		System.out.println(mobile);
	}

	@When("Click the add to cart button")
	public void click_the_add_to_cart_button() {
		System.out.println("Add to cart");
	}

	@When("Checkout the product")
	public void checkout_the_product() {
		System.out.println("check out the product");
	}

	@Then("Validate the paymant gateway page")
	public void validate_the_paymant_gateway_page() {
		System.out.println("payment gateway");
	}

	@When("Enter the user {string}")
	public void enter_the_user(String user) {
		System.out.println(user);
	}

	@When("Enter the pass {string}")
	public void enter_the_pass(String pass) {
		System.out.println(pass);

	}
	
	@When("Enter the form input value")
	public void enter_the_form_input_value(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		System.out.println(asList.get(0));
		System.out.println(asList.get(1));
		
	}
	
	@When("Enter the form map input value")
	public void enter_the_form_map_input_value(DataTable dataTable) {
		Map<String,String> asMap = dataTable.asMap();
		System.out.println(asMap.get("Firstname"));
		
	}
	

}
