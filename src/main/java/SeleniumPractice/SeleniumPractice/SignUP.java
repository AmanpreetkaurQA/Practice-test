package SeleniumPractice.SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		// To launch the URL
		driver.get("https://app-qa.opswire.ai/sign-up");
		driver.manage().window().maximize();
		
		// To get the URL of the page
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		// To get the title of the page
		String PageTitle= driver.getTitle();
		System.out.println(PageTitle);
		
		// To get the page source of the page
		String PageSource= driver.getPageSource();
		System.out.println(PageSource);
		
		//To print the title of the sign up page
		WebElement tiileOfPage=driver.findElement(By.xpath("//div[@class='col-md-7 left-wrapper']/child::section[@class='widget-content']/child::h2"));
		System.out.println(tiileOfPage.getText());
		
		//To print the sub heading under the title of the sign up page
		WebElement textUnderTitle=driver.findElement(By.xpath("//*[@class='col-md-7 left-wrapper']/child::section[@class='widget-content']/child::p[@class='account-info']"));
		System.out.println(textUnderTitle.getText());
		Thread.sleep(2000); 
		
		//To click on the Sign In link present on the sign up page
		WebElement clickSignin= driver.findElement(By.className("sign-in-link"));
		clickSignin.click();
		Thread.sleep(2000); 
		
		// Move back to sign up page
		driver.navigate().back();
		Thread.sleep(2000); 
		
		//To get the text of the Sign up with google button
		WebElement textOfButton=driver.findElement(By.xpath("//*[text()=' Sign Up with Google']"));
		System.out.println(textOfButton.getText());
		
		// To get the text under the Sign up with google button
		WebElement text=driver.findElement(By.xpath("//*[contains(text(), 'By signing up with Google' )]"));
		System.out.println(text.getText());
		
		//To click on Terms of Service link
		 String originalWindowHandle = driver.getWindowHandle();   //Get the current window handle
		  WebElement TermsOFServiceLink=driver.findElement(By.xpath("//*[@class='terms-and-policy']/span/child::a[@href='https://opswire.ai/terms-of-service/']")); 
		  TermsOFServiceLink.click();                             //Click on the link that opens in a new tab
		  Set<String> windowHandles = driver.getWindowHandles();  //Get all window handles
		  
		  for (String windowHandle : windowHandles)               //Switch back to the original tab
		  { 
			  if(!windowHandle.equals(originalWindowHandle)) 
			  { 
				  // Switch to the tab with the
				  driver.switchTo().window(originalWindowHandle);
				  break; 
			  } 
			  }
		  Thread.sleep(2000);
		
		//To click on Privacy of Policy link
		String originalWindowHandleP = driver.getWindowHandle();   //Get the current window handle
		WebElement privacyOfPolicyLink=driver.findElement(By.xpath("//*[@class='terms-and-policy']/span/child::a[@href='https://opswire.ai/privacy-policy/']"));
		privacyOfPolicyLink.click();
		Set<String> windowHandlesP = driver.getWindowHandles();  //Get all window handles
		  
		  for (String windowHandle : windowHandlesP)               //Switch back to the original tab
		  { 
			  if(!windowHandle.equals(originalWindowHandleP)) 
			  { 
				  // Switch to the tab with the
				  driver.switchTo().window(originalWindowHandleP);
				  break; 
			  } 
			  }
		
		Thread.sleep(2000); 
		
		//To get the text of separator line between Signup with google and sign up with email
		WebElement separator=driver.findElement(By.xpath("//p[text()='or with email']"));
		System.out.println(separator.getText());
		
		// To enter the values in the First name input field
		WebElement firstName= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("amanpreet");
		Thread.sleep(2000); 
		
		// To enter the values in the Last name input field and clear the value and again enter the new value
		WebElement lastName= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("K");
		Thread.sleep(500);
		lastName.clear();
		Thread.sleep(500);
		lastName.sendKeys("Kaur");
		
		// To enter the values in the email input field
		WebElement emailId= driver.findElement(By.xpath("//input[@placeholder='Email']"));
		emailId.sendKeys("amanpreet+57412@logiciel.io");
		Thread.sleep(2000);
		
		// To enter the values in the Password input field
		WebElement Password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("owner123");
		Thread.sleep(2000);
		
		// To enter the values in the Confirm Password input field
		WebElement confirmPassword= driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
		confirmPassword.sendKeys("owner123");
		Thread.sleep(2000);
		
		// Click on the checkbox of the Terms of service and privacy policy
		WebElement checkbox= driver.findElement(By.xpath("//input[@formcontrolname='agreement']"));
		checkbox.click();
		Thread.sleep(2000);
		
		// To get the text of checkbox for privacy policy
		WebElement textOfPrivacyPolicy=driver.findElement(By.xpath("//*[@class='form-group form-options-row']/child::label[contains(text(), ' I agree with ')]"));
		System.out.println(textOfPrivacyPolicy.getText());
		
		// To click on the Sign Up button
		
		WebElement buttonOfSignUp= driver.findElement(By.name("submit"));
		buttonOfSignUp.click();
		
		
		//driver.quit();
	

	}

}
