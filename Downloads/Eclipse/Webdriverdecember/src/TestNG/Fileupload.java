package TestNG;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Fileupload {
	public class Demoguru {
		ChromeDriver driver;
		String baseurl="https://demo.guru99.com/test/upload";
		@BeforeTest

		public void setup() 
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
	}
}
			


