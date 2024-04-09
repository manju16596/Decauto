package junitpkg;

import java.time.Month;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffpgm {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
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
		
		
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayelement);
		day.selectByValue("04");
		WebElement monthele=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(monthele);
		month.selectByVisibleText("JAN");
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select(yearelement);
		year.selectByValue("2024");
	}
	

} 
	

