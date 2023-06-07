package anuglobalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import fbstepdefination.Hooks;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class anuglobalmethods {
	public static WebDriver driver=Hooks.driver;
	//public String URL = "https://www.facebook.com/r.php?locale=en_GB&display=page";

	public static WebElement anuElementxpath(String xpath) {

		return driver.findElement(By.xpath(xpath));

	}

	public static WebElement anuElementid(String id) {

		return driver.findElement(By.id(id));
	}

	public static WebElement anuElementname(String name) {

		return driver.findElement(By.name(name));
	}

	public static WebElement anuElementclassname(String classname) {

		return driver.findElement(By.className(classname));
	}

	public static WebElement anuElementlinktext(String linkText) {

		return driver.findElement(By.linkText(linkText));

	}

	public static WebElement anuElementpartiallinktext(String partiallinktext) {

		return driver.findElement(By.partialLinkText(partiallinktext));
	}

	public static WebElement anuElemenettagname(String Tagname) {

		return driver.findElement(By.tagName(Tagname));
	}
	
//	@Before
	public static void launchBrowser(String URL) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		String URL1 = "https://www.facebook.com/r.php?locale=en_GB&display=page";
		driver.get(URL1);
		driver.manage().window().maximize();		
		anuglobalmethods.launchBrowser(URL1);
		
		
	}
//	
//	@After
	public static void close(Scenario scenario)  {	
	
	
		if(scenario.isFailed()){
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Screenshot");
			}
				
		driver.close();
		driver.quit();
	}

}
