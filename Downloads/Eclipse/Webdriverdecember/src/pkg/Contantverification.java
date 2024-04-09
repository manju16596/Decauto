package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contantverification {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
String src=driver.getPageSource();
if(src.contains("Gmail"))
{
	System.out.println("contains gmail text");
	
}
else
{
	System.out.println("not contain");
}
	}

}
