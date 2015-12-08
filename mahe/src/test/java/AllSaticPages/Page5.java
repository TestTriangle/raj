package AllSaticPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.log4j.*;

public class Page5 
{
	private static Logger log=Logger.getLogger(Page5.class);
	
	public static WebElement checkbox(WebDriver driver)
	{
		log.info("Invoking checkbox element method");
		
		WebElement element=driver.findElement(By.id("home"));
		
		log.info("Returning checkbox element");
		
		return element;
		
	}
	
	public static void home(WebDriver driver)
	{
		log.info("Invoking home method");
		
		WebElement element=checkbox(driver);
		
		log.info("clicking on Home button");
		
		element.click();
		
		log.info("FINISHED EXECUTING THE WHOLE APPLICATION");
	}

}
