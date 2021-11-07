package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assaignment5 {
public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();

	}
	
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("createcustomertasksnavbar")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomeraddnewbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomernewcustomerbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customernamefield")).sendKeys("customer1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customercommitbutton")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("projectaddnewbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectcreationnewprojectbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectcreationnamefield1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectcreationnamefield1")).sendKeys("project1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectcreationcommitbutton")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("projecteditbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectactionbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectdeletebutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectdeletecomfirmationbutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("customereditbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customeractionbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerdeletebutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("customerdeletecomfirmbutton")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void closeApplication()
	{
		
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}

