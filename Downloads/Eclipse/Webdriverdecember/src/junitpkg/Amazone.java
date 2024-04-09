package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.junit.platform.commons.support.SearchOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
	ChromeDriver driver;
	String baseurl="https://www.amazon.com";
	@Before

	public void setup() 
		{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	}

	@Test
	public void googlesearch() throws InterruptedException
	{
		Thread.sleep(1000);
		//WebElement search=driver.findElement(By.name("q"));
		//search.sendKeys("Amazone.in",Keys.ENTER);
		//driver.findElement(By.xpath("//span[@class=\"OSrXXb\"]")).click();
		
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
		
		
		
		//driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//a[@id='nav-cart-cart']")).click();
		
	}
}
	
		
	

	
	
		
	




