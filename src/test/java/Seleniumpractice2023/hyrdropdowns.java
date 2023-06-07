package Seleniumpractice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hyrdropdowns {
public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		Select sel = new Select(driver.findElement(By.id("course")));
		sel.selectByIndex(0);
		sel.selectByValue("java");
		sel.selectByVisibleText("Python");
		sel.getOptions();
		sel.getFirstSelectedOption();
		//sel.deselectByIndex(1);
		
		
		
	}

}
