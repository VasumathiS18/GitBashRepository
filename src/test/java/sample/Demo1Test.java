package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//pull back
public class Demo1Test {
	WebDriver driver=null;
	@Test
public void d1test()
{
	System.out.println("Hi....");
	String BROWSER=System.getProperty("browser");
	String URL=System.getProperty("url");
	
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		driver= new ChromeDriver();
	}
	if(BROWSER.equalsIgnoreCase("firefox"))
	{
		driver= new FirefoxDriver();
	}
	else
	{
		driver=new ChromeDriver();
	}
	driver.get(URL);
}
}
