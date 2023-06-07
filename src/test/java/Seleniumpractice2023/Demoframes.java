package Seleniumpractice2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoframes {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']")))
				.moveToElement(driver.findElement(By.xpath("//a[text()='Frames Practice']"))).click().build().perform();
		
		//action.doubleClick().perform();
		//action.contextClick().perform();
		//frames
		
		driver.findElement(By.id("name")).sendKeys("Hello frames");
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Thread.sleep(5000);
	
		Select CourseDD= new Select(driver.findElement(By.id("course")));
		CourseDD.selectByVisibleText("Java");
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.findElement(By.id("name")).sendKeys("hello");
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Frames Practice']"))).click().build().perform();
		driver.findElement(By.id("name")).sendKeys("Hello");

	}

}
