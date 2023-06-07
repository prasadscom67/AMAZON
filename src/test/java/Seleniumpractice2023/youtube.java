package Seleniumpractice2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class youtube {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement textfield = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		textfield.sendKeys("ooru palle");
		Thread.sleep(5000);

		Actions actObj = new Actions(driver);

		actObj.sendKeys(textfield, Keys.ARROW_DOWN);
		Thread.sleep(2000);
		actObj.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> views= driver.findElements(By.xpath("//span[contains(text(),'Ooru Palletooru')]"));
		
		for (WebElement view : views) {
			System.out.println(view.getText());
		}
	
			
			
		}
		
	

		
		
	}


