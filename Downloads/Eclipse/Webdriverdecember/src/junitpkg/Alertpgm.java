package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/DELL/Downloads/manjuz.html";
	@Before

	public void setup() 
		{
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get(baseurl);
	}

	@Test
	public void test() 
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		//Thread.sleep(1000);
		a.accept();
		//a.dismiss(); -to cancel alert
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("vd");
		
		
	}

}