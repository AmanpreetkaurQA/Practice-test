package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://app.opswire.ai/alert-manager");
		WebElement element= driver.findElement(By.xpath("(//table[@class='pw-table table']/tbody//tr[2])[1]"));
		
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.quit();
		

	}

}
