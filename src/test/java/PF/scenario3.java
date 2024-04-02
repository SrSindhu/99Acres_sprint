package PF;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scenario3 {
	WebDriver driver;
	

	public scenario3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[4]/a") WebElement dealers;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[2]/span") WebElement Research;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[2]/div/ul/li/div/ul/li/a") WebElement Customer;
	
	@FindBy(xpath="//*[@id=\"searchForm\"]") WebElement string;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div/form/input") WebElement enter;
	
	public void dealers_click(){
		dealers.click();
		
	}
	public void Re_search() {
		Research.click();
	}
	
	public void Cus_tomer() {
		Customer.click();
	}
	
	public void string_click() {
		string.click();
	}
	public void enter_click(String agreement) {
		enter.sendKeys(agreement);
		enter.sendKeys(Keys.ENTER);
	}
}
