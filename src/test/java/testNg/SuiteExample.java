package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteExample {
	
	//Aim:open chrome and go to
	//1.google.co.in 2.bing.com 3.yahoo.com and then close browser
	@Test
	public void opengoogle()
	{
		long strttime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime=endtime-strttime;
		System.out.println(totaltime);
	
	}
	@Test
	public void openbing()
	{
		long strttime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime=endtime-strttime;
		System.out.println(totaltime);
	}
	@Test
	public void openyahoo()
	{
		long strttime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yahoo.com");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime=endtime-strttime;
		System.out.println(totaltime);
	}

}
