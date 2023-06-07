package fbstepdefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
		
@CucumberOptions(
			features={"src\\test\\resources\\featuresanu\\anush10.feature",
					  //"src\\test\\java\\featuresanu\\anush2.feature"
					},
			
	//features= {"C:\\Users\\oye\\eclipse-workspace\\fb\\src\\test\\java\\featuresanu\\anush.feature"},
	glue={"fbstepdefination"},
	//glue={"fbstepdefination","HooksPackage"},
	//glue={"C:\\Users\\oye\\eclipse-workspace\\fb\\src\\test\\java\\fbstepdefination\\facebbokstep.java"},
			plugin={ "pretty","html:target/cucumber-reports.html"
					//"errorDescription.MyTestListener"
					//"json:Folder_Name/cucumber.json", 
					//"junit:Folder_Name/cucumber.xml"
					//"me.jvt.cucumber.report.prettyReports:target/cucumber"
					//"errorDescription.MyTestListener"
					}
	
	
		
		)
public class FbTestRunner   {
	
	public static String siteURL = "http://wwws.facebook.com/r.php?locale=en_GB&display=page";
	
	

}

