package Seleniumpractice2023;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.name("firstname")).sendKeys("kamtam");
		driver.findElement(By.name("lastname")).sendKeys("Anu");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"))
				.sendKeys("anushna765@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("anushna765@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Anu@143");

		Thread.sleep(2000);

		Select selobj = new Select(driver.findElement(By.id("day")));

		selobj.selectByValue("6");

		Select selobj1 = new Select(driver.findElement(By.id("month")));

		selobj1.selectByValue("12");

		Select selobj2 = new Select(driver.findElement(By.id("year")));
		selobj2.selectByVisibleText("1993");

		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(3000);
		alert.accept();
		
		

	}

}
