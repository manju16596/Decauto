package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExercise {
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/login";
	@Before

	public void setup() 
		{
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get(baseurl);
	}

	@Test
	public void  titleverification() {
	}
		@Test
		public void linkcounttest()
		{
			List<WebElement> li=driver.findElements(By.tagName("a"));
			System.out.println("total no of links="+li.size());
			
			
			
			
		    for(WebElement ele:li)
			{
				String link=ele.getAttribute("href");
				String linktext=ele.getText();
				System.out.println(link +"-------------------"+linktext);
			}}
		@Test
		public void userverification()
		{
			driver.findElement(By.xpath("/html/body")).click();
		}
		@Test
		public void signupbuttontext ()
		{
			driver.findElement(By.xpath("/html/body")).click();
			String actualtitle=driver.getTitle();
			String exp="signup";
			if(actualtitle.equalsIgnoreCase(exp))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
				
			}

		}

	

			
		
		@Test
		public void signupbutton()
		{
			driver.findElement(By.xpath("/html/body")).click();
		
			
		}

		public void isEnabled() {
			driver.findElement(By.xpath("/html/body")).click();
			driver.findElement (By.cssSelector("signup")).isEnabled();
			
			
		}

			
			
		}
		
			
		
	
		
	


