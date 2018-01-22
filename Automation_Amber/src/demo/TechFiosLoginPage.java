package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosLoginPage {
    WebDriver driver;
	
	public TechFiosLoginPage(WebDriver ldriver){
		
	this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="username")
	WebElement EmailAddress;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//button[starts-with(@class,'btn btn-success block full-width')]")
	WebElement Signin;
	
	public void Techfioslogin(String uName, String pWord){
		
		EmailAddress.sendKeys(uName);
		password.sendKeys(pWord);
		Signin.click();
		
		
	}

}

