package util;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	
static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url){
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "../WordpressDemo/drivers/geckodriver.exe");
			
			ProfilesIni profile = new ProfilesIni();
			FirefoxProfile myProfile = profile.getProfile("default");
			DesiredCapabilities dc = DesiredCapabilities.firefox();
			dc.setCapability(FirefoxDriver.PROFILE, myProfile);
			dc.setCapability("marionette", true);
			
			driver = new FirefoxDriver(dc);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "../WordpressDemo/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
			driver= new ChromeDriver();
		}
		
		driver.get(url);		
		return driver;
	}
	

}
