package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOrSignupPage extends BasePage {

	public LoginOrSignupPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@data-qa='login-email']") WebElement txtLoginEmail;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txtLoginPswd;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btnLogin;
	@FindBy(xpath="//input[@placeholder='Name']") WebElement txtSignUpName;
	@FindBy(xpath="//input[@data-qa='signup-email']")WebElement txtSignUpEmail;
	@FindBy(xpath="//button[normalize-space()='Signup']")WebElement btnSignUp;
	
	public void setLoginEmail(String email) {
		txtLoginEmail.sendKeys(email);
	}
	
	public void setLoginpswd(String password) {
		txtLoginPswd.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	public void setSupName(String name)
	{
		txtSignUpName.sendKeys(name);
	}
	public void setSupEmail(String email) 
	{
		txtSignUpEmail.sendKeys(email);
	}
	public void clickSingUp() 
	{
		btnSignUp.click();
	}

}
