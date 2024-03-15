package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InputFromFile extends BaseClass {
	
	@Test(priority=1)
	
	public void validAccountDetails()
	{
		WebElement enterEmail=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='email']"));
		WebElement password=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='password']"));
		WebElement LoginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		
		enterEmail.sendKeys(properties.getProperty("validUserName"));
		password.sendKeys(properties.getProperty("validPassword"));
		LoginButton.click();
	}
	
	@Test(priority=2)
	
	public void InvalidAccountDetails()
	{
		WebElement enterEmail=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='email']"));
		WebElement password=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='password']"));
		WebElement LoginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		
		enterEmail.sendKeys(properties.getProperty("invalidUserName"));
		password.sendKeys(properties.getProperty("invalidPassword"));
		LoginButton.click();
	}

}
