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
	
	public void setLoginEmail(String email) {
		txtLoginEmail.sendKeys(email);
	}
	
	public void setLoginpswd(String password) {
		txtLoginPswd.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}

}
