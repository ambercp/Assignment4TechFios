package demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;

public class TechFIosNewExpenseTest {
@Test

public void NewExpense() throws IOException, InterruptedException{
		
WebDriver driver = BrowserFactory.startBrowser("chrome","http://techfios.com/test/billing/?ng=login/");
					
TechFiosLoginPage Techfios = PageFactory.initElements(driver, TechFiosLoginPage.class);
Techfios.Techfioslogin("techfiosdemo@gmail.com","abc123");

TechFiosHomePage Homepage = PageFactory.initElements(driver, TechFiosHomePage.class);
Homepage.clickNewExpense();		

TechFiosNewExpensePage Expense= PageFactory.initElements(driver,TechFiosNewExpensePage.class);
Expense.FillingForm();
	driver.close();
	driver.quit();
			
		}
}
