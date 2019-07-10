package Select_Flights;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import baseProperties.BaseClass;
import pageActions.Landingpage;
import pageActions.Passengers_Info_Page;
import pageActions.SearchPage;
import pageActions.SelectFlightPage;
import pageActions.FlightsPage;

public class Verify_the_Select_Flight_Functionality extends BaseClass{
	
	Landingpage lp;
	FlightsPage fp;
	SearchPage sp;
	SelectFlightPage sfp;
	Passengers_Info_Page pi;

	@BeforeClass
	public void SetUpBrowser() throws IOException {
		Invo();
	}

	@Test
	public void Velidate_Select_Flidht() throws InterruptedException {
		lp = new Landingpage(driver);
		Thread.sleep(2000);
		lp.Flights().click();
		Thread.sleep(2000);
		fp = new FlightsPage(driver);
		fp.Roundtrip().click();
		fp.Flayingfrom().click();
		fp.Flayingfrom().sendKeys("ahmed");
		Thread.sleep(2000);
		fp.Flayingfrom().sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER));
		Thread.sleep(2000);
		fp.Flayingto().click();
		fp.Flayingto().sendKeys("iad");
		fp.Flayingto().sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER));
		Thread.sleep(5000);
		fp.SelectDepartureDate().click();
		Thread.sleep(2000);
		fp.Date().click();
		fp.SelectReturningDate().click();
		fp.Date1().click();
		Thread.sleep(2000);
		fp.Search().click();
		Thread.sleep(4000);
		sp = new SearchPage(driver);
		// String link=Keys.chord(Keys.CONTROL,Keys.ENTER);
		// driver.findElement(By.xpath("//button[@data-offer-index='5']")).sendKeys(link);
		// sp.Select().sendKeys(link);
		sp.Select().click();
		sp.Select().click();
		Thread.sleep(4000);
		System.out.println("abcd");
		if (sp.pop() > 0) {
			System.out.println(sp.pop());
			Thread.sleep(2000);
			sp.popup().click();
		}

		sfp = new SelectFlightPage(driver);
		sfp.HandleWindow();
		Thread.sleep(2000);
		sfp.continue_Booking2().click();
		Thread.sleep(2000);
		pi = new Passengers_Info_Page(driver);
		pi.firstname().sendKeys("saima");
		pi.middlename().sendKeys("M");
		pi.lastname().sendKeys("Saleem");
		pi.Select_country_code();
		pi.phonenumber1().sendKeys("7035056122");
		pi.checkbox1().click();
		Thread.sleep(3000);
		pi.passport();
		Thread.sleep(3000);
		pi.box().click();
		pi.birthmonth();
		Thread.sleep(3000);
		pi.birthday();
		Thread.sleep(3000);
		pi.birthyear();

		/*
		 * String m=fp.Month().getText(); System.out.println(m);
		 * while(!m.equalsIgnoreCase("Aug 2019")) { System.out.println(m);
		 * fp.selectmonth().click();
		 * 
		 * if(m.equalsIgnoreCase("Aug 2019")) { break; }
		 */
	}

	@AfterClass
	public void tearDown() {
		// driver.close();

	}
}
