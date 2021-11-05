package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		 navigate();
		  enterSalaryForThePersonSchinTendulkar();
		 //fromPersonRahulDravidTheNext2ndRecordEnterSalary();
		// makeStatusAsActiveForIndianFreedomFighter();
		 //fromSachinTendulkarPrevious2ndRecordMakeStatusActive();
		// basedOnRefOfSalaryFieldInSachinTendulkarRecordIdentifyTable();
		// basedOnTableReferencesEnterSalaryOn4thRecord();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("file:///E:/XPathAxes_27th_OCT_2021/WebTableHTML.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void enterSalaryForThePersonSchinTendulkar()
	{
		
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
		
	}
	static void fromPersonRahulDravidTheNext2ndRecordEnterSalary()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("15000");
	}
	static void makeStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();
	}
	static void fromSachinTendulkarPrevious2ndRecordMakeStatusActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[3]/td[1]/input")).click();
	}
	static void basedOnRefOfSalaryFieldInSachinTendulkarRecordIdentifyTable()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
		String val=oEle.getAttribute("id");
		System.out.println(val);
	}
	static void basedOnTableReferencesEnterSalaryOn4thRecord()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("25000");
	}
	
}
