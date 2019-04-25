package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Registerpage;
import testmeapp.utility.Drivers;

  
public class RegisterStepDefs {

	 WebDriver driver;
	
	
	@Before
	public void init()
	{
	
	
	 driver=Drivers.getDriver("chrome");
	PageFactory.initElements(driver,Registerpage.class);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@Given("url of the demowebshop")
public void url_of_the_demowebshop() {
   
	 driver.get("http://demowebshop.tricentis.com/register");
}

@When("user enters the data for registration")
public void user_enters_the_data_for_registration() {
  
	   Registerpage.gender.click();
	   Registerpage  .firstname.sendKeys("balaji");
	   Registerpage.lastname.sendKeys("KN");
	   Registerpage.email.sendKeys("askmail11127676@test.com");
	   Registerpage.password.sendKeys("abc123");
	   Registerpage.confirmpassword.sendKeys("abc123");
	   Registerpage.registerbutton.click();
	}


@Then("user is registered successfully")
public void user_is_registered_successfully() 
{
	String msg=  driver.findElement(By.cssSelector("div[class=result]")).getText();
	Assert.assertTrue(msg.contains("register is successfullly completed"));
	
   
}

@After
	public void afterMethod	()
	{
    	  driver.close();
      }
}
