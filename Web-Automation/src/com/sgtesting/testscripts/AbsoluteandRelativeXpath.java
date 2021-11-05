package com.sgtesting.testscripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AbsoluteandRelativeXpath {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//absoluteXpathDemo();
		//relativeXpathUsingUsingTagNameAlone();
		//relativeXpathUsingTagNameWithIndex();
		//relativeXpathUsingTagNameWithAttributeNameAndValue();
		relativeXpathUsingAttributeNameAndValueCombination();
		/*relativeXpathUsingAttributeValueAlone();
		relativeXpathUsingMultipleAttributeNameAndValue();
		relativeXpathUsingMultipleAttributeNameAndValueUsingANDOperator();
		relativeXpathUsingMultipleAttributeNameAndValueUsingOROperator();
		relativeXpathUsingPartialMatchingOfAttributeValue();
		
        relativeXPathUsingTagNameWithAttributeName();
		relativeXPathUsingTagNameWithAttributeName_displayLinkNames();
		relativeXPathUsingTagNameWithAttributeName_clickOnParticularLink();
		relativeXPathUsingTagNameWithAttributeName_PartialText();
		relativeXPathUsingTagNameWithAttributeName_StaleElement();
		
		
		relativeXpathUsingTextContent();
		relativeXpathUsingTextContentAlone();
		relativeXpathUsingPartialMatchingOfTextContents();*/
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("file:///E:/XPATH_26th_OCT_2021/Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void absoluteXpathDemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	static void relativeXpathUsingUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	static void relativeXpathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("user1");
	}
	static void relativeXpathUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='submit']")).click();
	}
	static void relativeXpathUsingAttributeNameAndValueCombination()
	{
		oBrowser.findElement(By.xpath("//*[@name='submit1btn1'")).click();
	}
	static void relativeXpathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='submit1btn1']")).click();
	}
	static void relativeXpathUsingMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='submit'][@type='button']")).click();
	}
	static void relativeXpathUsingMultipleAttributeNameAndValueUsingANDOperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='submit' and @type='button']")).click();
	}
	static void relativeXpathUsingMultipleAttributeNameAndValueUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='submit' OR @type='submitbtn1']")).click();
	}
	static void relativeXpathUsingPartialMatchingOfAttributeValue()
	{
		oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit')]")).click();
	}
	static void relativeXPathUsingTagNameWithAttributeName()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	static void relativeXPathUsingTagNameWithAttributeName_displayLinkNames()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			System.out.println(content);
		}
	}
	
	static void relativeXPathUsingTagNameWithAttributeName_clickOnParticularLink()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		olinks.get(2).click();
	}
	
	static void relativeXPathUsingTagNameWithAttributeName_PartialText()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.endsWith("Tool"))
			{
				link.click();
				break;
			}
		}
	}
	// org.openqa.selenium.StaleElementReferenceException: stale element reference: 
	//element is not attached to the page document
	static void relativeXPathUsingTagNameWithAttributeName_StaleElement()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.startsWith("Selenium"))
			{
				link.click();
			}
		}
	}
	
	static void relativeXpathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='Eclipse')")).click();
	}
	static void relativeXpathUsingTextContentAlone()
	{
		oBrowser.findElement(By.xpath("//*[text()='Eclipse']")).click();
	}
	static void relativeXpathUsingPartialMatchingOfTextContents()
	{
		oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'Build')]")).click();
	}
	
}
