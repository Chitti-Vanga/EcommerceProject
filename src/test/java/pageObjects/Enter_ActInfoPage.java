package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Enter_ActInfoPage extends BasePage{

	public Enter_ActInfoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='id_gender1']") WebElement radbtn_Mr;
	@FindBy(xpath="//input[@value='Mrs']") WebElement radbtn_Mrs;
	@FindBy(xpath="//input[@id='password']") WebElement txt_ActPswd;
	@FindBy(xpath="//input[@id='first_name']") WebElement txt_Fname;
	@FindBy(xpath="//input[@id='last_name']") WebElement txt_Lname;
	@FindBy (xpath="//input[@id='company']") WebElement txt_Company;
	@FindBy(xpath="//input[@id='address1']") WebElement txt_Add1;
	@FindBy (xpath="//input[@id='address2']") WebElement txt_Add2;
	@FindBy(xpath="//input[@id='state']") WebElement txt_State;
	@FindBy(xpath="//input[@id='city']") WebElement txt_City;
	@FindBy(xpath="//input[@id='zipcode']") WebElement txt_Zip;
	@FindBy(xpath="//input[@id='mobile_number']") WebElement txt_Mobile;
	@FindBy(xpath="//button[normalize-space()='Create Account']") WebElement btn_Create;
	@FindBy(xpath="//select[@id='days']") WebElement drp_Day;
	@FindBy(xpath="//select[@id='months']") WebElement drp_Month;
	@FindBy(xpath="//select[@id='years']") WebElement drp_Year;
	@FindBy(xpath="//h2[@data-qa='account-created']") WebElement msg_ActCreated;
	
	public void setGender_Mr() {
		radbtn_Mr.click();
	}
	public void setGender_Mrs() {
		radbtn_Mrs.click();
	}
	public void setActPswd(String pswd) {
		txt_ActPswd.sendKeys(pswd);
	}
	public void SetFname(String fname) {
		txt_Fname.sendKeys(fname);
	}
	public void SetLname(String lname) {
		txt_Lname.sendKeys(lname);
	}
	public void setCompany(String company) {
		txt_Company.sendKeys(company);
	}
	public void setAdd1(String add1) {
		txt_Add1.sendKeys(add1);
	}
	public void setAdd2(String add2) {
		txt_Add2.sendKeys(add2);
	}
	public void setState(String state) {
		txt_State.sendKeys(state);
	}
	public void setCity(String city) {
		txt_City.sendKeys(city);
	}
	public void setZip(String zip) {
		txt_Zip.sendKeys(zip);
	}
	public void clickCreateAct() {
		btn_Create.click();
	}
	public void setMobile(String mobile) 
	{
		txt_Mobile.sendKeys(mobile);
	}
	public void setDay(String day) 
	{
		Select setday= new Select(drp_Day);
		setday.selectByVisibleText(day);
	}
	public void setMonth(String month) 
	{
		Select setmnth= new Select(drp_Day);
		setmnth.selectByVisibleText(month);
	}
	public void setYear(String year) 
	{
		Select setyear= new Select(drp_Day);
		setyear.selectByVisibleText(year);
	}
	public boolean msgActCreated() {
		return msg_ActCreated.isDisplayed();
	}
	
	
}
