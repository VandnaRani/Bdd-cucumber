package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features={"C:\\Users\\uvoja\\639Batch\\VandnaCucumberDemo\\src\\test\\resources\\Features\\cucumber.feature",
					"C:\\Users\\uvoja\\639Batch\\VandnaCucumberDemo\\src\\test\\resources\\Features\\fb_login.feature"},
			
			glue = "stepdefinitions"
			

	)
	public class TestRunner extends AbstractTestNGCucumberTests {

	
	


}