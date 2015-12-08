package Main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.log4j.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegration 
{
	public  static XSSFSheet sheet;
	
	public  static XSSFWorkbook book;
	
	public  static XSSFCell cell;
	
	public  static XSSFRow row;
	
	public  static Logger log=Logger.getLogger(ExcelIntegration .class);
	


	
	// getting file path from desktop, name of workbook and work sheet
	
	
	public static void excelFile(String path, String wsheet)
	{
		log.info("Invoking the method which gets the excel file path, Excel book and sheet name");
		
		try
		{
			FileInputStream file=new FileInputStream(path);
			
			 book=new XSSFWorkbook(file);
			
			sheet=book.getSheet(wsheet); 
		}
		
		catch(Exception e)
		{
			System.out.println("The Exception raised is"+ e);
		}
		
		   log.info("closing the method which gets the excel file path, Excel book and sheet name");
	}
	 

	// getting data from Excel sheet
	
	public static String getData(int rownum, int colnum)
	{
		   log.info("Invoking the method which gets the data from excel");
		   
		try
		{
		
			excelFile("C:\\Users\\MAHESH\\Desktop\\2\\mahe\\src\\test\\resources\\Data.xlsx","mahesh");
			
			cell=sheet.getRow(rownum).getCell(colnum);
			
			String cellData=cell.getStringCellValue();
			
			
			
		 return cellData;
		}
		
		catch(Exception e)
		{
			System.out.println("The Exception raised is"+ e);
			
			log.info("Closing the method which gets the data from excel");
			
			 return "";
			 
			 
		}
		
		  
	}
	
	//Writing back the data to excel sheet
	
	public static void setData(String path,String result,int rownum, int colnum )
	{
		
		 log.info("Invoking the method which writes back the data to excel");
		 
		try
		{
			row=sheet.getRow(rownum);
			
			cell=row.getCell(colnum,row.RETURN_BLANK_AS_NULL);
			
			if(cell==null)
			{
				cell=row.createCell(colnum);
				
				cell.setCellValue(result);
			}
			
			else
			{
				cell.setCellValue(result);
			}
		
			FileOutputStream out=new FileOutputStream(path);
			
			book.write(out);
			
			out.flush();
			
			out.close();
			
		}
			
			catch(Exception e)
			{
				System.out.println("The Exception raised is"+ e);
				
			}
		
		log.info("Closing the method which writes back the data to excel");
	}
}