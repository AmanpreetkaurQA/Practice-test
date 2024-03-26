package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JSexample1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://app.opswire.ai/sign-in");
		driver.manage().window().maximize();
		
		WebElement enterEmail=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='email']"));
		enterEmail.click();
		JavascriptExecutor js=(JavascriptExecutor)driver; //downcasting
		js.executeScript("arguments[0].value='amanpreet@logiciel.io';", enterEmail);
		
		WebElement password=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='password']"));
		password.click();
		JavascriptExecutor js1=(JavascriptExecutor)driver; //downcasting
		js.executeScript("arguments[0].value='owner123';", password);
		
		Thread.sleep(1000);
		WebElement LoginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
		LoginButton.submit();
		
	}

}
