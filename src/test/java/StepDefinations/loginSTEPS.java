package StepDefinations;

import org.openqa.selenium.WebDriver;
import Pages.loginPO;
import globalMethods.globalMethods;
import io.cucumber.java.en.*;

public class loginSTEPS {

	public static WebDriver driver;
	public loginPO loginPagesObj;
	
//	public static void main(String[] args) throws InterruptedException {
//		loginSTEPS mainObj = new loginSTEPS();
//		
//		mainObj.launch_the_is_open();
//		mainObj.user_is_on_login_page();
//		mainObj.user_verify_all_links();
//	}
	

	public void createObjects() {
		loginPagesObj = new loginPO();
	}

	@Given("Launch the is open")
	public void launch_the_is_open() {
		globalMethods.lauchTheBrowser("https://www.amazon.in");
	}

	@When("user is on login page")
	public void user_is_on_login_page() {
		//System.out.println("I entered into Gherkin");
		loginPO loginPagesObj1 = new loginPO();
		loginPagesObj1.doLoginForAmazon();
	}

	@Then("user verify all links")
	public void user_verify_all_links() throws InterruptedException {
		loginPO loginPagesObj2 = new loginPO();
		loginPagesObj2.veriyFooterLinks();
		globalMethods.tearDown();
	}
	


}
