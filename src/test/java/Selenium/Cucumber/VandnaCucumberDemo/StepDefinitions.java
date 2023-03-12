package Selenium.Cucumber.VandnaCucumberDemo;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefinitions
 {
WebDriver driver;
   
    @Given("Open anyBrowser and type URL")
    public void open_any_browser_and_type_url() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	driver = new FirefoxDriver();
    	driver.get("https://phptravels.com/demo/");
    	Thread.sleep(3000);
    }

    @When("user type invalid test data into all editboxes")
    public void typeinvalidtestdata() throws Exception {
    	
    driver.findElement(By.name("first_name")).sendKeys("test");
    Thread.sleep(2000);
    driver.findElement(By.name("last_name")).sendKeys("Test1");
    Thread.sleep(2000);
    driver.findElement(By.name("business_name")).sendKeys("vani");
    Thread.sleep(2000);
    driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
    
 
   
    
    		
    
    
        
    }

    @Given("get the numbers")
    public void get_the_numbers() {
    	String a = driver.findElement(By.id("numb1")).getText();
        String  b = driver.findElement(By.id("numb2")).getText();
        
        

     
    }

    @Given("addition the above two numbers and type into Results editboxes")
    public void addition_the_above_two_numbers_and_type_into_results_editboxes() {
    	String a = driver.findElement(By.id("numb1")).getText();
        String  b = driver.findElement(By.id("numb2")).getText();
        
    	Integer c = Integer.parseInt(a)+Integer.parseInt(b);
    	driver.findElement(By.id("number")).sendKeys(c.toString());
    	
    	
    	
    	
    }

    @When("click on Submit button")
    public void click_on_submit_button() {
      driver.findElement(By.id("demo")).click();
    }

    @Then("get the thank you message and print into console")
    public void get_the_thank_you_message_and_print_into_console() throws Exception {
       driver.findElement(By.cssSelector("p.text-center.cw")).getText();
       Thread.sleep(2000);
       System.out.println(driver.findElement(By.cssSelector("p.text-center.cw")).getText());
    }
        


}
