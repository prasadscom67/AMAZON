package Seleniumpractice2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mybatis {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://blog.mybatis.org/p/products.html");
		Thread.sleep(1000);
		System.out.println("akalaala");
		// find all links 
		
		List<WebElement>allLinks= driver.findElements(By.tagName("//a"));
		allLinks.size();
		Thread.sleep(300);
		
		for(WebElement allLink : allLinks ) {
			System.out.println(allLink.getText());
			
		}
		
		
	}

}
