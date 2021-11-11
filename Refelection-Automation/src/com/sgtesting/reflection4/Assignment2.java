package com.sgtesting.reflection4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2{

	public static WebDriver oBrowser=null;
	public static MainPmg oPage=null;

	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new MainPmg(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
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
	public static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogIn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimize()
	{
		try
		{
			oPage.minimizeFlyoutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void createUser1()
	{
		try
		{
			oPage.clickOnUsers().click();
			Thread.sleep(2000);
			oPage.addUsers().click();
			Thread.sleep(2000);
			oPage.clickOnFirstName().sendKeys("user1");
			oPage.clickOnLastname().sendKeys("Demo1");
			oPage.userNameFelid().sendKeys("user1");
			oPage.emailFeild().sendKeys("user1@gmail");
			oPage.pass().sendKeys("1234567890");
			oPage.retypePass().sendKeys("1234567890");
			oPage.submitButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyUser()
	{
		try
		{
			oPage.clickModiUser1().click();
			Thread.sleep(2000);
			oPage.fnameUser1().clear();
			
			oPage.fnameUser1().sendKeys("mahi");
			oPage.saveChanges().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			
		}
	}
	public static void deleteUser()
	{
		try
		{
			oPage.d1User1().click();
			Thread.sleep(2000);
			oPage.d2User1().click();
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
	public static void closeApplication()
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
