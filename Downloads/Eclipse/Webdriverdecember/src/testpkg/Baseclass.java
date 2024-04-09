package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baseclass {
	public static WebDriver driver;
	
	@Test
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

}
}
