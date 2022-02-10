package testNg;

import org.testng.annotations.Test;

public class SkipaTest {
	//to skip a test case we use enabled keyword by default value will be true
	
	@Test(priority=0)
	public void startcar()
	{
		System.out.println("start the car");
	}@Test(priority=5,enabled=false)
	public void turnonmusic()
	{
		System.out.println("music on");
	}
	@Test(priority=1)
	public void firstgear()
	{
		System.out.println("first gear");
	}
	@Test(priority=2)
	public void secondgear()
	{
		System.out.println("2nd gear");
	}
	@Test(priority=3)
	public void thirdgear()
	{
		System.out.println("3rd gear");
	}
	@Test(priority=4)
	public void fourthgear()
	{
		System.out.println("4th gear");
	}

}
