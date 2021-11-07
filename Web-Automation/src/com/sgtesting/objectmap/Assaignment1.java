package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assaignment1 {
public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}

		static void launchBrowser()
		{
			try
			{
				String path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
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
		static void createUser()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("usercreation")).click();
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationadduser")).click();
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationfirstname")).sendKeys("user1");
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationlastname")).sendKeys("demo1");
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationemail")).sendKeys("demo1@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationusername")).sendKeys("user1");
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationPassword")).sendKeys("12345");
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("usercreationRetypePassword")).sendKeys("12345");
				Thread.sleep(2000);				
				oBrowser.findElement(objectmap.getLocator("usercreationcreateuserbutton")).click();
				Thread.sleep(2000);				
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		static void deleteUser()
		{
			try
			{
				oBrowser.findElement(objectmap.getLocator("userdeleteselectinguser")).click();
				Thread.sleep(2000);
				oBrowser.findElement(objectmap.getLocator("userdeletebutton")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String str=oAlert.getText();
				System.out.println(str);
				oAlert.accept();
				Thread.sleep(3000);
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

