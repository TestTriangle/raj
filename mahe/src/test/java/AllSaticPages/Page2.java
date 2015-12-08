package AllSaticPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.log4j.*;

import Main.ExcelIntegration;

public class Page2 
{
	private static Logger log=Logger.getLogger(Page2.class);
	
	public static WebElement textbox1(WebDriver driver)
	{
		log.info("Invoking testbox1 method");
		
		WebElement element=driver.findElement(By.id("forenames"));
		
		log.info("Returning testbox1 element");
		
		return element;
		
	}
	
	public static void forename(WebDriver driver)
	{
		log.info("Invoking forename method");
		
		WebElement element=textbox1(driver);
		
		String fore=ExcelIntegration.getData(0,0);
		
		log.info("Entering the forename");
		
		element.sendKeys(fore);
	}

	public static WebElement textbox2(WebDriver driver)
	{
		log.info("Invoking textbox2 method");
		
		WebElement element=driver.findElement(By.id("surename"));
		
		log.info("Returning textbox2 element");
		
		return element;
		
	}
	
	public static void surname(WebDriver driver)
	{
		log.info("Invoking surname method");
		
		WebElement element=textbox2(driver);
		
		String sur=ExcelIntegration.getData(0,1);
		
		log.info("Entering the surname");
		
		element.sendKeys(sur);
	}
	
	public static WebElement radio1(WebDriver driver)
	{
		log.info("Invoking radio1 method");
		
		WebElement element=driver.findElement(By.id("radiom"));
		
		log.info("Returning radio1 element");
		
		return element;
		
	}
	
	public static void male(WebDriver driver)
	{
		log.info("Invoking male method");
		
		WebElement element=radio1(driver);
		
		log.info("Selecting male radio button");
		
		element.click();
	}
	
	public static WebElement radio2(WebDriver driver)
	{
		log.info("Invoking radio2 method");
		
		WebElement element=driver.findElement(By.id("radiof"));
		
		log.info("Returning radio2 element");
		
		return element;
		
	}
	
	public static void female(WebDriver driver)
	{
		log.info("Invoking female method");
		
		WebElement element=radio2(driver);
		
		log.info("Selecting female radio button");
		
		element.click();
	}
	
	public static WebElement textbox3(WebDriver driver)
	{
		log.info("Invoking testbox3 method");
		
		WebElement element=driver.findElement(By.id("address1"));
		
		log.info("Returning testbox3 element");
		
		return element;
		
	}
	
	public static void address1(WebDriver driver)
	{
		log.info("Invoking address1 method");
		
		WebElement element=textbox3(driver);
		
		String add1=ExcelIntegration.getData(0,2);
		
		log.info("Entering the address1 details");
		
		element.sendKeys(add1);
	}
	
	public static WebElement textbox4(WebDriver driver)
	{
		log.info("Invoking testbox4 method");
		
		WebElement element=driver.findElement(By.id("address2"));
		
		log.info("Returning testbox4 element");
		
		return element;
		
	}
	
	public static void address2(WebDriver driver)
	{
		log.info("Invoking address2 method");
		
		WebElement element=textbox4(driver);
		
		String add2=ExcelIntegration.getData(0,3);
		
		log.info("Entering the address2 details");
		
		element.sendKeys(add2);
	}
	
	public static WebElement textbox5(WebDriver driver)
	{
		log.info("Invoking testbox5 method");
		
		WebElement element=driver.findElement(By.id("city"));
		
		log.info("Returning testbox5 element");
		
		return element;
		
	}
	
	public static void city(WebDriver driver)
	{
		log.info("Invoking city method");
		
		WebElement element=textbox5(driver);
		
		String city=ExcelIntegration.getData(0,3);
		
		log.info("Entering the city details");
		
		element.sendKeys(city);
	}
	
	public static WebElement textbox6(WebDriver driver)
	{
		log.info("Invoking testbox6 method");
		
		WebElement element=driver.findElement(By.id("postalcode"));
		
		log.info("Returning testbox6 element");
		
		return element;
		
	}
	
	public static void postalcode(WebDriver driver)
	{
		log.info("Invoking postalcode method");
		
		WebElement element=textbox6(driver);
		
		String post=ExcelIntegration.getData(0,4);
		
		log.info("Entering the postal code details");
		
		element.sendKeys(post);
	}
	
	public static WebElement textbox7(WebDriver driver)
	{
		log.info("Invoking testbox7 method");
		
		WebElement element=driver.findElement(By.id("telephone"));
		
		log.info("Returning testbox7 element");
		
		return element;
		
	}
	
	public static void telephone(WebDriver driver)
	{
		log.info("Invoking telephone  method");
		
		WebElement element=textbox7(driver);
		
		String tele=ExcelIntegration.getData(0,5);
		
		log.info("Entering the telephone number details");
		
		element.sendKeys(tele);
	}
	
	public static void country(WebDriver driver)
	{
		   log.info("Invoking the country method");
		
		   Select sel4=new Select(driver.findElement(By.xpath(".//*[@id='form']/form/select")));
		   
		   log.info("Selecting country from drop down");
		   
		    sel4.selectByVisibleText("Ireland");
	}
	
	public static WebElement next1(WebDriver driver)
	{
		log.info("Invoking next1 element method");
		
		WebElement element=driver.findElement(By.cssSelector("a > #submit"));
		
		log.info("Returning submit button element");
		
		return element;
		
	}
	
	public static void submit(WebDriver driver)
	{
		log.info("Invoking submit method");
		
		WebElement element=next1(driver);
		
		log.info("ClicKing on submit button");
		
		element.click();
	}
    
	
	
	
}
