package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suitebetterway  {
	WebDriver driver;
	long strttime;
	long endtime;
	@BeforeSuite
	public void launchbrowser()
	{
		strttime = System.currentTimeMillis();
	      WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	}
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime=endtime-strttime;
		System.out.println(totaltime);
		
	}
	@Test
	public void opengoogle()
	{
		
		
		driver.get("http://www.google.com");
		
	}
	@Test
	public void openbing()
	{
		
		
		driver.get("http://www.bing.com");
		
	}
	@Test
	public void openyahoo()
	{
		
		driver.get("http://www.yahoo.com");
	}
}
