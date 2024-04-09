package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshortpgm {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before

	public void setup() 
		{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	}

	@Test
	public void screenshorttest() throws IOException, InterruptedException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("F://Screenshort//screenshort1.png"));
		
		WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		File src1=ele.getScreenshotAs(OutputType.FILE);
		FileHandler.copy( src1,new File("./Screenshort/searchbutton.png"));
	}

}
