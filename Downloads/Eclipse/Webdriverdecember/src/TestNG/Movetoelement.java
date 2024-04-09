package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Movetoelement {
	WebDriver driver;
	String baseurl1="https://www.ebay.com";
	@BeforeTest
	public void setup()
	{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get(baseurl1);

	}
	@Test
	public void test()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//driver.manage().timeout().implicitylyWait.ofseconds(20));
		Actions act=new Actions(driver);
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]"));
		act.moveToElement(electronics).perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"vl-flyout-nav\\\"]/ul/li[3")));
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	
	}
}
	

