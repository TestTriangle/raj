package Main;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import AllSaticPages.*;

public class PageObjectModelTest
{
	
private WebDriver driver;

private static Logger log=Logger.getLogger(PageObjectModelTest.class);
	
	public WebDriver getDriver()
	{
		return driver;
	}

	@BeforeClass
	public void setUp() throws Exception 
	{
		log.info("INVOKING THE BEFORE CLASS METHOD");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();
	
PropertyConfigurator.configure("C:\\Users\\MAHESH\\Desktop\\2\\mahe\\src\\test\\resources\\log4j.properties");


log.info("CLOSING THE BEFORE CLASS METHOD");

}
	

	@Test
	
	public void test1() throws InterruptedException
	{
		log.info("THIS IS THE START OF THE TEST1 METHOD OF PAGE OBJECT MODEL TEST CLASS");
		
		driver.get("http://localhost/app/index.html");
		
		// PAGE 1
		
		Page1.confimation(driver);
		
		Thread.sleep(2000);
		
		Page1.click(driver);
		
		Thread.sleep(2000);
		
		
		//PAGE 2
		
		Page2.forename(driver);
		
		Thread.sleep(2000);
		
		Page2.surname(driver);
		
		Thread.sleep(2000);
		
		Page2.male(driver);
		
		Thread.sleep(2000);
		
		Page2.address1(driver);
		
		Thread.sleep(2000);
		
		Page2.address2(driver);
		
		Thread.sleep(2000);
		
		Page2.city(driver);
		
		Thread.sleep(2000);
		
		Page2.postalcode(driver);
		
		Thread.sleep(2000);
		
	    Page2.telephone(driver);
		
		Thread.sleep(2000);
		
		Page2.country(driver);
		
		Thread.sleep(2000);
		
		Page2.submit(driver);
		
		Thread.sleep(2000);
		
		//PAGE 3
		
	    Page3.DepartureCity(driver);
		
		Thread.sleep(2000);
		
		Page3.departureDate(driver);
		
		Thread.sleep(2000);
		
		Page3.ArrivalCity(driver);
		
		Thread.sleep(2000);
		
		Page3.ReturnDate(driver);
		
		Thread.sleep(2000);
		
		Page3.NumberOfPassengers(driver);
		
		Thread.sleep(2000);
		
		Page3.RoundTrip(driver);
		
		Thread.sleep(2000);
		
		Page3.asile(driver);
		
		Thread.sleep(2000);
		
		Page3.firstClass(driver);
		
		Thread.sleep(2000);
		
		Page3.submit(driver);
		
		Thread.sleep(2000);
		
		//PAGE 4
		
		Page4.creditCard(driver);
		
		Thread.sleep(2000);
		
		Page4.creditcardName(driver);
		
		Thread.sleep(2000);
		
		Page4.creditcardMonth(driver);
		
		Thread.sleep(2000);
		
		Page4.creditcardYear(driver);
		
		Thread.sleep(2000);
		
		Page4.securityCode(driver);
		
		Thread.sleep(2000);
		
		Page4.payNow(driver);
		
		Thread.sleep(2000);
		
		//PAGE 5
		
		Page5.home(driver);
	}
	
	   
	
	 
	
	@AfterClass
	public void tearDown() throws Exception 
	{
		driver.quit();

	}
}