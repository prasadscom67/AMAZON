package fbpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import anuglobalmethods.anuglobalmethods;



public class fbpages {
	
	WebElement firstName() {
		return anuglobalmethods.anuElementname("firstname");
	}

	WebElement lastName() {
		return anuglobalmethods.anuElementname("lastnames");
	}

	WebElement mobilenumber() {
		return anuglobalmethods.anuElementxpath("//input[@aria-label='Mobile number or email address']");
	}

	WebElement reentermobilenumber() {
		return anuglobalmethods.anuElementxpath("//input[@aria-label='Re-enter email address']");
	}

	WebElement password() {
		return anuglobalmethods.anuElementid("password_step_input");
	}

	WebElement day()  {		
		return anuglobalmethods.anuElementid("day");
	}

	WebElement month()  {		
		return anuglobalmethods.anuElementid("month");
	}
	
	WebElement year()  {	
		return anuglobalmethods.anuElementid("year");
	}	

	WebElement radiobutton() {
		return anuglobalmethods.anuElementxpath("//label[text()='Female']");
	}

	WebElement signup() {
		return anuglobalmethods.anuElementxpath("//button[@name='websubmit']");
	}

	// setter methods
	
	
	public void doFbLogin() {
	
		firstName().sendKeys("Kamtam");		
		lastName().sendKeys("Anu");
		mobilenumber().sendKeys("anushna765@gmail.com");
		reentermobilenumber().sendKeys("anushna765@gmail.com");
		password().sendKeys("Anu@143");
	}
	
	public void enterdobyr() throws InterruptedException {
		
		Select selobj = new Select(anuglobalmethods.anuElementid("day"));
		Thread.sleep(2000);
		selobj.selectByValue("6");
		Select selobj1 = new Select(anuglobalmethods.anuElementid("month"));
		Thread.sleep(2000);
		selobj1.selectByValue("12");
		Select selobj2 = new Select(anuglobalmethods.anuElementid("year"));
		Thread.sleep(2000);
		selobj2.selectByVisibleText("1993");
		
	}
	public void buttonsignup() {
		radiobutton().click();
		signup().click();
		
	}
	
}
