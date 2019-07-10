package pageActions;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {

	WebDriver driver;

	public SelectFlightPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@id='bookButton']")
	WebElement continue_Booking;

	public void HandleWindow() {

		Set<String> fw = driver.getWindowHandles();
		Iterator<String> It = fw.iterator();
		driver.switchTo().window(It.next());
		driver.switchTo().window(It.next());
		System.out.println(driver.getTitle());
	}

	public WebElement continue_Booking2() {
		return continue_Booking;
	}

}




	
	


