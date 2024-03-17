package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJavaScript {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement element1= driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel '] "));
		element1.click();
		WebElement elemnet2= driver.findElement(By.xpath("//*[contains(text(),'click the button to display a confirm box ')] "));
		elemnet2.click();
		Thread.sleep(3000); 
		Alert alert=driver.switchTo().alert(); 
		alert.dismiss();
		driver.quit();

	}

}
