package com.sgtesting.reflection4;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

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
	public static void createCustomer()
	{
		try
		{
			oPage.getClickOnTasks().click();
			Thread.sleep(2000);
			oPage.getAddnewButton().click();
			Thread.sleep(2000);
			oPage.getCeateNewcustomer().click();
			Thread.sleep(2000);
			oPage.getWriteCustomerName().sendKeys("Customer1");
			oPage.getCreateButton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createProject()
	{
		try
		{
			oPage.getAddnewButton().click();
			Thread.sleep(2000);
			oPage.getNewProjectButton().click();
			Thread.sleep(2000);
			oPage.getPNameField().sendKeys("Paroject1");
			oPage.getCreatePButton().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createTask()
	{
		try
		{
			oPage.getAddTaskButton().click();
			Thread.sleep(2000);
			oPage.getCreateTask().click();
			Thread.sleep(2000);
			oPage.getTaskNameField().click();
			Thread.sleep(2000);
			oPage.getTaskNameField().sendKeys("Task1");
			oPage.getCreateTaskButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteTask()
	{
		try
		{
			oPage.getClickOnCheckBox().click();
			Thread.sleep(2000);
			oPage.getClickTask().click();
			Thread.sleep(2000);
			oPage.getTaskActionButton().click();
			Thread.sleep(2000);
			oPage.getTaskDelete().click();
			Thread.sleep(2000);
			oPage.getConfirmTaskDelete().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteProject() 
	{
		try 
		{
			oPage.getSettingButton().click();
			Thread.sleep(2000);
			oPage.getPActionButton().click();
			Thread.sleep(2000);
			oPage.getProjectDelete1().click();
			Thread.sleep(2000);
			oPage.getProjectDelete2().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void deleteCustomer()
	{
		try
		{
			oPage.getdeleteButton().click();
			Thread.sleep(2000);
			oPage.getActionsButton().click();
			Thread.sleep(2000);
			oPage.getDeleteButton1().click();
			Thread.sleep(2000);
			oPage.getDeleteButton2().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}