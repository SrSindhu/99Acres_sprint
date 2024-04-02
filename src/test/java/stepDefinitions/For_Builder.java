package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PF.scenario1;
import PF.scenario2;
import PF.scenario3;
import PF.scenario4;
import PF.scenario5;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class For_Builder {
	WebDriver  driver; 
	@Given("User on 99Acres Home Page")
	public void user_on_99acres_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.99acres.com/";
	    driver.get(url);
	}

	@When("User click on the Dealers button")
	public void user_click_on_the_dealers_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/a")).click();
		scenario1 sc = new scenario1(driver);
		sc.dealers_click();
		
	}

	@When("user click on the post property button")
	public void user_click_on_the_post_property_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[1]/div/ul/li/div/ul/li[1]/a")).click();
		scenario1 sc1 = new scenario1(driver);
		sc1.post_property();
		
	}

	@When("User add the basic details {string}")
	public void user_add_the_basic_details(String string) throws InterruptedException {
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
		scenario1 sc2 = new scenario1(driver);
		sc2.basic_details();
	
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);

		scenario1 sc3 = new scenario1(driver);
		sc3.comm_click();
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);

		scenario1 sc4 = new scenario1(driver);
		sc4.plot_click();
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);

		scenario1 sc5 = new scenario1(driver);
		sc5.com_land();
		

		scenario1 sc6 = new scenario1(driver);
         sc6.phn(string);
	}
	@Then("the property status should be updated successfully")
	public void the_property_status_should_be_updated_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	

    @When("User click on the Dealer services")
	public void user_click_on_the_dealer_services() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//    	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[4]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[1]/div/ul/li/div/ul/li[2]/a")).click();
		scenario2 sc = new scenario2(driver);
		sc.dealers_click();
		sc.dealer_service();
		
	}

	@When("User click Builder plans button")
	public void user_click_builder_plans_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
     	Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"Builder\"]/div[1]")).click();
     	scenario2 sc1 = new scenario2(driver);
     	sc1.Builder_plans();
	}

	@When("User click on the add your property details")
	public void user_click_on_the_add_your_property_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"clickableTextWithoutProperty\"]")).click();
		scenario2 sc2 = new scenario2(driver);
     	sc2.pro_perty();
	}



	@When("User click on the commercial")
	public void user_click_on_the_commercial() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"bos_desk_preference_C\"]/div/span[2]/div")).click();
		scenario2 sc3 = new scenario2(driver);
     	sc3.Comm_ercial();
	}

	@When("User click on the view plans")
	public void user_click_on_the_view_plans() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"bos_desk_viewPlans_button\"]/span/div")).click();
		scenario2 sc4 = new scenario2(driver);
     	sc4.view_plans();

	}

	@Then("Related plans will be visible")
	public void related_plans_will_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
    @When("User click on Dealers")
	public void user_click_on_dealers() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/a")).click();
    	scenario3 sc = new scenario3(driver);
		sc.dealers_click();
		

	}

	@When("User click on Research")
	public void user_click_on_research() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[2]/span")).click();
		//driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		scenario3 sc1 = new scenario3(driver);
		sc1.Re_search();
		

	}

	@When("User go to Customer services")
	public void user_go_to_customer_services() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[2]/div/ul/li/div/ul/li/a")).click();
		
		Thread.sleep(3000);
		scenario3 sc2 = new scenario3(driver);
		sc2.Cus_tomer();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		

	}
	
	@When("User enter {string} in search by keywords box")
	public void user_enter_in_search_by_keywords_box(String string) {
		//driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
//		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div/header/section/div/div/div[2]/form"));
//		search.click();
//		WebElement ele=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/input"));
//		ele.sendKeys(string);
//		ele.sendKeys(Keys.ENTER);
		scenario3 sc3=new scenario3(driver);
		sc3.string_click();
		sc3.enter_click(string);
	
		
    }

	@Then("You can find queries on rental agreement below")
	public void you_can_find_queries_on_rental_agreement_below() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

@When("User click on Dealer")
public void user_click_on_dealer() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	scenario4 sc=new scenario4(driver);
	sc.Dealers_click();

	
}

@When("User click on the Research")
public void user_click_on_the_research() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	scenario4 sc1=new scenario4(driver);
	sc1.Advice_click();

}

@When("User go to Customer service")
public void user_go_to_customer_service() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	scenario4 sc2=new scenario4(driver);
	sc2.Customer_Service();
	driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    Thread.sleep(3000);
}


	
	
   
	@When("User click on call me back")
	public void user_click_on_call_me_back() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		scenario4 sc3=new scenario4(driver);
		sc3.Call_meback();

	}

	@Then("User can give details")
	public void user_can_give_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("User click on the Dealers")
	public void user_click_on_the_dealers() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		scenario5 sc= new scenario5(driver);
		sc.Dealers_click();
	}

	@When("User click on the Advice")
	public void user_click_on_the_advice() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		scenario5 sc1= new scenario5(driver);
        sc1.Ad_vice();
	}

	@When("User click on the Customer")
	public void user_click_on_the_customer() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		scenario5 sc2= new scenario5(driver);
        sc2.Ser_vice();    
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(3000);
	}

	@When("User click on Homeloans")
	public void user_click_on_homeloans() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		scenario5 sc3= new scenario5(driver);
		sc3.Home_loans();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	    Thread.sleep(3000);

	}

	@When("User click on Banks")
	public void user_click_on_banks() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		scenario5 sc4= new scenario5(driver);
		sc4.Banks_click();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	    Thread.sleep(3000);

	}

	@When("User click on the getmethisdeal")
	public void user_click_on_the_getmethisdeal() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		scenario5 sc5= new scenario5(driver);
		sc5.Getmethis_deal();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	    Thread.sleep(3000);

	}

	@Then("User needs to submit details")
	public void user_needs_to_submit_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}






}