package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignIn {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://app-qa.opswire.ai/sign-in");
		driver.manage().window().maximize();
		
		//To print LogIN text 
		WebElement Pagetitle=driver.findElement(By.xpath("//*[text()='Log In']"));
		System.out.println(Pagetitle.getText());
		
		// To print the subheading under the title Log IN
		WebElement subHeading= driver.findElement(By.xpath("//*[@class='widget-content']/child::p[@class='account-info']"));
		System.out.println(subHeading.getText());
		
		//To click on Create an account link
		WebElement CreateAnAccountLink =driver.findElement(By.xpath("//*[text()='Create your account']"));
		CreateAnAccountLink.click();
		Thread.sleep(1000);
		
		// To move back to log in page
		driver.navigate().back();
		
		// To click on Login button without entering the email and password
		
		WebElement loginButton=driver.findElement(By.xpath("//input[@name='submit']"));
		loginButton.click();
		
		Thread.sleep(500);
		
		// To enter the email address in the email input field
		WebElement enterEmail=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='email']"));
		enterEmail.sendKeys("amanpreetlogiciel.io");
		Thread.sleep(500);
	
		// To enter the password in the password input field
		WebElement password=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='password']"));
		password.sendKeys("owner123");
		
		//To click on Login Button
		WebElement LoginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
		LoginButton.click();
		Thread.sleep(1000);
		
		// To print the validation error message
		WebElement errorInEmail=driver.findElement(By.xpath("//div[text()='Email must be a valid email address']"));
		System.out.println(errorInEmail.getText());
		
		// To erase the incorrect email and enter the correct email
		enterEmail.clear();
		Thread.sleep(1000);
		enterEmail.sendKeys("amanpreet@logiciel.io");
		
		// To click on Forgot password link
		WebElement forgotPass=driver.findElement(By.xpath("//*[text()='Forgot Password?']"));
		forgotPass.click();
		
		//To print the Forgot Password text 
		WebElement pagetitle= driver.findElement(By.xpath("//*[text()='Forgot Password']"));
		System.out.println(pagetitle.getText());
		
		// To print the sub heading under the Forgot Password text
		WebElement pagesubtitle= driver.findElement(By.xpath("//*[contains(text(),'Just enter the email address')]"));
		System.out.println(pagesubtitle.getText());
		
		// To enter the email id in the email input field on forgot password page
		
		WebElement forgotEmail=driver.findElement(By.xpath("//input[@formcontrolname='email']"));
		forgotEmail.sendKeys("amanpreet@logiciel.io");
		Thread.sleep(500);
		
		// To click on Send link button on forgot password page
		WebElement sendLinkButton=driver.findElement(By.name("submit"));
		sendLinkButton.click();
		
		//driver.close();
	

	}

}
