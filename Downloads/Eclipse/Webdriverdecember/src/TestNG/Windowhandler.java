package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	WebDriver d;
	
	@BeforeTest
	public void beforetest() {
		d = new ChromeDriver();
		
	}
	@Test
	public void test() throws InterruptedException{
		d.get("https://demo.guru99.com/popup.php");
		 String parentWindow=d.getWindowHandle();
		 
		 System.out.println("parent window Title "+d.getTitle());
		 d.findElement(By.xpath("html/body/p/a")).click();
		 
		 
		Set<String> allwindowHandles = d.getWindowHandles();
		 
		 for(String handle : allwindowHandles) {
			 
			 
			 if (!handle.equalsIgnoreCase(parentWindow)) {
				 d.switchTo().window(handle);
				 d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("mju@gmailcom");
				 
				 d.close();
			 }
			 d.switchTo().window(parentWindow);
			 }
		 }
	}
	
	


