import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList aryLts = new ArrayList();
		aryLts.add("About Us");
		aryLts.add("Careers");
		aryLts.add("Press Releases");
		aryLts.add("Amazon Science");
		
		
		//
		
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in");
		
	

		
		//div[text()='Get to Know Us']/following::ul[1]
		
		List<WebElement>elms= driver.findElements(By.xpath("//div[text()='Get to Know Us']/following::ul[1]"));
		
		System.out.println(elms.size());
		for(int i=0;i<elms.size();i++) {
			String names= elms.get(i).getText();
			if (aryLts.contains(names)) {
				System.out.println(names+" : is exist");
			}
			
		}
		
	}

}
