package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Addtocart {
	
	
	
	
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")
	public static WebElement loginbutton;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[1]/button")
	public static WebElement AddProduct;
	
	
	@FindBy(how=How.CSS,using="option[value=11290]")
	public static WebElement Electronics;
	
	
	
	

	
	
	
	
}




	
	
	
	
	
}




class="btn btn-nav"