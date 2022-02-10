package testNg;

import org.testng.annotations.Test;

public class DependenciesManagement {

	//problem1:you have to admit a student to engineering
	//problem2:you have admit std to higher secondary
	//setting priority doesnt makes sense here
	
	//in work env will face these if most critical 
	//com[ponent fails dependents methods shld fail
	@Test
	public void tenth() {
		System.out.println("tenth std");
	}
	@Test(dependsOnMethods="tenth")
	public void twelth() {
		System.out.println("12th std");
	}
	@Test(dependsOnMethods="twelth")
	public void engineering() {
		System.out.println("enineering std");
	}

}
