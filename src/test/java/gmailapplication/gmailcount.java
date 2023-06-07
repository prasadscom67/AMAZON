package gmailapplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmailcount {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1712022500%3A1681150310511222&ifkv=AQMjQ7ThO3-kdtvAbRrxgEQP9vKgx64codYGVNudxCtuGuYmtL7rEAEj4qRYGM6QqK9zFgtHuJtQHw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("anushna199@gmail.com");

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		

		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("KamAnu@6");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		
		
		List<WebElement> mailcount= driver.findElements(By.xpath("//div[@id=':kj']/span[@class='Dj']"));
		
		System.out.println(mailcount.size());
		
		driver.findElement(By.xpath("//div[@id=':2k']")).click();
		
		driver.findElement(By.xpath("//div[@class='ar9 T-I-J3 J-J5-Ji']")).click();
		
		
		
	}

}
