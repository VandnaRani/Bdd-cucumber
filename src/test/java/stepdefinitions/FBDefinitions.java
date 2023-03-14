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

	@When("user will type invalid username and password")
	public void typeinvalidtestdata() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("abc12!@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("ansbsbdd");

	}

	@And("user clicks on login button")
	public void clickonloginbutton() {
		driver.findElement(By.name("login")).click();
	}

	@Then("system should display error message")
	public void validationerrormessage() {
		if (driver.findElement(By.className("_9ay7")).getText()
				.contains("The email you entered isn’t connected to an account")) {
			System.out.println("Given credentials were invalid");
		} else {
			System.out.println("Given credentials were valid");
		}}	
			
			@When("user will type invalid email and password {string} and {string}")
			public void test(String email,String password) throws Exception {
				driver.findElement(By.name("email")).sendKeys(email);
				Thread.sleep(2000);
				driver.findElement(By.name("pass")).sendKeys(password);
				Thread.sleep(2000);

		}
	}

