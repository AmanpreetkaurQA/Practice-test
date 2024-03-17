package SeleniumPractice.SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footerlinksclick {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://magento-demo.lexiconn.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> links=driver.findElements(By.xpath("//*[@class='promos']//a"));
		for(WebElement element:links)
		{ 
			//links = driver.findElements(By.xpath("//*[@class='promos']//a"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		    wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			String pageTitle=driver.getTitle();
			System.out.println(pageTitle);
			driver.navigate().back();
			//links = driver.findElements(By.xpath("//*[@class='promos']//a"));
			
		}
		//
		String url=driver.getCurrentUrl();
		URL link=new URL(url);
		HttpURLConnection httpURLConnection= (HttpURLConnection )link.openConnection();
		httpURLConnection.connect();
		System.out.println("Staus code"+ httpURLConnection.getResponseCode() );
		
			driver.quit();
	}
	

}
