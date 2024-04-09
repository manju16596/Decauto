package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before

	public void setup() 
		{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	}

	@Test
	
	public void googlesearch()
	{
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("redbus.in",Keys.ENTER);
		driver.findElement(By.xpath("//h3 [@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"rail_tickets_vertical\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div[3]/div[1]/div[2]/p")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[2]/div[1]/div[3]/button")).click();
		//driver.switchTo().alert().accept();
			

}
}
