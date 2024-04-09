package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before

	public void setup() 
		{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	}

	@Test
	public void googlesearch()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
	
}





