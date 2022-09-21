package com.sgtesting.AutomationwithoutFindelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldwideweblinks {
public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launch();
		Navigate();
		links();
	}
	private static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ECLIPSETOOL\\eclipse\\ExampleAutomation\\Automation\\Web-Automation\\library\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Navigate()
	{
		try
		{
			obrowser.get("https://en.wikipedia.org/wiki/WorldWideWeb");
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void links()
	{
		try
		{
			List<WebElement> olinks=obrowser.findElements(By.xpath("//a[@href]"));
			/*for(int i=0;i<olinks.size();i++)
			{
				String link=olinks.get(i).getText();
				System.out.println(link);
			}*/
			int y=olinks.size();
			System.out.println(y);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}



}
