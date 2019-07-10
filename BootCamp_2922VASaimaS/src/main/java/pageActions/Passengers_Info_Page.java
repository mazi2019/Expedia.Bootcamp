package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Passengers_Info_Page {

	WebDriver driver;

	public Passengers_Info_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='firstname[0]']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='middlename[0]']")
	WebElement middlename;

	@FindBy(xpath = "//input[@id='lastname[0]']")
	WebElement lastname;

	@FindBy(xpath = "//select[@id='country_code[0]']")
	WebElement country;

	@FindBy(xpath = "//input[@id='phone-number[0]']")
	WebElement phonenumber;

	@FindBy(xpath = "//input[@id='confirmation-sms-provider-checkbox']")
	WebElement checkbox;

	@FindBy(xpath = "//select[@id='passport[0]']")
	WebElement passport;

	@FindBy(xpath = "//input[@id='gender_female[0]']")
	WebElement gender;

	@FindBy(xpath = "//select[@id='date_of_birth_month0']")
	WebElement month;

	@FindBy(xpath = "//select[@id='date_of_birth_day[0]']")
	WebElement day;

	@FindBy(xpath = "//select[@id='date_of_birth_year[0]']")
	WebElement year;

	public WebElement firstname() {
		return firstname;

	}

	public WebElement middlename() {
		return middlename;

	}

	public WebElement lastname() {
		return lastname;
	}

	public void Select_country_code() {
		Select s = new Select(country);
		s.selectByValue("91");

	}

	public WebElement phonenumber1() {
		return phonenumber;
	}

	public WebElement checkbox1() {
		return checkbox;
	}

	public void passport() {
		Select s = new Select(passport);
		s.selectByValue("4281173");
	}

	public WebElement box() {
		return gender;
	}

	public void birthmonth() {
		Select s = new Select(month);
		s.selectByValue("02");

	}

	public void birthday() {
		Select s = new Select(day);
		s.selectByValue("08");

	}

	public void birthyear() {
		Select s = new Select(year);
		s.selectByValue("2010");

	}

}
