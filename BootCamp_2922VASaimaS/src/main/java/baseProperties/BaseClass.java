package baseProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BaseClass {
	public static WebDriver driver;
	Properties pro = new Properties();
    String Browser="chrome";
    String URL= "https://expedia.com";
	public void Invo() throws IOException {
		SelectBrowser();
		geturl();
	}

	public void SelectBrowser() throws IOException {
		//FileInputStream fil = new FileInputStream("src\\main\\java\\resources\\Base.properties");
		//pro.load(fil);

		if (Browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "src\\main\\java\\webDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		/*if (pro.getProperty("Browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src//main//java//webDrivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "src/main/java/com/qa/WebDrivers/geckodriver.exe");
			driver = new InternetExplorerDriver();

		}*/
	}

	public void geturl() {
		driver.get("https://expedia.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
