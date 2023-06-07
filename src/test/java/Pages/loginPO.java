package Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import globalMethods.globalMethods;

public class loginPO {
	WebDriver driver;

// All getter Methods	
	WebElement getSignIn() {
		return globalMethods.getElementXpath("//span[text()='Hello, sign in']");
	}

	WebElement getUserName() {
		return globalMethods.getElementid("ap_email");
	}

	WebElement getPassword() {
		return globalMethods.getElementid("ap_password");
	}

	WebElement getContinueBtn() {
		return globalMethods.getElementid("continue");
	}

	WebElement getSubmitBtn() {
		return globalMethods.getElementid("signInSubmit");
	}

	WebElement getLinks() {

		return globalMethods.getElementXpath("//a");
	}
	
	WebElement getFooterLinksHeader() {

		return globalMethods.getElementXpath("//div[@class='navFooterLinkCol navAccessibility']");
	}
	
	List<WebElement> getFooterLinksHeaderNames() {

		//List<WebElement> footerHeads =
		//return footerHeads;
		return globalMethods.getListOfElementsXpath("//div[@class='navFooterLinkCol navAccessibility']/div[@class='navFooterColHead']");
	}
	
	List<WebElement> getFooterLinks(String headerName) {

		return globalMethods.getListOfElementsXpath("//div[text()='"+headerName+"']/following-sibling::ul/li/a");
	}


//Setter Methods

	public void doLoginForAmazon() {
		getSignIn().click();
		getUserName().sendKeys("anushna622@gmail.com");
		getContinueBtn().click();
		getPassword().sendKeys("Anushna@06");
		getSubmitBtn().click();
		//System.out.println("Application has been succefully logged in");

	}

	
	public void veriyFooterLinks() throws InterruptedException {
		Thread.sleep(500);
		String headerName = "";
		List<WebElement> footerLinks = null;
		List<WebElement> listOfHeadersNames = null;
		listOfHeadersNames = getFooterLinksHeaderNames();
		Thread.sleep(500);
		for (WebElement listOfHeadersName : listOfHeadersNames) {
			Thread.sleep(500);
			headerName = listOfHeadersName.getText();
			System.out.println("**************** THIS IS HEADER: "+headerName);
			footerLinks = getFooterLinks(headerName);
			for (WebElement footerLink : footerLinks) {
				System.out.println(footerLink.getText());;
			}
		}
	
	}

}
