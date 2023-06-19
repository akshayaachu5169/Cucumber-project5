package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	@Given("open browser as {string}")
	public void openbrowser(String browser) {
		System.out.println("---open browser---" + browser);
	}

	@When("enter username as {string}")
	public void enterusername(String username) {
		System.out.println("---enter username---" + username);
	}

	@And("enter password as {string}")
	public void enterpassword(String password) {
		System.out.println("---enter password---" + password);
	}

	@When("click login button")
	public void clickloginbutton() {
		System.out.println("---click login button---");
	}

	@Then("verify the welcome page as {string} in header")
	public void verifythewelcomepage(String welcomemsg) {
		System.out.println("---verify the welcome page---" + welcomemsg);
	}

	@But("dont click remember password")
	public void dontclickrememberpassword() {
		System.out.println("---dont click remember password---");
	}

}
