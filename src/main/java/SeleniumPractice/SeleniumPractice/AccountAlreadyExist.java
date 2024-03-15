package SeleniumPractice.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccountAlreadyExist {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://app-qa.opswire.ai/sign-up");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// To enter the values in the First name input field
				WebElement firstName= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				firstName.sendKeys("amanpreet");
				Thread.sleep(2000); 
				
				// To enter the values in the Last name input field and clear the value and again enter the new value
				WebElement lastName= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				lastName.sendKeys("K");
				
				
				
				// To enter the values in the email input field
				WebElement emailId= driver.findElement(By.xpath("//input[@placeholder='Email']"));
				emailId.sendKeys("amanpreet+574128@logiciel.io");
				
				
				// To enter the values in the Password input field
				WebElement Password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
				Password.sendKeys("owner123");
				
				
				// To enter the values in the Confirm Password input field
				WebElement confirmPassword= driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
				confirmPassword.sendKeys("owner123");
				
				
				// Click on the checkbox of the Terms of service and privacy policy
				WebElement checkbox= driver.findElement(By.xpath("//input[@formcontrolname='agreement']"));
				checkbox.click();
				
				
				//To click on the Sign Up button
				
				WebElement buttonOfSignUp= driver.findElement(By.name("submit"));
				buttonOfSignUp.click();
				
				// To print the errormessage
				WebElement errorMessage= driver.findElement(By.xpath("//*[@class='response-msg']"));
				System.out.println(errorMessage.getText());
				
				//To click Reset it here link
				
				WebElement resetLink= driver.findElement(By.linkText("reset it here"));
				resetLink.click();
				
				
				
				

	}

}
