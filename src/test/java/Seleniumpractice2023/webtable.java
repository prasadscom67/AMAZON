package Seleniumpractice2023;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(800);
		// no of rows in a table
		//table[@id='customers']//tr/td
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		for (WebElement row : rows) {
			Thread.sleep(300);	
			List<WebElement> columns = row.findElements(By.xpath("//td"));
			System.out.println(columns.size());
			for (WebElement column : columns) {
				
				System.out.println(column.getText());
				
				
				
			}
			
			
			
		}
		
		
	
		
		
	}

}
