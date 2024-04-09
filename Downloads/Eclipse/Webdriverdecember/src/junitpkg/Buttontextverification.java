package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontextverification {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?ForName=user_details";
	@Before

	public void setup() 
		{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	
		}
	@Test
	public void buttontest()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		String buttontext=button.getAttribute("value");
		if(buttontext.equals("checkavialability"))
			
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}

	
