package testNg;

import org.testng.annotations.Test;
// it executes based on method name alphabetic order 
//not a desired order cant follow naming convention order may change still so 
//will go for priority keyword in @test annotation it accepts integer value


public class DriveAcar {
	@Test(priority=0)
	public void startcar()
	{
		System.out.println("start the car");
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
