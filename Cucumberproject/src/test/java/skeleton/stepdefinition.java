package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepdefinition {
	
	
  Person Sean=new Person();
	
	
	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer int1) {
	    Sean.setdistance(int1);
	}

	@When("Sean Shouts {string}")
	public void sean_Shouts(String string) {
	  Sean.setmessage(string);
	}

	@Then("Lucia {string} to message")
	public void lucia_listens_to_message(String flag) {
	
	if(flag.contentEquals("listens"))
	{
String message=Sean.getmessage();
Assert.assertEquals("Free Coffee",message);
	}
else if(flag.contentEquals("cannot listens"))
{
	String message =Sean.getmessage();
	Assert.assertEquals("CANNOT HEAR ",message);

}
}
}
