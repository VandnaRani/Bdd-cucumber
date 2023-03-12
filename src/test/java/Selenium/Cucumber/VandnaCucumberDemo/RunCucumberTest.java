package Selenium.Cucumber.VandnaCucumberDemo;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features="/VandnaCucumberDemo/src/test/resources/Selenium/Cucumber/VandnaCucumberDemo/example.feature",
			glue = "stepdefinitions"
			

	)
	public class RunCucumberTest extends AbstractTestNGCucumberTests {

	
	


}