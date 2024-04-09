package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {
WebDriver driver; 

@BeforeTest
public void beforetest() {
	driver=new ChromeDriver();
	
}
@Test
public void main() throws IOException, Exception
{
	
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	Thread.sleep(3000);
	//Runtime.getRuntime().exec("C:\\Users\\DELL\\Downloads\\autoit-v3-setup\\T12.exe");
	
	fileupload("\"C:\\Users\\DELL\\Downloads\\java material.pdf\"");
}
public void fileupload(String p) throws AWTException {
	StringSelection strSelection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	
	Robot robot = new Robot();
	
	robot.delay(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
}

}
