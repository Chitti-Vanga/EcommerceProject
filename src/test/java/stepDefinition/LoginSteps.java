package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginOrSignupPage;

public class LoginSteps {
	WebDriver driver;
	HomePage hp;
	LoginOrSignupPage lp;
	
	@Given("Open the application")
	public void open_the_application() {
		BaseClass.getLogger().info("Goto my account-->Click on Login.. ");
		hp=new HomePage(BaseClass.getDriver());
	}

	@Given("Click on the Login or Signup")
	public void click_on_the_login_or_signup() {
		hp.clickLoginOrSignup();
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String pwd) {
 	BaseClass.getLogger().info("Entering email and password.. ");
    	
    	lp=new LoginOrSignupPage(BaseClass.getDriver());
       	lp.setLoginEmail(email);
        lp.setLoginpswd(pwd);
	}

	@When("Clicks login button")
	public void clicks_login_button() {
		lp.clickLogin();
        BaseClass.getLogger().info("clicked on login button...");
	}

	@Then("User navigated to home screen and logout button appears")
	public void user_navigated_to_home_screen_and_logout_button_appears() {
	    hp= new HomePage(BaseClass.getDriver());
	    boolean logout= hp.btLogout();
	    Assert.assertTrue(logout);
	}

}
