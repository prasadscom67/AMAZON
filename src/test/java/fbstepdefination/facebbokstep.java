package fbstepdefination;

import org.openqa.selenium.WebDriver;

import fbpages.fbpages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public  class facebbokstep {
	public static WebDriver driver = Hooks.driver;
	fbpages fbobj;
	
	//public void launchBrowser();
	
	
	@Given("anu Launch the fb application")
	public void anu_launch_the_fb_application() {
		//String URL = "https://www.facebook.com/r.php?locale=en_GB&display=page";
		//anuglobalmethods.launchBrowser(URL);
		//System.out.println("Broswer has been launched");
	}

	@When("anu provide all the details")
	public void anu_provide_all_the_details() throws InterruptedException {
		System.out.println("I am reached here 3");
		fbobj=new fbpages();
		fbobj.doFbLogin();
		fbobj.enterdobyr();
		fbobj.buttonsignup();
	}

	@Then("anu user is navigated to fb homepage")
	public void anu_user_is_navigated_to_fb_homepage() {
		System.out.println("Broser has been closed");
	}

		



		
	
	

}
