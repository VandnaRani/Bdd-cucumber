package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	public class CucumberDefinitions {
		WebDriver driver;
		int c;
	
	 
		
	
	   
	@Given("Open anyBrowser and type URL")
    public void test01() throws Exception {
        // Write code here that turns the phrase above into concrete actions
    	driver = new FirefoxDriver();
    	driver.get("https://phptravels.com/demo/");
    	Thread.sleep(3000);
    }

    @When("user type invalid test data into all editboxes")
    public void test02() {
    driver.findElement(By.name("first_name")).sendKeys("test");
    driver.findElement(By.name("last_name")).sendKeys("Test1");
    driver.findElement(By.name("business_name")).sendKeys("vani");
    driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
    
 
   
    
    		
    
    
        
    }

    @And("get the captcha numbers")
    public void test03() {
    	int a =  Integer.parseInt(driver.findElement(By.id("numb1")).getText());
        int  b = Integer.parseInt(driver.findElement(By.id("numb2")).getText());
        c = a+b;
        
        

     
    }

    @And("combined two captcha numbers and send to captcha editbox")
    public void test04() {
    	System.out.println(c);
    	driver.findElement(By.id("number")).sendKeys(Integer.toString(c));
    	
    	
    	
    }

    @Then("click on Submit button")
    public void test05() throws Exception {
      driver.findElement(By.id("demo")).click();
      Thread.sleep(2000);
    }

    @And("Print Thank you message")
    public void test06() {
       String thankyoumessage = driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div/div[2]/div/div/div/div/div/div/div/div[3]/h2/strong")).getText();
    	 System.out.println("Thankumessage") ;
    	
    	     
    	 }
    @When("user type invalid {string} and {string} and {string} and {string}")
    public void test07(String first_name, String last_name, String business_name, String email) {
		driver.findElement(By.name("first_name")).sendKeys(first_name);
		driver.findElement(By.name("last_name")).sendKeys(last_name);
		driver.findElement(By.name("business_name")).sendKeys(business_name);
		driver.findElement(By.name("email")).sendKeys(email);

      
    }
	}   

    

  //*[@id="content"]/section[1]/div/div/div[2]/div/div/div/div/div/div/div/div[3]/h2/strong
	