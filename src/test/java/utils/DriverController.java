package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverController {
	
	private static WebDriver driver;	
	
	public static void setDriver(String browser) {
		switch(browser)
		{
		   case "chrome" : 
			   WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver(); 
			   
		      break; 
		   
		   case "firefox" : 
			   	WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
		      
		      break; 
		   case "internetexplorer" :
			   	WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			      
			      break;
		   default : 
			   WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver(); 
		      
		}
		
		
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	


	
	

}
