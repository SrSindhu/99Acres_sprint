package PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scenario2{
	WebDriver driver;
	

	public scenario2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[4]/a")WebElement dealers;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[1]/div/ul/li/div/ul/li[2]/a")WebElement dealerservice;
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div[2]/div[5]/div[1]") WebElement Builderplans;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/span/span/text") WebElement property;
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div[2]/div/div[5]/div[2]/div/span[2]/div/text") WebElement Commercial;
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div[2]/div/button/span/div") WebElement viewplans;
	
	public void dealers_click() {
		dealers.click();
	}
	
	public void dealer_service() {
		dealerservice.click();
	}
	
	public void Builder_plans() {
		Builderplans.click();
		
	}
	
	public void pro_perty() {
		property.click();
	}
	
	public void Comm_ercial() {
		Commercial.click();
	}
	
	public void view_plans() {
		viewplans.click();
	}
	
	
	
	
	
	
	
	
	
}

