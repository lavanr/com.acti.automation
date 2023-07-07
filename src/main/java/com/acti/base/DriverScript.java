package com.acti.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverScript {
public static WebDriver driver;
Properties prop;
public DriverScript()
{
	try
	{
		File file = new file ("./src/test/resources/config/config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		
		}
	catch(Exception e)
	{
		
		System.out.println("unable to load the properties"+e.getMessage());
		e.printStackTrace();
		
	}
	
	public void initApplication()
	
	{
		String browserValue = prop.getProperty("browser");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.out.println("browser in use : "+browserValue);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browserValue.equalsIgnoreCase("edge")) 
		{
			System.out.println("browser in use : "+browserValue);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox")) 
		{
			System.out.println("browser in use : "+browserValue);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
}


	
	
	
	
	
}
