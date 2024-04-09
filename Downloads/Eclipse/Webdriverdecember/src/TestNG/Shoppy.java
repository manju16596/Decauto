package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shoppy {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.shoppy.sg/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.xpath("//html/body/div/[3]/div[2]/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.id("customer_email")).sendKeys("manjuachu165@gmail.com");
	    driver.findElement(By.id("customer_password")).sendKeys("manjyht");
	    driver.findElement(By.xpath("//*[@id=\"customer_login\"]/input[5]")).click();
	    Thread.sleep(2000);
	    String expectedURL="https://shoppy.sg/account";
	    String currentURL=driver.getCurrentUrl();
	    
	    if(expectedURL.contains(currentURL)) {
	    	System.out.println("Login successfull");
	    }
	    else
	    {
	    	System.out.println("Login unsuccessfull");
	    }
						
		
	}
	
	

}
