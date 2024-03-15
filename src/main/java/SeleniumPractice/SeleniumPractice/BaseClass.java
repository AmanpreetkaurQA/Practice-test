package SeleniumPractice.SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver= new ChromeDriver();
	Properties properties=new Properties();
	FileInputStream fileinputstream;
	
	
	public void getData() throws Exception
	{
		fileinputstream=new FileInputStream("./InputFile/config.properties");
		properties.load(fileinputstream);
	}
	
	@BeforeTest
	public void launchBrowser() throws Exception
	{
		getData();
		String url= properties.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void closeBrowser() throws Exception
	{ 
		Thread.sleep(5000);
		fileinputstream.close();
		driver.close();
	}

}
