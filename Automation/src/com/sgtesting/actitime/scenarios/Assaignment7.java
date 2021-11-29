package com.sgtesting.actitime.scenarios;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assaignment7 {
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
			log.info("minimized successfully");
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
	public void createProject(String projectname)
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("projectaddnewbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectcreationnewprojectbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectcreationnamefield1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectcreationnamefield1")).sendKeys(projectname);
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectcreationcommitbutton")).click();
			Thread.sleep(2000);
			log.info("project created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6,dataProvider = "credentails3")
	public void createTasks(String task)
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("taskcreationaddnewtaskbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createnewtaskbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("tasknamefield")).sendKeys(task);
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("taskcommitbutton")).click();
			Thread.sleep(4000);
			log.info("task created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=8)
	public void deleteTasks()
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("selectthetask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("taskactionbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("taskdeletebutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("taskcomfirmbutton")).click();
			Thread.sleep(4000);
			log.info("task deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=9)
	public void deleteProject()
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("projecteditbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectactionbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectdeletebutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectdeletecomfirmationbutton")).click();
			Thread.sleep(2000);
			log.info("project deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=10)
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
	
	@Test(priority=11)
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
	
	@Test(priority=12)
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
			{"admin","manager"}
			
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
			{"project1"}
			
			};
	}
	@DataProvider(name="credentails3")
	public Object[][] getCredentials3()
	{
		return new Object[][] {
			{"Task1"}
			
			};
	}
	
}


