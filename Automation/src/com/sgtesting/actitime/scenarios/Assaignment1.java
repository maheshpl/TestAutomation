package com.sgtesting.actitime.scenarios;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assaignment1{
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
				
				String path=System.getProperty("user.dir");
				log.info(path);
				System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
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
				log.info("navigated successfuly");
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
				log.info("admin login successful");
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
				log.info("minimized fly out window");
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		@Test(priority=5,dataProvider = "credentails1")
		public void createUser(String fname,String lname,String emailid,String username,String pwd,String retypepwd)
		{
			try
			{
				log.info(path);
				oBrowser.findElement(objectmap.getLocator("usercreation")).click();
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationadduser")).click();
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationfirstname")).sendKeys(fname);
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationlastname")).sendKeys(lname);
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationemail")).sendKeys(emailid);
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationusername")).sendKeys(username);
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationPassword")).sendKeys(pwd);
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationRetypePassword")).sendKeys(retypepwd);
				Thread.sleep(2000);				
				oBrowser.findElement(objectmap.getLocator("usercreationcreateuserbutton")).click();
				Thread.sleep(2000);				
				log.info("user created succesfully");
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		@Test(priority=6)
		public void deleteUser()
		{
			try
			{
				log.info(path);
				oBrowser.findElement(objectmap.getLocator("userdeleteselectinguser")).click();
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("userdeletebutton")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String str=oAlert.getText();
				System.out.println(str);
				oAlert.accept();
				Thread.sleep(3000);
				log.info("user deleted successfully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=7)
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
		
		@Test(priority=8)
		public void closeApplication()
		{
			
			try
			{
				log.info(path);
				oBrowser.quit();
				log.info("the browser closed successfully");
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
				{"user1","demo1","demo1@gmail.com","user1","12345","12345"}
				
				};
		}
		
		
	}

