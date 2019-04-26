package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Productorderandpayment {
	
	
	
	
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")
	public static WebElement loginbutton;
	
	
	@FindBy(how= How.PARTIAL_LINK_TEXT,using="All Categories")
	public static  WebElement Categories ; 

	
	@FindBy(how= How.XPATH,using="//*[@id=\"menu3\"]/li[2]/ul/li[1]")
	public static  WebElement Electronics; 
	
	
	
	@FindBy(how = How.ID,using="")
	public static  WebElement Headphone;; 
}
	