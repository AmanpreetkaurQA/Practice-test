package SeleniumPractice.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 									//Browser launch
		driver.get("https://www.google.co.in/");  								// hit the URL
		driver.manage().window().maximize();   									//browser maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 		// waits
		driver.navigate().to("https://www.flipkart.com/");  					// navigate to new URL
		driver.navigate().refresh();                        					//refresh the page
		driver.manage().window().minimize();               						//browser minimize
		driver.manage().window().maximize();               						//browser maximize
		driver.navigate().back();                          						//Navigate to the previous URL
		driver.navigate().to("https://www.amazon.in/");    						// hit or navigate to the new URL
		driver.quit();                                    						// close the broserdriver instance
		

	}

}
