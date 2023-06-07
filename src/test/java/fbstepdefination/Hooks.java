package fbstepdefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public static WebDriver driver;
	public static String URL=FbTestRunner.siteURL;
	

	@Before
	public static void launchBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		//String URL = "https://www.facebook.com/r.php?locale=en_GB&display=page";
		driver.get(URL);
		driver.manage().window().maximize();
		
	
	}
	
	
	
	@After
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
