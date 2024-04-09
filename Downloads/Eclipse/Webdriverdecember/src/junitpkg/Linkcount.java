package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before

	public void setup() 
		{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	}

	@Test
	public void linkcounttest()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+li.size());
	
		
		
		
		
	   for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verify(link);
			//String linktext=ele.getText();
			//System.out.println(link +"-------------------"+linktext);
		}

	}
	    private  void verify(String link) {
	    	try
	    	{
	    URL u=new URL(link);
	    HttpURLConnection con=(HttpURLConnection)u.openConnection();
	    con.connect();
	    if(con.getResponseCode()==200)
	    {
	    	System.out.println(link+"----Response code is 200");
	    }
	    else if(con.getResponseCode()==404)
	    {
	    	System.out.println(link+"----response code is 404");
	    }
	    
	    
	    }catch (Exception e)
	    
	    {
	    	System.out.println("null");
	    }
}
}
	    
	    
	    	
	    


