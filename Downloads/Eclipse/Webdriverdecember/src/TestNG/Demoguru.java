package TestNG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	@Before

	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
		
		@Test
		public void test() {
			WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
			Actions act =new Actions(driver);
			act.contextClick(right).perform();
			driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
			driver.switchTo().alert().accept();
			WebElement doublecl=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			act.doubleClick(doublecl).perform();
			Alert a=driver.switchTo().alert();
			System.out.println("alerttext="+a.getText());
			
		}
	}
