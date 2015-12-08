package AllSaticPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.log4j.*;

import Main.ExcelIntegration;

public class Page3 
{
	private static Logger log=Logger.getLogger(Page3.class);
	
	public static void DepartureCity(WebDriver driver)
	{
		   log.info("Invoking the DepartureCity method");
		
		   Select sel4=new Select(driver.findElement(By.name("depart")));
		   
		   log.info("Selecting DepartureCity from drop down");
		   
		    sel4.selectByVisibleText("New York");
	}

	public static void departureDate(WebDriver driver)
	{
		   log.info("Invoking the Departure date method");
		
		   WebElement element=driver.findElement(By.id("datepicker"));
		   
		   element.click();
		   
		   WebElement element1=driver.findElement(By.linkText("13"));
		   
		   log.info("Selecting the departure date");
		   
		   element1.click();	 
		   	   	    
	}
	

	public static void ArrivalCity(WebDriver driver)
	{
		   log.info("Invoking the ArrivalCity method");
		
		   Select sel5=new Select(driver.findElement(By.name("arrive")));
		   
		   log.info("Selecting ArrivalCity from drop down");
		   
		    sel5.selectByVisibleText("London");
	}
	
	public static void ReturnDate(WebDriver driver)
	{
		   log.info("Invoking the Return date method");
		
		   WebElement element=driver.findElement(By.id("datepicker1"));
		   
		   element.click();
		   
		   WebElement element1=driver.findElement(By.linkText("20"));
		   
		   log.info("Selecting the returning date");
		   
		   element1.click();	 
		   	   	    
	}
	
	
	public static WebElement textbox8(WebDriver driver)
	{
		log.info("Invoking testbox8 method");
		
		WebElement element=driver.findElement(By.id("passengers"));
		
		log.info("Returning testbox8 element");
		
		return element;
		
	}
	
	public static void NumberOfPassengers(WebDriver driver)
	{
		log.info("Invoking Number Of Passengers method");
		
		WebElement element=textbox8(driver);
		
		String no=ExcelIntegration.getData(1,0);
		
		log.info("Entering the Number Of Passengers details");
		
		element.sendKeys(no);
	}
	
	public static WebElement checkbox(WebDriver driver)
	{
		log.info("Invoking checkbox element method");
		
		WebElement element=driver.findElement(By.id("tripcheckbox"));
		
		log.info("Returning checkbox element");
		
		return element;
		
	}
	
	public static void RoundTrip(WebDriver driver)
	{
		log.info("Invoking RoundTrip method");
		
		WebElement element=checkbox(driver);
		
		log.info("Selecting RoundTrip checkbox");
		
		element.click();
	}
	
	public static WebElement radio1(WebDriver driver)
	{
		log.info("Invoking radio1 element method");
		
		WebElement element=driver.findElement(By.id("aisle"));
		
		log.info("Returning radio1 element");
		
		return element;
		
	}
	
	public static void asile(WebDriver driver)
	{
		log.info("Invoking asile method");
		
		WebElement element=radio1(driver);
		
		log.info("Selecting aisle seating");
		
		element.click();
	}
	
	public static WebElement radio2(WebDriver driver)
	{
		log.info("Invoking radio2 element method");
		
		WebElement element=driver.findElement(By.id("window"));
		
		log.info("Returning radio2 element");
		
		return element;
		
	}
	
	public static void window(WebDriver driver)
	{
		log.info("Invoking window method");
		
		WebElement element=radio2(driver);
		
		log.info("Selecting window seating");
		
		element.click();
		
	}
	
	public static WebElement radio3(WebDriver driver)
	{
		log.info("Invoking radio3 element method");
		
		WebElement element=driver.findElement(By.id("none"));
		
		log.info("Returning radio3 element");
		
		return element;
		
	}
	
	public static void none(WebDriver driver)
	{
		log.info("Invoking none method");
		
		WebElement element=radio3(driver);
		
		log.info("Selecting none seating");
		
		element.click();
	}
	
	public static WebElement radio4(WebDriver driver)
	{
		log.info("Invoking radio4 element method");
		
		WebElement element=driver.findElement(By.id("business"));
		
		log.info("Returning radio4 element");
		
		return element;
		
	}
	
	public static void businessClass (WebDriver driver)
	{
		log.info("Invoking business class method");
		
		WebElement element=radio4(driver);
		
		log.info("Selecting business class");
		
		element.click();
	}
	
	public static WebElement radio5(WebDriver driver)
	{
		log.info("Invoking radio5 element method");
		
		WebElement element=driver.findElement(By.id("first"));
		
		log.info("Returning radio5 element");
		
		return element;
		
	}
	
	public static void firstClass (WebDriver driver)
	{
		log.info("Invoking business class method");
		
		WebElement element=radio5(driver);
		
		log.info("Selecting first class");
		
		element.click();
	}
	
	public static WebElement radio6(WebDriver driver)
	{
		log.info("Invoking radio6 element method");
		
		WebElement element=driver.findElement(By.id("economy"));
		
		log.info("Returning radio6 element");
		
		return element;
		
	}
	
	public static void economyClass (WebDriver driver)
	{
		log.info("Invoking economy class method");
		
		WebElement element=radio6(driver);
		
		log.info("Selecting economy class");
		
		element.click();
	}
	
	public static WebElement next2(WebDriver driver)
	{
		log.info("Invoking next2 element method");
		
		WebElement element=driver.findElement(By.id("confirm"));
		
		log.info("Returning submit button element");
		
		return element;
		
	}
	
	public static void submit(WebDriver driver)
	{
		log.info("Invoking submit method");
		
		WebElement element=next2(driver);
		
		log.info("Clicling on submit button");
		
		element.click();
	}
}


