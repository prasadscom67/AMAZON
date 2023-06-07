package Seleniumpractice2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v108.browser.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class saucedemo {
	public static WebDriver driver;
	static int numberOfProducts;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		// add the products

//		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
//		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		
		
//		Random rand = new Random();
//		numberOfProducts = rand.nextInt(7);
//		
//		while (numberOfProducts==0) {
//				numberOfProducts = rand.nextInt(7);
//		}
//			
//		
//		
//		System.out.println(numberOfProducts);
//		Thread.sleep(1000);
//		for (int i = 1; i < numberOfProducts ; i++) {
//			List<WebElement> listOfProdcutToBeAddeds = driver.findElements(By.xpath("//div[contains(text(),'Sauce Labs')]"));
//			for (WebElement listOfProdcutToBeAdded : listOfProdcutToBeAddeds) {
//				Thread.sleep(1000);
//				listOfProdcutToBeAdded.click();
//			}
//		}
		
		
		
//		Thread.sleep(1000);
		List<WebElement> listOfbeforeaddedProducts = driver.findElements(By.xpath("//button[text()='Remove']"));
//		if(listOfbeforeaddedProducts.size()>0) {
//			System.out.println("Products are"+numberOfProducts+" added into cart");
//		}
//		else {
//			System.out.println("Products are not added into cart");
//			
//		}
		Thread.sleep(1000);
		ArrayList beforeAddedProducts = new ArrayList();
		for (WebElement listOfbeforeaddedProduct : listOfbeforeaddedProducts) {
			beforeAddedProducts.add(listOfbeforeaddedProduct.getAttribute("id").replaceFirst("remove-", ""));
		}
		//System.out.println("@@@@@@@@@@"+beforeAddedProducts);
		
		// click on cartbag
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		

		Thread.sleep(1000);
		List<WebElement> listOfAfteraddedProducts = driver.findElements(By.xpath("//button[text()='Remove']"));
		ArrayList afterAddedProducts = new ArrayList();
		for (WebElement listOfAfteraddedProduct : listOfAfteraddedProducts) {
			afterAddedProducts.add(listOfAfteraddedProduct.getAttribute("id").replaceFirst("remove-", ""));
		}
		System.out.println("Added products count: "+afterAddedProducts.size());
		Thread.sleep(1000);
		if(afterAddedProducts.size()>0) {		
		if (beforeAddedProducts.size()==afterAddedProducts.size()) {
			if (beforeAddedProducts.equals(afterAddedProducts)) {
				System.out.println("Verified successfully that added all products are available in the cart");
			}
			
		}
	}
		else {
			System.out.println("No product is available in the cart");
		}
		
		
	

		// logout

		driver.findElement(By.id("react-burger-menu-btn")).click();

		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.close();

	}

}
