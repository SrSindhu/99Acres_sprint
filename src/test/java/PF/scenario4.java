package PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scenario4 {
	WebDriver driver;
	

	public scenario4(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//a[text()='For Dealers / Builders']")WebElement Dealers;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[2]/span") WebElement Advice;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[2]/div/ul/li/div/ul/li/a")WebElement CustomerService;
	
	@FindBy(xpath="/html/body/div[1]/div/section/div/div/div[2]/div[1]")WebElement Callmeback;
	
	public void Dealers_click() {
		Dealers.click();
	}
	
	public void Advice_click() {
		Advice.click();
	}
	
	public void Customer_Service() {
		CustomerService.click();
	}
	
	public void Call_meback() {
		Callmeback.click();
	}
	
	
}