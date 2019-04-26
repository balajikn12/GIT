package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Addtocart {
	
	
	
	
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")
	public static WebElement loginbutton;
	
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[1]/button")
	public static WebElement AddProduct;
	
	@FindBy(how=How.ID,using="categorydropid")
	public static WebElement Categories;
	
	public static void catogory()
	{
		Select s1 = new Select(Categories);
		s1.selectByValue("11290");
	}
	
	

	@FindBy(how=How.ID,using="subcategorydropid")
	public static WebElement subcategory;
	
	public static void subcategory()
	{
		Select s2 =new Select(subcategory);
		s2.selectByValue("112112");
	}
	
	@FindBy(how=How.CSS,using="option[value=11290]")
	public static WebElement Electronics;
	
	
	
	@FindBy(how=How.CSS,using="option[value=112112]")
	public static WebElement Laptops;
	

	@FindBy(how=How.ID,using="priceid")
	public static WebElement Price;
	
	@FindBy(how=How.ID,using="prodid")
	public static WebElement Product;
	@FindBy(how=How.ID,using="brandid")
	public static WebElement Brand;
	
	
	@FindBy(how=How.ID,using="quantityid")
	public static WebElement Quantity;
	
	
	

	
	

	@FindBy(how=How.ID,using="description")
	public static WebElement description;
	@FindBy(how=How.CSS,using="input[type='submit']")
	public static WebElement  submit;
}




	
