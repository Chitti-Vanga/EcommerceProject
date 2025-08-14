package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement SignupOrLoginBtn;
	@FindBy(xpath="//a[normalize-space()='Logout']") WebElement btnLogout;
	
	public void clickLoginOrSignup(){
		SignupOrLoginBtn.click();
	}
	public boolean btLogout() {
		return btnLogout.isDisplayed();
	}

}
