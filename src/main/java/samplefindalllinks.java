import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class samplefindalllinks {
public static WebDriver  driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in");
		
		
List<WebElement>alllinksamazon = driver.findElements(By.xpath("//a"));
		
		for(WebElement links:alllinksamazon) {
			
			String textofelements =links.getText();
			
			System.out.println(textofelements);
		
	}

}
}