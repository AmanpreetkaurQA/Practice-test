package SeleniumPractice.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printfooterlinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.seleniumeasy.com/ ");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//footer[@class='footer']//a"));
		for(WebElement element:links)
		{
		
			String name=element.getText();
			System.out.println(name);
		}
		
		driver.quit();
	}

}
