package Seleniumpractice2023;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderhyr {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		/*
		 * // first calender int day =30;
		 * //driver.findElement(By.id("first_date_picker")).click();
		 * 
		 * //driver.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']//a[text()="+ day +"]")).click();
		 * 
		 * // second calender driver.findElement(By.id("second_date_picker")).click();
		 * 
		 * 
		 * driver.findElement(By.
		 * xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class, ' ui-datepicker-other-month '))]/a[text()="
		 * +day +"]")).click();
		 */

		String targetdate = "20-jun-2024";
		Calendar calender = Calendar.getInstance();

		try {
			SimpleDateFormat dateformatted = new SimpleDateFormat("dd-MMM-yyyy");
			// valid or invalid data check
			dateformatted.setLenient(false);
			Date formattedtargetdate = dateformatted.parse(targetdate);
			calender.setTime(formattedtargetdate);
		}
			catch (Exception e) {
                
				throw new Exception("invalid data provided");

			}
			int tagetmonth = calender.get(calender.MONTH);
			int tagetyear = calender.get(calender.YEAR);

			
			// first calender

			driver.findElement(By.id("first_date_picker")).click();
			String currentdate = driver.findElement(By.className("ui-datepicker-title")).getText();
             System.out.println(currentdate);
			calender.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
			int currentmonth = calender.get(calender.MONTH);
			int currentyear = calender.get(calender.YEAR);
			int targetday =  calender.get(calender.DAY_OF_MONTH);
			
			while(currentmonth< tagetmonth || currentyear< tagetyear ) {
				
			driver.findElement(By.xpath("//span[text()='Next']")).click();
				 currentdate = driver.findElement(By.className("ui-datepicker-title")).getText();

				calender.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
				 currentmonth = calender.get(calender.MONTH);
				 currentyear = calender.get(calender.YEAR);	
				
				
			}
			driver.findElement(By.xpath( "//table[@class='ui-datepicker-calendar']//a[text()="+targetday  +"]")).click();

		} 

	}

