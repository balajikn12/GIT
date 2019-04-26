package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Productorderandpayment;
import testmeapp.utility.Drivers;

public class ProductOrderandPayment {

	
WebDriver driver;
	@Before
	public void insti()
	{
		    driver=Drivers.getDriver("chrome");
			PageFactory.initElements(driver, Productorderandpayment.class);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
			Productorderandpayment.username.sendKeys("Lalitha");
			Productorderandpayment.password.sendKeys("Password123");
			Productorderandpayment.loginbutton.click();
			Productorderandpayment.Categories.click();
		    Productorderandpayment.Electronics.click();
		    
	}
	
	
	/*public void login()
	{
		
		
	Productorderandpayment.username.sendKeys("Lalitha");
	Productorderandpayment.password.sendKeys("Password123");
	Productorderandpayment.loginbutton.click();
    }
	
	*/
	
  @When("Headphone added to Cart")
public void headphone_added_to_Cart() 
{
   
	
	
	
}
@When("Checkout for payment")
public void checkout_for_payment() {
    
}

@When("fills the Transaction Details")
public void fills_the_Transaction_Details() {
    
}

@Then("Product is ordered successfully")
public void product_is_ordered_successfully() {
   

	
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

