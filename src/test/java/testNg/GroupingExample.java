package testNg;

import org.testng.annotations.Test;

public class GroupingExample {
	
	
	/*scenario: A bigbasket is having a diff kind of mobiles.
	 * let us say there are iphone vivo moto lenovo
	 * i want to run tese only for vivo and moto phones wap for that
	 */
	@Test(groups= {"apple"})
	public void iphone()
	{
		System.out.println("iphone1");
	}
	@Test(groups= {"apple"})

	public void iphone1()
	{
		System.out.println("iphone1 testing");
	}

	@Test(groups= {"apple"})

	public void iphonex()
	{
		System.out.println("iphonextesting");
	}

	@Test(groups= {"moto"})
 public void moto1()
	{
		System.out.println("moto1 testing");
	}

	@Test(groups= {"moto"})
	public void moto2()
	{
		System.out.println("moto2 testing");
	}	
	@Test(groups= {"vivo"})
  public void vivo1()
	{
		System.out.println("vivotesting1");
	}

	@Test(groups= {"vivo"})

	public void vivo2()
	{
		System.out.println("vivo2 testing");
	}




}
