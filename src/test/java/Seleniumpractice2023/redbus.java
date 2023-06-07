package Seleniumpractice2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.TabSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Bangalor");
		Thread.sleep(500);
		Actions builder=new Actions(driver);
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(100); 
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Hyderaba");
		Thread.sleep(500); 
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.ENTER).perform();
		
		
		Thread.sleep(200); 
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[3]")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(500);
		
		
		
		if (driver.findElement(By.xpath("//a[text()='online bus ticket booking']")).isDisplayed()) {
			System.out.println("Page is at bottom now");			
		}
		
		Thread.sleep(200);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		int i=10;
		while(0<i) {
			
			jse.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(800);
			i--;
		}
		
		builder.moveToElement(driver.findElement(By.xpath("//a[text()='online bus ticket booking']")));

		// verify least prices for given date

		List<WebElement> allPricesElements = driver.findElements(By.xpath("//div[@class='fare d-block']"));
		System.out.println("******************: "+allPricesElements.size());
		ArrayList listOfPrices = new ArrayList();
		Thread.sleep(500);
		int j=1;
		for (WebElement pricesElement : allPricesElements) {
			
			if (pricesElement.getText().contains("INR")) {
				String[] prices =pricesElement.getText().split(" ");
				//System.out.println(prices[1]);
				listOfPrices.add(prices[1]);
			}
			else
			//System.out.println(pricesElement.getText());
			listOfPrices.add(pricesElement.getText());
			j++;
		}
		for (Object listOfPrice : listOfPrices) {
			System.out.println(listOfPrice);
		}

		Collections.sort(listOfPrices);
		System.out.println("-------------------"+listOfPrices.get(0));

	}

}
