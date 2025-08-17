package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.Enter_ActInfoPage;
import pageObjects.HomePage;
import pageObjects.LoginOrSignupPage;

public class AccountCreationSteps {
	WebDriver driver;
	HomePage hp;
	LoginOrSignupPage lp;
	Enter_ActInfoPage eap;

	
	@Given("User is on the Sinup login screen")
	public void user_is_on_the_sinup_login_screen() {
	    
		BaseClass.getLogger().info("Goto Home page -->Click on Login/Signup.. ");
		hp = new HomePage(BaseClass.getDriver());
		hp.clickLoginOrSignup();
		  lp = new LoginOrSignupPage(BaseClass.getDriver());
    }

    @When("User enters sname as {string} and semail as {string}")
    public void user_enters_sname_as_and_semail_as(String sname, String semail) {
        BaseClass.getLogger().info("Enters already registered email");
        lp.setSupName(sname);
        lp.setSupEmail(semail);
    }


	@When("Clicks SignUp")
	public void clicks_sign_up() {
		
		lp.clickSingUp();
		BaseClass.getLogger().info("Clicked SignUp");
	}

	@Then("User get's and error showing Email already exists")
	public void user_get_s_and_error_showing_email_already_exists() {
	    boolean errormsg= lp.emailExists();
		Assert.assertTrue(errormsg);
	}

}
