package PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class scenario1 {
	WebDriver driver;
	

	public scenario1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[4]/a") WebElement dealers;
	 
	 @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[4]/div/ul/li[1]/div/ul/li/div/ul/li[1]/a") WebElement postproperty;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div/div[2]/div/div[2]/span") WebElement rent;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/div/label") WebElement  commercial;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/div/div[3]/div/div[3]/span")WebElement plot;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div[3]/div/div[2]/div/div[1]/span") WebElement commercialland;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div[5]/div/div[2]/div/input") WebElement phnno;
	 
	 public void dealers_click() {
		 dealers.click();
	 }
	 
	 public void post_property() {
		 postproperty.click();
	 }
	 
	 public void basic_details() {
		 rent.click();
	 }
	 
	 public void comm_click() {
		 commercial.click();
	 }

	 public void plot_click() {
		 plot.click();
	 }
	 public void com_land() {
		 commercialland.click();
	 }
	 public void phn(String phno) {
		 phnno.sendKeys(phno);
		 
	 }
}