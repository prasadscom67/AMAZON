package globalMethods;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class globalMethods {
	
	public static WebDriver driver;
	
	public static List<WebElement> getListOfElementsXpath(String Xpath){
		return (List<WebElement>) driver.findElements(By.xpath(Xpath));
	}
	public static WebElement getElementXpath(String Xpath){
		return driver.findElement(By.xpath(Xpath));
	}
	public static WebElement getElementclassName(String className){
		return driver.findElement(By.className(className));
	}
	public static WebElement getElementcssSelector(String cssSelector){
		return driver.findElement(By.cssSelector(cssSelector));
	}
	public static WebElement getElementid(String id){
		return driver.findElement(By.id(id));
	}
	public static WebElement getElementlinkText(String linkText){
		return driver.findElement(By.linkText(linkText));
	}
	public static WebElement getElementName(String name){
		return driver.findElement(By.name(name));
	}
	public static WebElement getElementpartialLinkText(String partialLinkText){
		return driver.findElement(By.partialLinkText(partialLinkText));
	}
	public static WebElement getElementpartialTagName(String tagName){
		return driver.findElement(By.tagName(tagName));
	}
	
	public static void lauchTheBrowser(String URL){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get(URL);
		driver.manage().window().maximize();
		//System.out.println("Broswer has been succefully launched");
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
	
	

}
