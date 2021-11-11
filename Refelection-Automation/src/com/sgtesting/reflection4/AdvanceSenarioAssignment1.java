package com.sgtesting.reflection4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceSenarioAssignment1 {
	public static WebDriver oBrowser=null;
	public static ActiTimeAdvanceSenarios oPage=null;
	
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
			oBrowser=new ChromeDriver();
			oPage=new ActiTimeAdvanceSenarios(oBrowser);
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
	public static void loginAdmin1()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("admin");
			oPage.getAdminPassword().sendKeys("manager");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizeFlyWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
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
			oPage.getUsersButton().click();
			Thread.sleep(2000);
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("demo1");
			oPage.getLastName().sendKeys("user1");
			oPage.getEmail().sendKeys("user1@gamil.com");
			oPage.getUserName1().sendKeys("demouser1");
			oPage.getPassWord().sendKeys("user12");
			oPage.getPasswordCopy().sendKeys("user12");
			oPage.getClickOnCreateUserButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createUser2()
	{

		try
		{
			oPage.getUsersButton().click();
			Thread.sleep(2000);
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("demo2");
			oPage.getLastName().sendKeys("user2");
			oPage.getEmail().sendKeys("user2@gamil.com");
			oPage.getUserName1().sendKeys("demouser2");
			oPage.getPassWord().sendKeys("user1234");
			oPage.getPasswordCopy().sendKeys("user1234");
			oPage.getClickOnCreateUserButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createUser3()
	{
		try
		{
			oPage.getUsersButton().click();
			Thread.sleep(2000);
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("demo3");
			oPage.getLastName().sendKeys("user3");
			oPage.getEmail().sendKeys("user3@gamil.com");
			oPage.getUserName1().sendKeys("demouser3");
			oPage.getPassWord().sendKeys("user123456");
			oPage.getPasswordCopy().sendKeys("user123456");
			oPage.getClickOnCreateUserButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logOutAdmin1()
	{
		try
		{
			oPage.getAdminLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginUser1()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("demouser1");
			oPage.getAdminPassword().sendKeys("user12");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void mimizeVideo1()
	{
		try
		{
			oPage.minimizeVideo().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logOutUser1()
	{
		try
		{
			oPage.getAdminLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginUser2()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("demouser2");
			oPage.getAdminPassword().sendKeys("user1234");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void mimizeVideo2()
	{
		try
		{
			oPage.minimizeVideo().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logOutUser2()
	{
		try
		{
			oPage.getAdminLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginUser3()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("demouser3");
			oPage.getAdminPassword().sendKeys("user123456");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void mimizeVideo3()
	{
		try
		{
			oPage.minimizeVideo().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logOutUser3()
	{
		try
		{
			oPage.getAdminLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginAdmin2()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("admin");
			oPage.getAdminPassword().sendKeys("manager");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyUser1Password1()
	{
		try
		{
			oPage.firstStepModifyPasswordSenario().click();
			Thread.sleep(2000);
			oPage.firstUserclickOnIt().click();
			Thread.sleep(2000);
			oPage.getPassWord().sendKeys("user11");
			oPage.getPasswordCopy().sendKeys("user11");
			oPage.saveChangesClickOnIt().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyUser2Password2()
	{
		try
		{
			oPage.secondUserclickOnIt().click();
			Thread.sleep(2000);
			oPage.getPassWord().sendKeys("user22");
			oPage.getPasswordCopy().sendKeys("user22");
			oPage.saveChangesClickOnIt().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyUser3Password3()
	{
		try
		{
			oPage.ThirdUserclickOnIt().click();
			Thread.sleep(2000);
			oPage.getPassWord().sendKeys("user33");
			oPage.getPasswordCopy().sendKeys("user33");
			oPage.saveChangesClickOnIt().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logOutAdmin2()
	{
		try
		{
			oPage.getAdminLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginUser11()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("demouser1");
			oPage.getAdminPassword().sendKeys("user11");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
  public static void logOutUser11()
	{
		try
		{
			oPage.getAdminLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginUser22()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("demouser2");
			oPage.getAdminPassword().sendKeys("user22");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logOutUser22()
	{
		try
		{
			oPage.getAdminLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginUser33()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("demouser3");
			oPage.getAdminPassword().sendKeys("user33");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logOutUser33()
	{
		try
		{
			oPage.getAdminLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginAdmin3()
	{
		try
		{
			oPage.getAdminUserName().sendKeys("admin");
			oPage.getAdminPassword().sendKeys("manager");
			oPage.getAdminLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteUser1()
	{
		try
		{
			oPage.firstStepModifyPasswordSenario().click();
			Thread.sleep(2000);
			oPage.firstUserClickIt().click();
			Thread.sleep(2000);
			oPage.deleteUsers().click();
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
	public static void deleteUser2()
	{
		try
		{
			oPage.firstUserClickIt().click();
			Thread.sleep(2000);
			oPage.deleteUsers().click();
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
	public static void deleteUser3()
	{
		try
		{
			oPage.firstUserClickIt().click();
			Thread.sleep(2000);
			oPage.deleteUsers().click();
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
	public static void logOutAdmin3()
	{
		try
		{
			oPage.getAdminLogout().click();
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
}
