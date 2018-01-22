package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosNewExpensePage {
	WebDriver driver;
	   
	public TechFiosNewExpensePage(WebDriver ldriver){
		this.driver=ldriver; 
}
	@FindBy(how=How.XPATH,using=".//*[@id='select2-account-container']")
	WebElement Account;	

	@FindBy(how=How.XPATH,using=".//*[@id='date']")
	WebElement Date;

	@FindBy(how=How.XPATH,using=".//*[@id='description']")
	WebElement Description;

	@FindBy(how=How.XPATH,using=".//*[@id='amount']")
	WebElement Amount;

	@FindBy(how=How.XPATH,using=".//*[@id='submit']")
	WebElement submit;

	@FindBy(how=How.XPATH,using="html/body/span/span/span[1]/input")
	WebElement enter;
	
	@FindBy(how=How.XPATH,using=".//*[@id='select2-account-container']")
	WebElement tech;
	
	@FindBy(how=How.XPATH,using=".//*[@id='select2-account-result-h35i-techfios']")
	WebElement techf;
	
	
	public void FillingForm() throws InterruptedException    {
		
		Date.sendKeys("");
		Thread.sleep(900);
	    Description.sendKeys("Electricity");
		Amount.sendKeys("300");
		Thread.sleep(900);
		Account.click();enter.sendKeys("techfios");
		submit.click();
			
		


	  }
	
	     }
	

	
		
	

	
		
	

