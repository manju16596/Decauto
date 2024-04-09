package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeTest
	public void setup()
	{
		System.out.println("beforetest");
	}
	@BeforeTest
	public void urlloading()
	{
		System.out.println("url loading");
	
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
		@Test
		public void test2()
		{
			System.out.println("test2");
		}
		@Test
		public void test3()
		{
			System.out.println("test3");
		}
		@AfterMethod
		public void aftrmthd()
		{
			System.out.println("aftermethod");
		}
		
		public void teardown()
		{
			System.out.println("aftertest");
		}
}
	

