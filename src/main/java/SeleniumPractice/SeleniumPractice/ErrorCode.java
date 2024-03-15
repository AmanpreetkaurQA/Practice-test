package SeleniumPractice.SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorCode {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.seleniumeasy.com/";
		driver.get(url);
		
		URL link=new URL(url);
		HttpURLConnection httpURLConnection= (HttpURLConnection )link.openConnection();
		httpURLConnection.connect();
		System.out.println("Staus code"+ httpURLConnection.getResponseCode() );
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement link1=driver.findElement(By.xpath("//a[text()='Selenium Tutorials']"));
		link1.click();
		if(httpURLConnection.getResponseCode()>=400) {
			System.out.println(url+"Not working"+httpURLConnection.getResponseMessage());
		}
		else {
			System.out.println(url+"WORKING");
		}
		
		
	}

}
