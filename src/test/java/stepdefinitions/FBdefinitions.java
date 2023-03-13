package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBdefinitions {
	WebDriver driver;
	@Given("Open any browser with fb URL")
	public void browseropen() throws Exception {
		driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	}
	@When ("User type invalid username")
	public void typeinvalidtestdata() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("abc12!@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("ansbsbdd");
		
	}
	
	//@When("User type invalid {string} and {string}")
	//public void user_type_invalid_and(String username, String passwd) {
		//driver.findElement(By.name("email")).sendKeys("abc12!@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("ansbsbdd");
		
	//}

	//@Then("System should display {string} message")
	//public void system_should_display_message(String msg) {
	  //  String errmsg = driver.findElement(By.className("_9ay7")).getText();
	   // Assert.assertTrue(errmsg.contains(msg));
	//}
	
@And ("click on login button")
public void clickonloginbutton() {
	driver.findElement(By.name("login")).click();
}
@Then ("System should display error message")
		public void validationerrormessage() {
	if(driver.findElement(By.linkText(" Find your account and log in ")).getText().contains("Find your account and log in ")) {
	System.out.println("Given credentials were invalid");
} else {
	System.out.println("Given credentials were valid");
	
	
	}
	
}
}
