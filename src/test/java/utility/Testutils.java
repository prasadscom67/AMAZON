package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import anuglobalmethods.anuglobalmethods;

public class Testutils extends anuglobalmethods {
	
	public static void getScreenshot() throws IOException {
		
	//take screenshot and store it as a file name getscreenshotAs method ,convert in to driver TakesSreenshot interface store in to file object 
		
	// copy the screenshotto desired location using copyfile method
		
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("C:\\Users\\oye\\eclipse-workspace\\fb\\test-output.jpg"));
	
	}
}
