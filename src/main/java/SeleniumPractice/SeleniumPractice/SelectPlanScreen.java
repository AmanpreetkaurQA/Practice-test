package SeleniumPractice.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SelectPlanScreen {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-qa.opswire.ai");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// To enter the email address in the email input field
				WebElement enterEmail=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='email']"));
				enterEmail.sendKeys("amanpreet+574@logiciel.io");
				Thread.sleep(500);
			
				// To enter the password in the password input field
				WebElement password=driver.findElement(By.xpath("//*[@class='form-group']/child::input[@formcontrolname='password']"));
				password.sendKeys("owner123");
				
				
				WebElement fullboat=driver.findElement(By.xpath("//div[@class='intercom-dfosxs edrs4yi0']"));
				fullboat.click();
				fullboat.click();
				Thread.sleep(1000);
				//To click on Login Button
				WebElement LoginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
				LoginButton.click();
				
				// To print the name of the planheading
				/*
				 * WebElement planHeading=
				 * driver.findElement(By.xpath("//*[text()='Membership Plan']"));
				 * System.out.println(planHeading.getText());
				 */
				
				// To print the confirmation message under plan heading
				
				/*
				 * WebElement planConfirmationMessage= driver.findElement(By.
				 * xpath("//*[contains(text(),'Confirm if you want a Monthly')]"));
				 * System.out.println(planConfirmationMessage.getText());
				 */
				
				/*
				 * //To click on annual tab WebElement annualTab= driver.findElement(By.
				 * xpath("//li[contains(@class, 'nav-item') and contains(@class, 'active')]/following-sibling::li"
				 * )); annualTab.click();
				 */
				
				/*
				 * // To click on monthly tab WebElement monthlyTab = driver.findElement(By.
				 * xpath("//li[contains(@class, 'nav-item') and contains(@class, 'active')]/preceding-sibling::li"
				 * )); monthlyTab.click();
				 */
				
				/*
				 * // To print the name of the plan OpsWire AI Membership WebElement planName=
				 * driver.findElement(By.
				 * xpath("//*[contains(@class, 'tab-pane') and contains(@class, 'active')]/div/div/child::div/h4"
				 * )); System.out.println(planName.getText());
				 */
				
				/*
				 * // to print the $199Save 50% Off First Month WebElement
				 * discount=driver.findElement(By.
				 * xpath("//*[contains(@class, 'tab-pane') and contains(@class, 'active')]/div/div/child::div/h3[@class='strike-price']"
				 * )); System.out.println(discount.getText());
				 */
				
				// to click on the Select paid Plan button
				WebElement selectPaidPlan= driver.findElement(By.xpath("//a[contains(text(), 'Select Paid Plan')]"));
				selectPaidPlan.click();
				
				/*
				 * //To print the text how many users do you have?
				 * 
				 * WebElement usercounttext=driver.findElement(By.
				 * xpath("//*[contains(text(),'How many users do')]"));
				 * System.out.println(usercounttext.getText());
				 */
				
				
				/*
				 * WebElement crossbutton=driver.findElement(By.
				 * xpath("//div[@class='intercom-ap4nut e13xul2n3']//div[@aria-label='Dismiss']"
				 * )); crossbutton.click();
				 */
				
				// To click on proceed button
				WebElement selectProceed= driver.findElement(By.xpath("//button[text()=' Proceed ']"));
				selectProceed.click();
				
				// To enter the card holder name
				WebElement cardHolder= driver.findElement(By.xpath("//input[@placeholder='Enter Cardholder Name']"));
				cardHolder.sendKeys("APK");
				
				// To enter the card number
				
				WebElement cardNumber=driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
				cardNumber.sendKeys("4111111111111111");
				 
				
				// To enter the Expiration date
				WebElement expiryDate= driver.findElement(By.xpath("//input[@placeholder='MM / YY']"));
				expiryDate.sendKeys("12/29");
						
				// To enter the CVV
				WebElement cvv= driver.findElement(By.xpath("//input[@placeholder='CVV']"));
				cvv.sendKeys("111");
				
				// To click on Pay Now button
				
				WebElement PayButton= driver.findElement(By.xpath("//*[text()='Pay Now']"));
				PayButton.click();
				
				/*
				 * //WebElement tabElement=driver.findElement(By.
				 * xpath("//ul[contains(@class, 'nav') and contains(@class, 'nav-tabs')]")); //
				 * WebElement tabElement=driver.findElement(By.
				 * xpath("//li[contains(@class, 'nav-item') and contains(@class, 'active')]"));
				 * WebElement tabElement=driver.findElement(By.className("tab-container"));
				 * //System.out.println(tabElement.getText());
				 * 
				 * 
				 * List<WebElement> tabs =tabElement.findElements(By.tagName("nav nav-tabs"));
				 * 
				 * boolean firstTab = true; for (WebElement tab : tabs) { if(firstTab) {
				 * System.out.println("First Tab: " + tab.getText()); } else { tab.click();
				 * System.out.println("Other Tab: " + tab.getText()); } // Click on the tab if
				 * needed firstTab = false; }
				 */
				 

}
}
