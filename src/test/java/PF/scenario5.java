package PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scenario5{
	WebDriver driver;
	

	public scenario5(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[text()='For Dealers / Builders']") WebElement Dealers;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[2]/span") WebElement Advice;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[2]/div/ul/li/div/ul/li/a") WebElement Service;
	
	@FindBy(xpath="//span[text()='HOME LOANS']") WebElement Homeloans;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div/a[1]/div") WebElement Banks;
	
	@FindBy(xpath="//*[@id=\"banksComponent\"]/div[2]/div[2]/div[1]/div[2]/div[2]/span[2]/a") WebElement Getmethisdeal;
	
	public void Dealers_click() {
		Dealers.click();
	}
	
	public void Ad_vice() {
		Advice.click();
	}
	
	public void Ser_vice() {
		Service.click();
		
	}
	
	public void Home_loans() {
		Homeloans.click();
	}
	public void Banks_click() {
		Banks.click();
	}
	public void Getmethis_deal() {
		Getmethisdeal.click();
	}
}
