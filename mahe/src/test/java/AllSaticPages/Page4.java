package AllSaticPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.log4j.*;

import Main.ExcelIntegration;

public class Page4 
{
	private static Logger log=Logger.getLogger(Page4.class);
	
	public static WebElement textbox8(WebDriver driver)
	{
		log.info("Invoking testbox8 method");
		
		WebElement element=driver.findElement(By.id("ccnum"));
		
		log.info("Returning testbox8 element");
		
		return element;
		
	}
	
	public static void creditCard(WebDriver driver)
	{
		log.info("Invoking telephone  method");
		
		WebElement element=textbox8(driver);
		
		String card=ExcelIntegration.getData(2,0);
		
		log.info("Entering the creditCard number details");
		
		element.sendKeys(card);
	}

	public static WebElement textbox9(WebDriver driver)
	{
		log.info("Invoking testbox8 method");
		
		WebElement element=driver.findElement(By.id("ccname"));
		
		log.info("Returning testbox9 element");
		
		return element;
		
	}
	
	public static void creditcardName(WebDriver driver)
	{
		log.info("Invoking credit card Name method");
		
		WebElement element=textbox9(driver);
		
		String cnum=ExcelIntegration.getData(2,1);
		
		log.info("Entering the credit card Name details");
		
		element.sendKeys(cnum);
	}
	
	public static void creditcardMonth(WebDriver driver)
	{
		   log.info("Invoking the creditcardMonth method");
		
		   Select sel4=new Select(driver.findElement(By.id("ccmonth")));
		   
		   log.info("Selecting creditcardMonth from drop down");
		   
		    sel4.selectByVisibleText("March");
	}
	
	public static void creditcardYear(WebDriver driver)
	{
		   log.info("Invoking the creditcardYear method");
		
		   Select sel4=new Select(driver.findElement(By.id("ccyear")));
		   
		   log.info("Selecting creditcardYear from drop down");
		   
		    sel4.selectByVisibleText("2016");
	}
	
	public static WebElement textbox10(WebDriver driver)
	{
		log.info("Invoking testbox10 method");
		
		WebElement element=driver.findElement(By.id("ccvc"));
		
		log.info("Returning testbox10 element");
		
		return element;
		
	}
	
	public static void securityCode(WebDriver driver)
	{
		log.info("Invoking securityCode method");
		
		WebElement element=textbox10(driver);
		
		String code=ExcelIntegration.getData(2,2);
		
		log.info("Entering the securityCode details");
		
		element.sendKeys(code);
	}
	
	public static WebElement next4(WebDriver driver)
	{
		log.info("Invoking next4 element method");
		
		WebElement element=driver.findElement(By.id("paynow"));
		
		log.info("Returning next4 button element");
		
		return element;
		
	}
	
	public static void payNow(WebDriver driver)
	{
		log.info("Invoking payNow method");
		
		WebElement element=next4(driver);
		
		log.info("Clicking on paynow button");
		
		element.click();
}
}
