package AllSaticPages;

import org.apache.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Page1 
{
	private static Logger log=Logger.getLogger(Page1.class);
	
	public static WebElement checkbox(WebDriver driver)
	{
		log.info("Invoking checkbox element method");
		
		WebElement element=driver.findElement(By.id("checkbox"));
		
		log.info("Returning checkbox element");
		
		return element;
		
	}
	
	public static void confimation(WebDriver driver)
	{
		log.info("Invoking confirmation method");
		
		WebElement element=checkbox(driver);
		
		log.info("Selecting checkbox");
		
		element.click();
		
	}
	
	public static WebElement next(WebDriver driver)
	{
		log.info("Invoking next element method");
		
		WebElement element=driver.findElement(By.id("next"));
		
		log.info("Returning next button element");
		
		return element;
		
	}
	
	public static void click(WebDriver driver)
	{
		log.info("Invoking click method");
		
		WebElement element=next(driver);
		
		log.info("Clicking on Next button");
		
		element.click();
	}
}















