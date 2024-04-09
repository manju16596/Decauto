package TestNG;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Copypastepgm {
	public class Rediffpgm {
		ChromeDriver driver;
		String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
		@BeforeTest

		public void setup() 
			{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get(baseurl);
			}
		@Test
		public void test1()
		{
WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
fullname.sendKeys("abc");
WebElement redifid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
Actions act=new Actions(driver);
act.keyDown(fullname, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
act.keyDown(redifid,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
act.perform();

		}

	}
}
