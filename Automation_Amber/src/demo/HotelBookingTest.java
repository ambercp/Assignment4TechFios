package demo;

import java.util.concurrent.TimeUnit;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HotelBookingTest {
@Test
	public void Test() throws InterruptedException{
System.getProperty("os.name").toLowerCase();		
WebDriver driver = new ChromeDriver();
				
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
					
 driver.manage(). timeouts().implicitlyWait(3, TimeUnit.SECONDS);

 driver.get("https://www.priceline.com/");
		 
 driver.manage().window().maximize();
WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='global-header-nav-product-link'][@href='/hotels/']")));

 WebElement Hotels = driver.findElement(By.xpath("//a[@class='global-header-nav-product-link'][@href='/hotels/']"));
 Hotels.click();
 WebDriverWait wait1 = new WebDriverWait(driver, 20);
 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pcln-app']/div/div/section[1]/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/input"))); 

 WebElement checkin = driver.findElement(By.xpath(".//*[@id='pcln-app']/div/div/section[1]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/input"));
checkin.sendKeys("02/10/2018");
WebElement checkout = driver.findElement(By.xpath(".//*[@id='pcln-app']/div/div/section[1]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/input")); 
checkout.sendKeys("02/20/2018");
WebElement destination = driver.findElement(By.xpath(".//*[@id='pcln-app']/div/div/section[1]/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/input"));
destination.sendKeys("Austin,TX");	     

WebElement search = driver.findElement(By.xpath(".//*[@id='pcln-app']/div/div/section[1]/div/div[1]/div/div[4]/button"));	   
search.click();	 

driver.manage().timeouts().implicitlyWait(400,TimeUnit.SECONDS) ;
driver.close();
driver.quit();
}

}
