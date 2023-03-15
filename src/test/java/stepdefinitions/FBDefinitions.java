package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBDefinitions {
	WebDriver driver;

	@Given("Open any browser with fb URL")
	public void browseropen() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	//Thread.sleep(2000);
	@When("user will type valid password")
	public void user_will_type_valid_password() {
		
		driver.findElement(By.name("pass")).sendKeys("vani12345");
	    
	}

	@When("Type invalid username")
	public void type_invalid_username() {
		driver.findElement(By.name("email")).sendKeys("abc!@gmail.comertrt");
	    
	}
		

	

	
	

	@And("user clicks on login button")
	public void clickonloginbutton() {
		driver.findElement(By.name("login")).click();
	}

	@Then("system should display error message")
	public void validationerrormessage() {
		if (driver.findElement(By.linkText("Find your account and log in.")).getText()
				.contains("Find your account and log in.")) {
			System.out.println("Given credentials were invalid");
		} else {
			System.out.println("Given credentials were valid");
		}	
			
			//@When("user will type invalid email and password {string} and {string}")
			//public void test(String email,String password) throws Exception {
				//driver.findElement(By.name("email")).sendKeys(email);
				//Thread.sleep(2000);
				//driver.findElement(By.name("pass")).sendKeys(password);
	}

		@When("user will type valid email")
		public void user_will_type_valid_email() {
			driver.findElement(By.name("email")).sendKeys("abc@gmail.com");  
		}
		@When("Type invalid password")
		public void type_invalid_password() {
			driver.findElement(By.name("pass")).sendKeys("absjbavdvj");
		}
		

		
		
		
		@Then("System should display error message")
		public void test01() {
			if (driver.findElement(By.linkText("Forgot Password?")).getText()
					.contains("Forgot Password?")) {
				System.out.println("Given credentials were invalid");
			} else {
				System.out.println("Given credentials were valid");
			}	
				
		

		
	}
}

