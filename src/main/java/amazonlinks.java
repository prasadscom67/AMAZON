import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonlinks {
public static WebDriver driver;
	public static void main(String[] args) {
		
		
		ArrayList ary=new ArrayList();
		
		ary.add("Instagram");
		ary.add("Sell on Amazon");
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in");
		
		// TODO Auto-generated method stub

		
		
		List<WebElement>azlinks= driver.findElements(By.xpath("//div[text()='Get to Know Us']/following::ul"));
		
		System.out.println(azlinks.size());
		
		for(WebElement amazonlks: azlinks) {
			
			
			System.out.println(amazonlks.getText());
			
			if(ary.contains("Instagram")) {
				System.out.println("ele is present");
			}
		}
		
	}

}
