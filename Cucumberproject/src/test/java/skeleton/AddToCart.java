package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Addtocart;
import testmeapp.utility.Drivers;

public class AddToCart {
	
	  WebDriver driver;
	
	/*@Before
	public void insti()
	{
		   /* driver=Drivers.getDriver("chrome");
			PageFactory.initElements(driver,Addtocart.class);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
	
	*/
	
	
	

@Given("URL of TestMeaApp")
public void url_of_TestMeaApp() {
	
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
   
}
@When("user enters username  for login")
public void user_enters_username_for_login() {
	Addtocart.username.sendKeys("admin");
	Addtocart.password.sendKeys("Password456");
	Addtocart.loginbutton.click();
	
	
	
}



@When("user enters password for login")
public void user_enters_password_for_login() {
	Addtocart.AddProduct.click();
	Addtocart.Categories.click();
	Addtocart.catogory();
	Addtocart.subcategory.click();
	Addtocart.subcategory();
	
	
	Addtocart.Product.sendKeys("hp laptop");
	Addtocart.Price.sendKeys("1000");
	Addtocart.Brand.sendKeys("HP");
	Addtocart.Quantity.sendKeys("2");
	Addtocart.description.sendKeys("ba");
	Addtocart.submit.click();
	
	
}


@Then("user must be loggedin")
public void user_must_be_loggedin() {
  
	String msg=driver.findElement(By.xpath("/html/body/main/div/div/div/form/b/i")).getText();
	Assert.assertTrue(msg.contains("hp laptop is added Succesfully"));
	
}

	/*
	 * @Then("He will add hp laptop to cart") public void
	 * he_will_add_hp_laptop_to_cart() {
	 * 
	 * }
	 */
	


}
