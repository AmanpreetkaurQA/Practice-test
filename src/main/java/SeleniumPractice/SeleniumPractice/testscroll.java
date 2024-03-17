package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testscroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.khanacademy.org/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[text()='Give today']"));
		
		WebElement pop=driver.findElement(By.xpath("//div[@class='ot-sdk-container ot-scrollbar']/div[1]//button[text()='Accept All Cookies']"));
		pop.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; //downcasting
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).click().perform();
		//ele.click();

	}

}
