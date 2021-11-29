package com.sgtesting.actitime.scenarios;


import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assaignment4 {
public static WebDriver oBrowser=null;
public static Logger log=Logger.getLogger("Automation...");
	public static String path=System.getProperty("user.dir");
	
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	
	
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			log.info(path);
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
			log.info("the browser has launched successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=2)
	public void navigate()
	{
		try
		{
			log.info(path);
			oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			log.info("navigated successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=3,dataProvider = "credentails")
	public void login(String user,String pwd)
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys(user);
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys(pwd);
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(5000);
			log.info("admin logged in successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
			log.info("minimizeFlyOutWindow successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=5,dataProvider = "credentails1")
	public void createCustomer(String cust)
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("createcustomertasksnavbar")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomeraddnewbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomernewcustomerbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customernamefield")).sendKeys(cust);
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customercommitbutton")).click();
			Thread.sleep(4000);
			log.info("customer created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=6,dataProvider = "credentails2")
	public void modifyCustomer(String cust1)
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("customereditbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customernamefield1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customernamefieldedit")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customernamefieldedit")).sendKeys(cust1);
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customereditbutton")).click();
			Thread.sleep(4000);
			log.info("modified customer successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	public void deleteCustomer()
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("customereditbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customeractionbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerdeletebutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerdeletecomfirmbutton")).click();
			Thread.sleep(4000);
			log.info("customer deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=8)
	public void logout()
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
			log.info("admin logged out successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=9)
	public void closeApplication()
	{
		
		try
		{
			log.info(path);
			oBrowser.quit();
			log.info("the browser has closed successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@DataProvider(name="credentails")
	public Object[][] getCredentials()
	{
		return new Object[][] {
			{"admin","manager"},
			
			};
	}
	@DataProvider(name="credentails1")
	public Object[][] getCredentials1()
	{
		return new Object[][] {
			{"customer1"}
			
			};
	}
	@DataProvider(name="credentails2")
	public Object[][] getCredentials2()
	{
		return new Object[][] {
			{"customer2"}
			
			};
	}
}
